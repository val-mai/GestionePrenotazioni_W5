package com.epicode.prenotazioni.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> getAllUsers() {
		return (List<User>) repo.findAll();
	}
	
	public User findById(Long id) {
		return repo.findById(id).get();
	}
	
	public void deleteUser(Long id) {
		repo.deleteById(id);
	}
	
	public void create(User user) {
		repo.save(user);
	}
	
	public void edit(User user) {
		repo.save(user);
	}
}
