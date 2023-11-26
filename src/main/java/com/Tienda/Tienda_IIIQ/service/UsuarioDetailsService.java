
package com.Tienda.Tienda_IIIQ.service;

import com.Tienda.Tienda_IIIQ.domain.Usuario;
import org.springframework.security.core.userdetails.*;

public interface UsuarioDetailsService {
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
   
    public Usuario getUsuarioPorusername(String username);
    
}
