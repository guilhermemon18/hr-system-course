package br.com.guilherme.userapi.services;

import br.com.guilherme.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
