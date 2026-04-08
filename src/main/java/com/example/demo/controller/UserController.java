package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.User;
import com.example.demo.service.UserService;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping
	public User addUser(@RequestBody User user) {
		return service.save(user);
	}
	
	@GetMapping
	public List<User> getUser(){
		return service.getAll();
	}
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		return service.getById(id);
	}
	
	@PutMapping("/{id}")
	public User updateUser(@PathVariable int id , @RequestBody User user) {
		user.setId(id);
		return service.save(user);	
	}
	
	@DeleteMapping("/{id}")
	public String deleteUser(@PathVariable int id) {
		service.delete(id);
		return "Deleted Successfully";
	}
	
}
