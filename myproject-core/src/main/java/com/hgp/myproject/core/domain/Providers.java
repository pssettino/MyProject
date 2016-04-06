package com.hgp.myproject.core.domain;

import com.hgp.myproject.core.dto.ProvidersDTO;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pgsett on 28/03/2016.
 */
@Entity
@Table(name = "provider")
public class Providers implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "providerId")
    private Long id;
    private String razonSocial;
    private String cuit;
    private String name;
    private String lastName;
    private String telephone;
    private String address;
    private String email;

    public Providers() {
    }

    public Providers(ProvidersDTO providersDTO) {
        this.id = providersDTO.getId();
        this.razonSocial = providersDTO.getRazonSocial();
        this.cuit = providersDTO.getCuit();
        this.name = providersDTO.getName();
        this.lastName = providersDTO.getLastName();
        this.telephone = providersDTO.getTelephone();
        this.address = providersDTO.getAddress();
        this.email = providersDTO.getEmail();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Providers providers = (Providers) o;

        if (!id.equals(providers.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
