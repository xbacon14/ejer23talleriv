package py.edu.facitec.producto_eje23.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import py.edu.facitec.producto_eje23.entity.Producto;
import py.edu.facitec.producto_eje23.repo.ProductoRepository;

@RestController
@CrossOrigin
@RequestMapping({ "/producto" })

public class ProductoController {

	@Autowired
	private ProductoRepository productoRepository;

	@DeleteMapping(value = "/eliminar/{id}")
	public String elimProducto(@PathVariable Long id) {
		try {
			productoRepository.deleteById(id);
			String ob = "Objeto eliminado";
			return ob;
		} catch (Exception e) {
			System.out.println("El id no existe");
			return "El id no existe";
		}
	}

	@GetMapping(value = "/lista")
	public List<Producto> getProduto() {
		return productoRepository.findAll();

	}

	@PostMapping(value = "/guardar")
	public ResponseEntity<Producto> save(@RequestBody Producto producto) {
		producto = productoRepository.save(producto);
		return ResponseEntity.ok(producto);

	}
}
