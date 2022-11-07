package vn.codegym.test_farm.service;

import vn.codegym.test_farm.model.User;

import java.util.List;

public interface IUserService {
    List<User> findAllUser();
    void create(User user);
    void edit (String username);
    void delete(String username);
    void findByUserName(String username);
}
