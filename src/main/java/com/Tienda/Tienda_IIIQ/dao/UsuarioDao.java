
package com.Tienda.Tienda_IIIQ.dao;

import com.Tienda.Tienda_IIIQ.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario, Long>{
    Usuario findByusername(String username);
}
