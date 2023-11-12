package com.Tienda.Tienda_IIIQ.dao;

import com.Tienda.Tienda_IIIQ.domain.Categoria;
import com.Tienda.Tienda_IIIQ.domain.Producto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaDao extends JpaRepository<Categoria, Long> {

    List<Categoria>findByDescripcionContaining(String descripcion);

}
