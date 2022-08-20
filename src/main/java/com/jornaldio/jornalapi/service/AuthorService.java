package com.jornaldio.jornalapi.service;

import com.jornaldio.jornalapi.exception.AuthorNotFoundException;
import com.jornaldio.jornalapi.model.Author;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    private static Map<String, Author> authorMap = new HashMap<>();

    public List<Author> findAll() {
        return authorMap.values().stream().collect(Collectors.toList());
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }

    public Author findById(String id) {
        Author author = authorMap.get(id);
        if (author == null) {
            throw new AuthorNotFoundException(id);
        }
        return author;
    }

    public Author create(Author authorCreate) {
        String uuid = getUUID();
        authorCreate.setId(uuid);
        authorCreate.setCreated(LocalDateTime.now());
        authorMap.put(uuid, authorCreate);
        return authorCreate;
    }

    public Author update(String id, Author authorCreate) {
        Author author = findById(id);
        author.setName(authorCreate.getName());
        author.setRole(authorCreate.getRole());
        author.setEmail(authorCreate.getEmail());
        author.setModified(LocalDateTime.now());
        authorMap.replace(id, author);
        return author;
    }

    public void delete(String id) {
        findById(id);
        authorMap.remove(id);
    }
}
