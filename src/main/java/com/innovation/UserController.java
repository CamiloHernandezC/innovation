package com.innovation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserController {
	/*
	@Autowired
    private UserRepository userRepository;

    @PostMapping
    public User create(@RequestBody User user){
        return userRepository.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findById(@PathVariable("id") Long id){
        return userRepository.findById(id);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userRepository.update(user);
    }

    @DeleteMapping
    public void delete(@RequestBody User user) {
        userRepository.delete(user);
    }

    @GetMapping
    public List<User> findAll(){
        return userRepository.findAll();
    }*/
}
