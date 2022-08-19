package com.jornaldio.jornalapi.controller;

import com.jornaldio.jornalapi.controller.dto.AuthorCreateDTO;
import com.jornaldio.jornalapi.controller.dto.AuthorDTO;
import com.jornaldio.jornalapi.controller.mapper.AuthorMapper;
import com.jornaldio.jornalapi.model.Author;
import com.jornaldio.jornalapi.service.AuthorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
@Api(tags = "Author Controller")
public class AuthorController {

    private final AuthorService authorService;
    private final AuthorMapper authorMapper;

    public AuthorController(AuthorService authorService, AuthorMapper authorMapper) {
        this.authorService = authorService;
        this.authorMapper = authorMapper;
    }

    @GetMapping
    @ApiOperation("Find all authors")
    public ResponseEntity<List<AuthorDTO>> findAll() {
        List<Author> authorList = authorService.findAll();
        List<AuthorDTO> result = authorMapper.toAuthorDTOList(authorList);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find author by ID")
    public ResponseEntity<AuthorDTO> findById(@PathVariable String id) {
        Author author = authorService.findById(id);
        AuthorDTO result = authorMapper.toAuthorDTO(author);
        return ResponseEntity.ok(result);
    }

    @PostMapping
    @ApiOperation("Create Author")
    public ResponseEntity<AuthorDTO> create(@RequestBody AuthorCreateDTO dto) {
        var authorCreate = authorMapper.toAuthorCreate(dto);
        var author = authorService.create(authorCreate);
        var result = authorMapper.toAuthorDTO(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }
}
