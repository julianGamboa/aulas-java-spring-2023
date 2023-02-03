package julian.example.julian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
@RestController  
public class JulianApplication {

	public static void main(String[] args) {
		SpringApplication.run(JulianApplication.class, args);
	}

}
