package com.hgp.myproject.core.dto;

import java.io.Serializable;

/**
 * Created by pgsett on 06/04/2016.
 */
public class ProductsDTO implements Serializable {

    private Long id;
    private String description;
    private Double prise;
    private CategoryDTO category;

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

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

}
