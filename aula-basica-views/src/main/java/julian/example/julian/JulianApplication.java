package julian.example.julian;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@SpringBootApplication
@RestController
public class JulianApplication {

	@RequestMapping("/")
	public ModelAndView index () {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("formularioEntradaVeiculos");
		return modelAndView;
	}

	public static void main(String[] args) {
		SpringApplication.run(JulianApplication.class, args);
	}

}
