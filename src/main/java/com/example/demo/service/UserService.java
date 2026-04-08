package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import java.util.List;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	
	public User save(User user) {
		return repo.save(user);
	}
	public List<User> getAll(){
		return repo.findAll();
	}
	public User getById(int id) {
		return repo.findById(id).orElse(null);
	}
	public void delete(int id) {
		repo.deleteById(id);
	}
}
