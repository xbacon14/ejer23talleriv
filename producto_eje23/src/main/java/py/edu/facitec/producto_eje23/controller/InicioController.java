package py.edu.facitec.producto_eje23.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin

public class InicioController {

	@RequestMapping("/")
	public String index() {
		System.out.println("cargando la pag");
		return "Italo Golin ™";
	}

}
