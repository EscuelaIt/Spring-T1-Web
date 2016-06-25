
package es.urjc.code.daw;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnuncioController {

	@RequestMapping("/guardaranuncio")
	public String guardarAnuncio(Model model, Anuncio anuncio) {

		model.addAttribute("anuncio", anuncio);

		return "anuncio";
	}
}