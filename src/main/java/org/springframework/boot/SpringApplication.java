package org.springframework.boot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

		@SpringBootApplication
		@RestController
public class SpringApplication {
	  public static void main(String[] args) {
	        SpringApplication.run(SpringApplication.class, args);
	    }
	    @RequestMapping("/")
	    public String index() {
	        return "Greetings from Spring Boot!";
	    }

	    
	}