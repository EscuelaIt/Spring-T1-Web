package es.urjc.code.daw;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SesionController {

	private String infoCompartida;

	@RequestMapping(value = "/procesarFormulario", method = RequestMethod.POST)
	public String procesarFormulario(@RequestParam String info, HttpSession sesion) {

		sesion.setAttribute("infoUsuario", info);
		infoCompartida = info;

		return "resultado_formulario";
	}

	@RequestMapping("/mostrarDatos")
	public String mostrarDatos(Model model, HttpSession sesion) {

		String infoUsuario = (String) sesion.getAttribute("infoUsuario");

		model.addAttribute("infoUsuario", infoUsuario);
		model.addAttribute("infoCompartida", infoCompartida);

		return "datos";
	}
}
