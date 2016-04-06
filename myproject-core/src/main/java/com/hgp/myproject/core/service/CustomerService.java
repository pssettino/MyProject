package com.hgp.myproject.core.service;

import com.hgp.myproject.core.domain.Customers;
import com.hgp.myproject.core.domain.User;
import com.hgp.myproject.core.dto.CustomersDTO;
import com.hgp.myproject.core.exception.BusinessException;

import java.util.List;

/**
 * Created by pgsett on 08/03/2016.
 */
public interface CustomerService {
    List<Customers> findAll();

    Customers update(CustomersDTO customersDTO) throws BusinessException;

    Customers _new(CustomersDTO customersDTO) throws BusinessException;

    void delete(Long numeroCliente) throws BusinessException;
}
