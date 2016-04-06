package com.hgp.myproject.core.service;

import com.hgp.myproject.core.domain.Category;
import com.hgp.myproject.core.dto.CategoryDTO;
import com.hgp.myproject.core.exception.BusinessException;

import java.util.List;

/**
 * Created by pgsett on 06/04/2016.
 */
public interface CategoryService {
    List<Category> findAll() throws BusinessException;

    CategoryDTO findById(Long id) throws BusinessException;
}
