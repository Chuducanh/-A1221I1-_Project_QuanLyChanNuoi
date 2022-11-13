package vn.codegym.test_farm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.test_farm.model.User;
import vn.codegym.test_farm.repository.IUserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceIpml implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void create(User user) {
        userRepository.save(user);
    }

    @Override
    public void edit(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(String username) {
        userRepository.deleteById(username);
    }

    @Override
    public Optional<User> findByUserName(String username) {
        return userRepository.findById(username);
    }
}
