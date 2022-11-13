package vn.codegym.test_farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.codegym.test_farm.model.User;
import vn.codegym.test_farm.service.IUserService;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/users")
    public ResponseEntity<List<User>> findAllUser() {
        List<User> users = userService.findAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        userService.create(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/users/{username}")
    public ResponseEntity<User> findByUserName(@PathVariable String username) {
        Optional<User> user = userService.findByUserName(username);
        return new ResponseEntity<>(user.get(), HttpStatus.OK);
    }

    @PutMapping("/users/{username}")
    public ResponseEntity<User> updateEmployee(@PathVariable Long username, @RequestBody User user) {
        userService.edit(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/users/{username}")
    public ResponseEntity<User> deleteUser(@PathVariable String username) {
        userService.delete(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
