package vn.codegym.backend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.backend.model.User;
import vn.codegym.backend.repository.IUserRepository;
import vn.codegym.backend.service.IUserService;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    public UserServiceImpl() {
    }

    public Optional<User> findByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }
}
