package se.lexicon.michelle.restfulwebservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import se.lexicon.michelle.restfulwebservices.entity.User;
import se.lexicon.michelle.restfulwebservices.service.UserDaoService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
   private UserDaoService userService;

    //retrieveAllUsers

    @GetMapping("/users")
    public List<User> retrieveAllUsers(){
        return userService.findALL();
    }

    @GetMapping("users/{id}")
    public User RetrieveUser(@PathVariable int id){
        return userService.findUserById(id);
    }

}
