package com.hgp.myproject.core.repository;

import com.hgp.myproject.core.domain.Providers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pgsett on 28/03/2016.
 */
@Repository
public interface ProviderRepository extends CrudRepository<Providers,Long> {

}
