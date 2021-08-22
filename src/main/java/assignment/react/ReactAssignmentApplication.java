package assignment.react;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactAssignmentApplication {
	private static final Logger log = LoggerFactory.getLogger(SpringBootApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ReactAssignmentApplication.class, args);
		System.out.println("Hello to my first application");

	}

}
