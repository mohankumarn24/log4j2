package net.project.loggers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoggersApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoggersApplication.class, args);
	}

}

/*
14:38:11.094 [http-nio-8080-exec-1] ERROR net.project.loggers.controller.UserController - Controller: This is an ERROR level message
14:38:11.094 [http-nio-8080-exec-1] WARN  net.project.loggers.controller.UserController - Controller: This is a WARN level message
14:38:11.095 [http-nio-8080-exec-1] INFO  net.project.loggers.controller.UserController - Controller: This is an INFO level message
14:38:11.095 [http-nio-8080-exec-1] DEBUG net.project.loggers.controller.UserController - Controller: This is a DEBUG level message
14:38:11.095 [http-nio-8080-exec-1] TRACE net.project.loggers.controller.UserController - Controller: This is a TRACE level message

14:38:11.095 [http-nio-8080-exec-1] ERROR net.project.loggers.service.UserService - Service: This is an ERROR level message
14:38:11.095 [http-nio-8080-exec-1] WARN  net.project.loggers.service.UserService - Service: This is a WARN level message
14:38:11.095 [http-nio-8080-exec-1] INFO  net.project.loggers.service.UserService - Service: This is an INFO level message
14:38:11.095 [http-nio-8080-exec-1] DEBUG net.project.loggers.service.UserService - Service: This is a DEBUG level message

14:38:11.095 [http-nio-8080-exec-1] ERROR net.project.loggers.repository.UserRepository - Repository: This is an ERROR level message
14:38:11.095 [http-nio-8080-exec-1] WARN  net.project.loggers.repository.UserRepository - Repository: This is a WARN level message
14:38:11.095 [http-nio-8080-exec-1] INFO  net.project.loggers.repository.UserRepository - Repository: This is an INFO level message
*/