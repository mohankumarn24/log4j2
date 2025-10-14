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


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
[32m :: Spring Boot :: [39m             [2m (v2.6.12)[0;39m

2025-10-14 23:03:34.552 [main] INFO  net.project.loggers.LoggersApplication - Starting LoggersApplication using Java 17.0.16 on HOME-DESKTOP with PID 5164 (D:\dev\github\log4j2\target\classes started by Mohan in D:\dev\github\log4j2)
2025-10-14 23:03:34.560 [main] INFO  net.project.loggers.LoggersApplication - No active profile set, falling back to 1 default profile: "default"
2025-10-14 23:03:35.159 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat initialized with port(s): 8080 (http)
2025-10-14 23:03:35.174 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Initializing ProtocolHandler ["http-nio-8080"]
2025-10-14 23:03:35.174 [main] INFO  org.apache.catalina.core.StandardService - Starting service [Tomcat]
2025-10-14 23:03:35.175 [main] INFO  org.apache.catalina.core.StandardEngine - Starting Servlet engine: [Apache Tomcat/9.0.65]
2025-10-14 23:03:35.260 [main] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] - Initializing Spring embedded WebApplicationContext
2025-10-14 23:03:35.260 [main] INFO  org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext - Root WebApplicationContext: initialization completed in 662 ms
2025-10-14 23:03:35.462 [main] INFO  org.apache.coyote.http11.Http11NioProtocol - Starting ProtocolHandler ["http-nio-8080"]
2025-10-14 23:03:35.478 [main] INFO  org.springframework.boot.web.embedded.tomcat.TomcatWebServer - Tomcat started on port(s): 8080 (http) with context path ''
2025-10-14 23:03:35.484 [main] INFO  net.project.loggers.LoggersApplication - Started LoggersApplication in 1.169 seconds (JVM running for 1.933)
2025-10-14 23:05:30.922 [http-nio-8080-exec-1] INFO  org.apache.catalina.core.ContainerBase.[Tomcat].[localhost].[/] - Initializing Spring DispatcherServlet 'dispatcherServlet'
2025-10-14 23:05:30.923 [http-nio-8080-exec-1] INFO  org.springframework.web.servlet.DispatcherServlet - Initializing Servlet 'dispatcherServlet'
2025-10-14 23:05:30.923 [http-nio-8080-exec-1] INFO  org.springframework.web.servlet.DispatcherServlet - Completed initialization in 0 ms

2025-10-14 23:05:30.940 [http-nio-8080-exec-1] ERROR net.project.loggers.controller.UserController - Controller: This is an ERROR level message
2025-10-14 23:05:30.940 [http-nio-8080-exec-1] WARN  net.project.loggers.controller.UserController - Controller: This is a WARN level message
2025-10-14 23:05:30.940 [http-nio-8080-exec-1] INFO  net.project.loggers.controller.UserController - Controller: This is an INFO level message

2025-10-14 23:05:30.940 [http-nio-8080-exec-1] ERROR net.project.loggers.service.UserService - Service: This is an ERROR level message
2025-10-14 23:05:30.941 [http-nio-8080-exec-1] WARN  net.project.loggers.service.UserService - Service: This is a WARN level message
2025-10-14 23:05:30.941 [http-nio-8080-exec-1] INFO  net.project.loggers.service.UserService - Service: This is an INFO level message

2025-10-14 23:05:30.941 [http-nio-8080-exec-1] ERROR net.project.loggers.repository.UserRepository - Repository: This is an ERROR level message
2025-10-14 23:05:30.941 [http-nio-8080-exec-1] WARN  net.project.loggers.repository.UserRepository - Repository: This is a WARN level message
2025-10-14 23:05:30.941 [http-nio-8080-exec-1] INFO  net.project.loggers.repository.UserRepository - Repository: This is an INFO level message

*/