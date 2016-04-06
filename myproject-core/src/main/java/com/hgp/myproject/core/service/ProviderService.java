package com.hgp.myproject.core.service;

import com.hgp.myproject.core.domain.Providers;
import com.hgp.myproject.core.dto.ProvidersDTO;
import com.hgp.myproject.core.exception.BusinessException;

import java.util.List;

/**
 * Created by pgsett on 28/03/2016.
 */
public interface ProviderService {
    List<Providers> findAll();

    Providers update(ProvidersDTO providersDTO) throws BusinessException;

    Providers _new(ProvidersDTO providersDTO) throws BusinessException;

    void delete(Long id) throws BusinessException;
}
