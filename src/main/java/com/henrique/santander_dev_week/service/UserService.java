package com.henrique.santander_dev_week.service;

import com.henrique.santander_dev_week.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User userToCreate);

}
