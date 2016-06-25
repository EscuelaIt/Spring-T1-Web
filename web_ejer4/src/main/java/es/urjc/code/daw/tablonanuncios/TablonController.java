package es.urjc.code.daw.tablonanuncios;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TablonController {

	private List<Anuncio> anuncios = new ArrayList<>();

	public TablonController() {
		anuncios.add(new Anuncio("Pepe", "Hola caracola", "XXXX"));
		anuncios.add(new Anuncio("Juan", "Hola caracola", "XXXX"));
	}

	@RequestMapping("/")
	public String tablon(Model model) {

		model.addAttribute("anuncios", anuncios);

		return "tablon";
	}

	@RequestMapping("/anuncio/nuevo")
	public String nuevoAnuncio(Model model, Anuncio anuncio) {

		anuncios.add(anuncio);

		return "anuncio_guardado";

	}

	@RequestMapping("/anuncio/{num}")
	public String verAnuncio(Model model, @PathVariable int num) {

		Anuncio anuncio = anuncios.get(num - 1);

		model.addAttribute("anuncio", anuncio);

		return "ver_anuncio";
	}
}