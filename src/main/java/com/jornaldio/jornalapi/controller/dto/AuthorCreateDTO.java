package com.jornaldio.jornalapi.controller.dto;

import com.jornaldio.jornalapi.model.Page;
import com.jornaldio.jornalapi.model.Post;

import java.util.List;

public class AuthorCreateDTO {
    private String name;
    private String role;
    private String email;
    private List<Page> authorPages;
    private List<Post> authorPosts;

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
}
