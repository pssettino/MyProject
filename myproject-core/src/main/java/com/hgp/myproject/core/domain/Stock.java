package com.hgp.myproject.core.domain;

import com.hgp.myproject.core.dto.StockDTO;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by PGSETT on 21/04/2016.
 */
@Entity
@Table(name = "stock")
public class Stock implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "stockId")
    private Long id;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productFK", referencedColumnName = "productId")
    private Products product;
    private Integer quantity;

    public Stock() {
    }

    public Stock(StockDTO stockDTO) {
        this.id = stockDTO.getId();
        this.product = new Products(stockDTO.getProduct());
        this.quantity = stockDTO.getQuantity();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stock stock = (Stock) o;

        return id.equals(stock.id);

    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", product=" + product +
                ", quantity=" + quantity +
                '}';
    }
}
