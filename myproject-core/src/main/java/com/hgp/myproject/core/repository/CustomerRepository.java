package com.hgp.myproject.core.repository;

import com.hgp.myproject.core.domain.Customers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by pgsett on 08/03/2016.
 */
@Repository
public interface CustomerRepository extends CrudRepository<Customers, Long> {
    public static final String FIND_ALL_CLIENTES = "SELECT c FROM Clientes c ";

    @Transactional(readOnly = true)
    @Query(FIND_ALL_CLIENTES)
    List<Customers> findAll();
}
