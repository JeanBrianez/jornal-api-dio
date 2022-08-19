package com.jornaldio.jornalapi.model;

import java.time.LocalDateTime;
import java.util.List;

public class Author {
    private String id;
    private String name;
    private String role;
    private String email;
    private List<Page> authorPages;
    private List<Post> authorPosts;
    private LocalDateTime created;
    private LocalDateTime modified;

    public Author(String id, String name, String role, String email, List<Page> authorPages, List<Post> authorPosts, LocalDateTime created, LocalDateTime modified) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.email = email;
        this.authorPages = authorPages;
        this.authorPosts = authorPosts;
        this.created = created;
        this.modified = modified;
    }

    public Author() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Page> getAuthorPages() {
        return authorPages;
    }

    public void setAuthorPages(List<Page> authorPages) {
        this.authorPages = authorPages;
    }

    public List<Post> getAuthorPosts() {
        return authorPosts;
    }

    public void setAuthorPosts(List<Post> authorPosts) {
        this.authorPosts = authorPosts;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getModified() {
        return modified;
    }

    public void setModified(LocalDateTime modified) {
        this.modified = modified;
    }
}
