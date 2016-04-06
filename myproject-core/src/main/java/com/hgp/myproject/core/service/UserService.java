package com.hgp.myproject.core.service;


import com.hgp.myproject.core.domain.User;
import com.hgp.myproject.core.dto.UserDTO;
import com.hgp.myproject.core.exception.BusinessException;
import com.hgp.myproject.core.exception.UserNotFoundException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User Services
 * User: BSBUON
 * Date: 23/04/14
 * Time: 16:02
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    List<User> findAll();

    User update(UserDTO userDTO) throws BusinessException;

    User newUser(UserDTO userDTO) throws BusinessException;

    void delete(Long id) throws UserNotFoundException;


    User findByUserName(String userName) throws UserNotFoundException;

}
