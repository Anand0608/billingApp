package com.cinfogen.service;

import com.cinfogen.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
