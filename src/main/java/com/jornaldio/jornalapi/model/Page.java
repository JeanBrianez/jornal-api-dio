package com.jornaldio.jornalapi.model;

import java.time.LocalDateTime;
import java.util.List;

public class Page {
    private Long id;
    private String name;
    private String category;
    private List<Post> pagePosts;
    private LocalDateTime created;
    private LocalDateTime modified;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Post> getPagePosts() {
        return pagePosts;
    }

    public void setPagePosts(List<Post> pagePosts) {
        this.pagePosts = pagePosts;
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
