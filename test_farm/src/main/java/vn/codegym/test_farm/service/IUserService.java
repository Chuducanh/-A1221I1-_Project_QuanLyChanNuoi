package vn.codegym.test_farm.service;

import vn.codegym.test_farm.model.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<User> findAllUser();
    void create(User user);
    void edit (User user);
    void delete(String username);
    Optional<User> findByUserName(String username);
}
