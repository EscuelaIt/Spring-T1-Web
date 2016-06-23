package es.urjc.code.daw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SesionController {

	@Autowired
	private Usuario usuario;

	private String infoCompartida;

	@RequestMapping(value = "/procesarFormulario", method = RequestMethod.POST)
	public String procesarFormulario(@RequestParam String info) {

		usuario.setInfo(info);
		infoCompartida = info;

		return "resultado_formulario";
	}

	@RequestMapping("/mostrarDatos")
	public String mostrarDatos(Model model) {

		String infoUsuario = usuario.getInfo();

		model.addAttribute("infoUsuario", infoUsuario);
		model.addAttribute("infoCompartida", infoCompartida);

		return "datos";
	}
}
