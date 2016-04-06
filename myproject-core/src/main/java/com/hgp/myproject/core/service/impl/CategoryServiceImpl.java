package com.hgp.myproject.core.service.impl;

import com.hgp.myproject.core.domain.Category;
import com.hgp.myproject.core.dto.CategoryDTO;
import com.hgp.myproject.core.exception.BusinessException;
import com.hgp.myproject.core.repository.CategoryRepository;
import com.hgp.myproject.core.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pgsett on 06/04/2016.
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() throws BusinessException {
        return (List<Category>) categoryRepository.findAll();
    }

    @Override
    public CategoryDTO findById(Long id) throws BusinessException {
        Category category = categoryRepository.findOne(id);
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setDescription(category.getDescription());
        return categoryDTO;
    }
}
