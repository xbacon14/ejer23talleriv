package py.edu.facitec.producto_eje23.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import py.edu.facitec.producto_eje23.entity.Producto;
import py.edu.facitec.producto_eje23.repo.ProductoRepository;

@Controller
@CrossOrigin
@RequestMapping({ "/producto" })

public class InicioController {

	@Autowired
	private ProductoRepository productoRepository;

	@RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
	public void elimProducto(@PathVariable Long id) {
		productoRepository.deleteById(id);
	}

	@RequestMapping(value = "/lista", method = RequestMethod.GET)
	public ResponseEntity<Optional<Producto>> findByAll(@RequestParam(name = "descripcion") Long id) {
		Optional<Producto> list = productoRepository.findById(id);
		return ResponseEntity.ok(list);
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Producto> save(@RequestBody Producto producto) {
		producto = productoRepository.save(producto);
		return ResponseEntity.ok(producto);

	}

}
