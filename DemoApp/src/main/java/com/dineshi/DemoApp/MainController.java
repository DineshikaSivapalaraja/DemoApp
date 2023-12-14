package com.dineshi.DemoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping(path = "/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    // add user values
    @PostMapping(path = "/add")
    public @ResponseBody User addNewUser(@RequestParam String name
            , @RequestParam String email
            , @RequestParam Integer phone) {

        User springUser = new User();
        springUser.setName(name);
        springUser.setEmail(email);
        springUser.setPhone(phone);
        userRepository.save(springUser);
        return springUser;
    }
    // i used param here for that in postman need to add values using param not json

//public @ResponseBody User addNewUser(@RequestBody User user) {
//    userRepository.save(user);
//    return user;
//}  // to add with json in postman we can use this code

    //retrieve all users value
    @GetMapping(path = "/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
