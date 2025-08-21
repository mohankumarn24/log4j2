package net.project.loggers.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.project.loggers.controller.UserController;
import net.project.loggers.model.User;
import net.project.loggers.repository.UserRepository;

@Service
public class UserService {
	
	private static final Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		
		logs();
		return userRepository.getUsers();
	}

	private void logs() {
		
		System.out.println();
    	logger.error("Service: This is an ERROR level message");
    	logger.warn("Service: This is a WARN level message");
    	logger.info("Service: This is an INFO level message");
    	logger.debug("Service: This is a DEBUG level message");
        logger.trace("Service: This is a TRACE level message");
	}
}
