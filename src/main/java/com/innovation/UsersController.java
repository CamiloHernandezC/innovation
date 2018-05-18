package com.innovation;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class UsersController {
	
	@Autowired
    private UsersRepository repository;

	 @GetMapping("/cool-cars")
	    public Collection<Users> coolCars() {
	        return repository.findAll().stream()
	                .collect(Collectors.toList());
	    }
}
