package com.hgp.myproject.core.service.impl;

import com.hgp.myproject.core.domain.Stock;
import com.hgp.myproject.core.dto.StockDTO;
import com.hgp.myproject.core.exception.BusinessException;
import com.hgp.myproject.core.repository.StockRepository;
import com.hgp.myproject.core.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by PGSETT on 21/04/2016.
 */
@Service
public class StockServiceImpl implements StockService {

    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> findAll() throws BusinessException {
        return (List<Stock>) stockRepository.findAll();
    }

    @Override
    public Stock findById(Long id) throws BusinessException {
        return stockRepository.findOne(id);
    }

    @Override
    public Stock update(StockDTO stockDTO) throws BusinessException {
        return stockRepository.save(new Stock(stockDTO));
    }

    @Override
    public Stock _new(StockDTO stockDTO) throws BusinessException {
        return stockRepository.save(new Stock(stockDTO));
    }

    @Override
    public void delete(Long id) throws BusinessException {
        stockRepository.delete(id);
    }
}
