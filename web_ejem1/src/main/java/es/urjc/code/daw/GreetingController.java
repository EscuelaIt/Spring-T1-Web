package es.urjc.code.daw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greeting(Model model) {

		model.addAttribute("name", "World");

		return "greeting_template";
	}

}
