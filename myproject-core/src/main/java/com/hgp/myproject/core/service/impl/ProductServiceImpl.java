package com.hgp.myproject.core.service.impl;

import com.hgp.myproject.core.domain.Products;
import com.hgp.myproject.core.dto.ProductsDTO;
import com.hgp.myproject.core.exception.BusinessException;
import com.hgp.myproject.core.repository.ProductRepository;
import com.hgp.myproject.core.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pgsett on 06/04/2016.
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Products> findAll() throws BusinessException {
        return (List<Products>) productRepository.findAll();
    }

    @Override
    public Products findById(Long id) throws BusinessException {
        return productRepository.findOne(id);
    }

    @Override
    public Products update(ProductsDTO productsDTO) throws BusinessException {
        Products products = new Products(productsDTO);
        return productRepository.save(products);
    }

    @Override
    public Products _new(ProductsDTO productsDTO) throws BusinessException {
        Products products = new Products(productsDTO);
        return productRepository.save(products);
    }

    @Override
    public void delete(Long id) throws BusinessException {
        productRepository.delete(id);
    }
}
