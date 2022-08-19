package com.jornaldio.jornalapi.model;

import java.time.LocalDateTime;
import java.util.List;

public class Post {
    private Long id;
    private String name;
    private Author postAuthor;
    private String content;
    private List<String> images;
    private List<Page> postPages;
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

    public Author getPostAuthor() {
        return postAuthor;
    }

    public void setPostAuthor(Author postAuthor) {
        this.postAuthor = postAuthor;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<Page> getPostPages() {
        return postPages;
    }

    public void setPostPages(List<Page> postPages) {
        this.postPages = postPages;
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
