package vn.codegym.test_farm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.test_farm.model.User;
import vn.codegym.test_farm.repository.IUserRepository;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void edit(String username) {

    }

    @Override
    public void delete(String username) {

    }

    @Override
    public void findByUserName(String username) {

    }
}
