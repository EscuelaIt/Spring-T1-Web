package es.urjc.code.daw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EnlaceController {

	@RequestMapping("/enlace/{num}")
	public String enlace(Model model, @PathVariable String num) {

		model.addAttribute("num", num);

		return "enlace";
	}
}