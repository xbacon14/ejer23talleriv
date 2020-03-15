package py.edu.facitec.producto_eje23.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.producto_eje23.repo.ProductoRepository;

@RestController
@CrossOrigin
@RequestMapping({ "/api/inicio" })

public class InicioController {

	@Autowired

	private ProductoRepository productoRepository;

}
