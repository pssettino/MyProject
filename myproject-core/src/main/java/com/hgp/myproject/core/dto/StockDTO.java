package com.hgp.myproject.core.dto;

import java.io.Serializable;

/**
 * Created by PGSETT on 21/04/2016.
 */
public class StockDTO implements Serializable {
    private Long id;
    private ProductsDTO product;
    private Integer quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProductsDTO getProduct() {
        return product;
    }

    public void setProduct(ProductsDTO product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
