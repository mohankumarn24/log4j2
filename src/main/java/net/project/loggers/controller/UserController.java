package net.project.loggers.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import net.project.loggers.model.User;
import net.project.loggers.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	

	@GetMapping
	public List<User> getUsers() {
		logs();
		return userService.getUsers();
	}


	private void logs() {
		
		System.out.println();
    	logger.error("Controller: This is an ERROR level message");
    	logger.warn("Controller: This is a WARN level message");
    	logger.info("Controller: This is an INFO level message");
    	logger.debug("Controller: This is a DEBUG level message");
        logger.trace("Controller: This is a TRACE level message");
	}
}
