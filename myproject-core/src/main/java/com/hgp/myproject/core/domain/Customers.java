package com.hgp.myproject.core.domain;

import com.hgp.myproject.core.dto.CustomersDTO;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pgsett on 08/03/2016.
 */

@Entity
@Table(name="customer")
public class Customers implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "customerId")
    private Long id;
    private String name;
    private String lastName;
    private String telephone;
    private String address;
    private String email;

    public Customers() {
    }

    public Customers(CustomersDTO customersDTO) {
        this.id = customersDTO.getId();
        this.name = customersDTO.getName();
        this.lastName = customersDTO.getLastName();
        this.telephone = customersDTO.getTelephone();
        this.address = customersDTO.getAddress();
        this.email = customersDTO.getEmail();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        if (!id.equals(customers.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
