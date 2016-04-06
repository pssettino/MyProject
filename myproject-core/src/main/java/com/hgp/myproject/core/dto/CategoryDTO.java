package com.hgp.myproject.core.dto;

import java.io.Serializable;

/**
 * Created by pgsett on 06/04/2016.
 */
public class CategoryDTO implements Serializable {

    private Long id;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
