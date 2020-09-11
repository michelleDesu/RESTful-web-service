package se.lexicon.michelle.restfulwebservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import se.lexicon.michelle.restfulwebservices.model.User;
import se.lexicon.michelle.restfulwebservices.dao.UserDaoService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDaoService userService;

    //retrieveAllUsers

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userService.findALL();
    }

    @GetMapping("/users/{id}")
    public User RetrieveUser(@PathVariable int id) {
        return userService.findUserById(id);
    }

    //CREATED
    //input -details of user
    //output- CREATED  Return the created uri
    @PostMapping("/users")
    public void createUser(@RequestBody User user) {
        User savedUser = userService.save(user);
    }

}
