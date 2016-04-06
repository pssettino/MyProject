package com.hgp.myproject.core.repository;

import com.hgp.myproject.core.domain.User;
import com.hgp.myproject.core.exception.UserNotFoundException;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

public interface UserRepository extends CrudRepository<User, Long> {

}
