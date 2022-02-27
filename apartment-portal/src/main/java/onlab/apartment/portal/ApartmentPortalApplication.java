package onlab.apartment.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApartmentPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApartmentPortalApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello!";
	}

}
