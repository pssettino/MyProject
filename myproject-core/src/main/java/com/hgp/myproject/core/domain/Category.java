package com.hgp.myproject.core.domain;

import com.hgp.myproject.core.dto.CategoryDTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by pgsett on 06/04/2016.
 */
@Entity
@Table(name="category")
public class Category implements Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String description;

    public Category() {
    }

    public Category(CategoryDTO categoryDTO) {
        this.id = categoryDTO.getId();
        this.description = categoryDTO.getDescription();
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        return id.equals(category.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
