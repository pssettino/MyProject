package com.hgp.myproject.core.service;

import com.hgp.myproject.core.domain.Stock;
import com.hgp.myproject.core.dto.StockDTO;
import com.hgp.myproject.core.exception.BusinessException;

import java.util.List;

/**
 * Created by PGSETT on 21/04/2016.
 */
public interface StockService {

    List<Stock> findAll()throws BusinessException;

    Stock findById(Long id)throws BusinessException;

    Stock update(StockDTO stockDTO) throws BusinessException;

    Stock _new(StockDTO stockDTO) throws BusinessException;

    void delete(Long id) throws BusinessException;
}
