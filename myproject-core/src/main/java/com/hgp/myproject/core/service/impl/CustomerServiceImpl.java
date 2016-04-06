package com.hgp.myproject.core.service.impl;

import com.hgp.myproject.core.domain.Customers;
import com.hgp.myproject.core.dto.CustomersDTO;
import com.hgp.myproject.core.exception.BusinessException;
import com.hgp.myproject.core.repository.CustomerRepository;
import com.hgp.myproject.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PGSETT on 10/03/2016.
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customers> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customers update(CustomersDTO customersDTO) throws BusinessException {
        Customers customers = new Customers(customersDTO);
        return customerRepository.save(customers);
    }

    @Override
    public Customers _new(CustomersDTO customersDTO)
            throws BusinessException {
        Customers customers = new Customers(customersDTO);
        return customerRepository.save(customers);
    }

    @Override
    public void delete(Long numeroCliente) throws BusinessException {
        customerRepository.delete(numeroCliente);
    }
}
