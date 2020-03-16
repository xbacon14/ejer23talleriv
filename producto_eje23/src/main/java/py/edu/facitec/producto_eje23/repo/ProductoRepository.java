package py.edu.facitec.producto_eje23.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import py.edu.facitec.producto_eje23.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

	Optional<Producto> findById(Long id);

}
