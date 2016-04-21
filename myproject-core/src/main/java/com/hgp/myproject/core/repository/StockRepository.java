package com.hgp.myproject.core.repository;

import com.hgp.myproject.core.domain.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by PGSETT on 21/04/2016.
 */
@Repository
public interface StockRepository extends CrudRepository<Stock, Long> {
}
