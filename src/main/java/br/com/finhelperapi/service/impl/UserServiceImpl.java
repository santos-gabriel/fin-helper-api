package br.com.finhelperapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.finhelperapi.domain.User;
import br.com.finhelperapi.repository.UserRepository;
import br.com.finhelperapi.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		List<User> users = (List<User>) userRepository.findAll();
		return users;
	}

	@Override
	public List<User> findByLoginAndPassword(User user) {
		List<User> users = userRepository.findByLoginAndPassword(user.getLogin(), user.getPassword());
		return users;
	}
}
