package br.com.finhelperapi.service;

import java.util.List;

import br.com.finhelperapi.domain.User;

public interface UserService {
	
	List<User> findAll();
	
	List<User> findByLoginAndPassword(User user);
}
