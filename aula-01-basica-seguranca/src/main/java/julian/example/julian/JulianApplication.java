package julian.example.julian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@SpringBootApplication (exclude = { SecurityAutoConfiguration.class })
@RestController  
public class JulianApplication {

	@GetMapping("/")
	public ModelAndView index () {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("formularioEntradaVeiculos");
		
		return modelAndView;
	}

	public static void main(String[] args) {
		SpringApplication.run(JulianApplication.class, args);
	}

}
