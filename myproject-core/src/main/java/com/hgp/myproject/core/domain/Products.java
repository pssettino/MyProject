package com.hgp.myproject.core.domain;

import com.hgp.myproject.core.dto.CategoryDTO;
import com.hgp.myproject.core.dto.ProductsDTO;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pgsett on 06/04/2016.
 */
@Entity
@Table(name = "product")
public class Products implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "productId")
    private Long id;
    private String description;
    private Double prise;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categoryFK", referencedColumnName = "id")
    private Category category;

    public Products() {
    }

    public Products(ProductsDTO productsDTO) {
        this.id = productsDTO.getId();
        this.description = productsDTO.getDescription();
        this.prise = productsDTO.getPrise();
        CategoryDTO catDTO = productsDTO.getCategory();
        if (catDTO != null) {
            this.category = new Category(productsDTO.getCategory());
        } else {
            this.category = new Category();
        }
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

    public Double getPrise() {
        return prise;
    }

    public void setPrise(Double prise) {
        this.prise = prise;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        return id.equals(products.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
