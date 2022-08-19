package com.jornaldio.jornalapi.controller.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.jornaldio.jornalapi.model.Page;
import com.jornaldio.jornalapi.model.Post;

import java.time.LocalDateTime;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AuthorDTO {
    private String id;
    private String name;
    private String role;
    private String email;
    private List<Page> authorPages;
    private List<Post> authorPosts;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mn:ss ")
    private LocalDateTime created;
    @JsonFormat(pattern = "dd/MM/yyyy HH:mn:ss ")
    private LocalDateTime modified;

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
