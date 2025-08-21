package net.project.loggers.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import net.project.loggers.controller.UserController;
import net.project.loggers.model.User;

@Repository
public class UserRepository {
	
	private static final Logger logger = LoggerFactory.getLogger(UserRepository.class);

	public List<User> getUsers() {

		logs();
		
		List<User> users = new ArrayList<>();
		users.add(new User(1, "Mohan", "Kumar"));
		users.add(new User(2, "Sachin", "Tendulkar"));
		users.add(new User(3, "Rahul", "Dravid"));
		
		return users;
	}

	private void logs() {
		
		System.out.println();
    	logger.error("Repository: This is an ERROR level message");
    	logger.warn("Repository: This is a WARN level message");
    	logger.info("Repository: This is an INFO level message");
    	logger.debug("Repository: This is a DEBUG level message");
        logger.trace("Repository: This is a TRACE level message");
	}
}
