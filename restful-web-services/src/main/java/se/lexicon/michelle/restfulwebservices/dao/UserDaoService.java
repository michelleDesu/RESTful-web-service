package se.lexicon.michelle.restfulwebservices.dao;

import org.springframework.stereotype.Component;
import se.lexicon.michelle.restfulwebservices.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int usersCount = 3;

    static {
        users.add(new User(1,"Saga", LocalDate.now()));
        users.add(new User(2,"Erak", LocalDate.now()));
        users.add(new User(3,"Styv", LocalDate.now()));
    }

    public List<User> findALL(){
        return users;
    }

    public User save(User user){
        if (user.getId() == null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;
    }

    public User findUserById( int id){
        User foundUser = null;

        for (User user : users){
            if(user.getId() == id){
               foundUser = user;
            }
        }
        return foundUser;
    }

}
