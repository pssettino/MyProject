package com.hgp.myproject.core.service.impl;

import com.hgp.myproject.core.domain.Providers;
import com.hgp.myproject.core.dto.ProvidersDTO;
import com.hgp.myproject.core.exception.BusinessException;
import com.hgp.myproject.core.repository.ProviderRepository;
import com.hgp.myproject.core.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pgsett on 28/03/2016.
 */
@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderRepository providerRepository;

    @Override
    public List<Providers> findAll() {
        return (List<Providers>) providerRepository.findAll();
    }

    @Override
    public Providers update(ProvidersDTO providersDTO) throws BusinessException {
        Providers providers = new Providers(providersDTO);
        return providerRepository.save(providers);
    }

    @Override
    public Providers _new(ProvidersDTO providersDTO) throws BusinessException {
        Providers providers = new Providers(providersDTO);
        return providerRepository.save(providers);
    }

    @Override
    public void delete(Long id) throws BusinessException {
        providerRepository.delete(id);
    }
}
