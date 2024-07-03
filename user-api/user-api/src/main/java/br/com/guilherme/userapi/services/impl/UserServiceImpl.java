package br.com.guilherme.userapi.services.impl;

import br.com.guilherme.userapi.domain.User;
import br.com.guilherme.userapi.repositories.UserRepository;
import br.com.guilherme.userapi.services.UserService;
import br.com.guilherme.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {


    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow( () -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
