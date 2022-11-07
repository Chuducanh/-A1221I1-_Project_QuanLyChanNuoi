package vn.codegym.test_farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import vn.codegym.test_farm.service.IUserService;

@RestController
@CrossOrigin
public class  UserController {
    @Autowired
    private IUserService userService;
}
