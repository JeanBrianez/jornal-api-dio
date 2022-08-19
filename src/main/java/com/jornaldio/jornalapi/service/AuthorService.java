package com.jornaldio.jornalapi.service;

import com.jornaldio.jornalapi.model.Author;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class AuthorService {
    private static Map<String, Author> authorMap = new HashMap<>();
    static {
        var id = getUUID();
        var id1 = getUUID();
        Author author = new Author(id, "Jean Brianez", "TI", "jean@mail", null, null, LocalDateTime.now(), null);
        Author author1 = new Author(id1, "Maria Silva", "TI", "maria@mail", null, null, LocalDateTime.now(), null);
        authorMap.put(id, author);
        authorMap.put(id1, author1);
    }

    public List<Author> findAll() {
        return authorMap.values().stream().collect(Collectors.toList());
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-","");
    }

    public Author findById(String id) {
        return authorMap.get(id);
    }

    public Author create(Author authorCreate) {
        String uuid = getUUID();
        authorCreate.setId(uuid);
        authorCreate.setCreated(LocalDateTime.now());
        authorMap.put(uuid, authorCreate);
        return authorCreate;
    }
}
