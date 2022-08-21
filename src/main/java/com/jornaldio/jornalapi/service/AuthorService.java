package com.jornaldio.jornalapi.service;

import com.jornaldio.jornalapi.exception.AuthorNotFoundException;
import com.jornaldio.jornalapi.model.Author;
import com.jornaldio.jornalapi.repository.IAuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class AuthorService {

    private final IAuthorRepository authorRepository;

    public AuthorService(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Author findById(String id) {
        return authorRepository.findById(id).orElseThrow(
                () -> new AuthorNotFoundException(id));
    }

    @Transactional
    public Author create(Author authorCreate) {
        String uuid = getUUID();
        authorCreate.setId(uuid);
        authorCreate.setCreated(LocalDateTime.now());
        authorRepository.save(authorCreate);
        return authorCreate;
    }

    @Transactional
    public Author update(String id, Author authorCreate) {
        Author author = findById(id);
        author.setName(authorCreate.getName());
        author.setRole(authorCreate.getRole());
        author.setEmail(authorCreate.getEmail());
        author.setModified(LocalDateTime.now());
        authorRepository.save(author);
        return author;
    }

    @Transactional
    public void delete(String id) {
        findById(id);
        authorRepository.deleteById(id);
    }
}
