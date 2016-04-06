package com.hgp.myproject.core.service.impl;


import com.hgp.myproject.core.domain.User;
import com.hgp.myproject.core.dto.UserDTO;
import com.hgp.myproject.core.exception.BusinessException;
import com.hgp.myproject.core.exception.UserNotFoundException;
import com.hgp.myproject.core.repository.UserRepository;
import com.hgp.myproject.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User update(UserDTO userDTO) throws BusinessException {
        User user = null;
        try {
            user = userRepository.findOne(userDTO.getId());
            user.setPassword(userDTO.getPassword());
            user.setUserName(userDTO.getUserName());

            userRepository.save(user);
        } catch (Exception ex) {
            new BusinessException(ex);
        }

        return user;
    }

    @Override
    public User newUser(UserDTO userDTO) throws BusinessException {
        User user = null;
        try {
            user = userRepository.save(new User(userDTO));
        } catch (Exception ex) {
            new BusinessException(ex);
        }
        return user;
    }

    @Override
    public void delete(Long id) throws UserNotFoundException {
        try {
            userRepository.delete(id);
        } catch (Exception ex) {
            new UserNotFoundException();
        }
    }

    @Override
    public User findByUserName(String userName) throws UserNotFoundException {
        User user = null;
        try {
          //  user = userRepository.findByUserName(userName);
        } catch (Exception ex) {
            new UserNotFoundException();
        }
        return user;
    }
}
