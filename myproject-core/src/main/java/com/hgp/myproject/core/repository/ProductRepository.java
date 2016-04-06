package com.hgp.myproject.core.repository;

import com.hgp.myproject.core.domain.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pgsett on 06/04/2016.
 */
@Repository
public interface ProductRepository extends CrudRepository<Products,Long> {
}
