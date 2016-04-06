package com.hgp.myproject.core.repository;

import com.hgp.myproject.core.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pgsett on 06/04/2016.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
}
