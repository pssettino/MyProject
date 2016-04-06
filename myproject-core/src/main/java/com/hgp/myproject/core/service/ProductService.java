package com.hgp.myproject.core.service;

import com.hgp.myproject.core.domain.Products;
import com.hgp.myproject.core.dto.ProductsDTO;
import com.hgp.myproject.core.exception.BusinessException;

import java.util.List;

/**
 * Created by pgsett on 06/04/2016.
 */
public interface ProductService {
    List<Products> findAll()throws BusinessException;

    Products findById(Long id)throws BusinessException;

    Products update(ProductsDTO productsDTO) throws BusinessException;

    Products _new(ProductsDTO productsDTO) throws BusinessException;

    void delete(Long id) throws BusinessException;
}
