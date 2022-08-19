package com.jornaldio.jornalapi.controller.mapper;

import com.jornaldio.jornalapi.controller.dto.AuthorCreateDTO;
import com.jornaldio.jornalapi.controller.dto.AuthorDTO;
import com.jornaldio.jornalapi.model.Author;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class AuthorMapper {

    private static final ModelMapper MODEL_MAPPER = new ModelMapper();

    public AuthorDTO toAuthorDTO(Author author){
        return MODEL_MAPPER.map(author, AuthorDTO.class);
    }

    public List<AuthorDTO> toAuthorDTOList(List<Author> authorList) {
        return authorList.stream().map(this::toAuthorDTO).collect(Collectors.toList());
    }

    public Author toAuthor(AuthorDTO dto) {
        return MODEL_MAPPER.map(dto, Author.class);
    }

    public Author toAuthorCreate(AuthorCreateDTO dto) {
        return MODEL_MAPPER.map(dto, Author.class);
    }
}
