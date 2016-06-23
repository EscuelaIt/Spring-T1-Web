package es.urjc.code.daw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EnlaceController {

	@RequestMapping("/enlace")
	public String enlace(Model model, @RequestParam String num) {

		model.addAttribute("num", num);

		return "enlace";
	}
}