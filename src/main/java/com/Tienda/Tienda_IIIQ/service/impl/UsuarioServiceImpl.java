package com.Tienda.Tienda_IIIQ.service.impl;

import com.Tienda.Tienda_IIIQ.dao.UsuarioDao;
import com.Tienda.Tienda_IIIQ.domain.Rol;
import com.Tienda.Tienda_IIIQ.domain.Usuario;
import com.Tienda.Tienda_IIIQ.service.UsuarioService;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("UsuarioService")
public class UsuarioServiceImpl implements UsuarioService, userDetailsService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private HttpSession session;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioDao.findByUsername(username);
        //si no existe el usuario lanza exc
        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        }
        //remover atributos de la sesion
        
        session.removeAttribute("usuarioImagen");
        session.setAttribute("usuarioImagen", usuario.getRutaImagen());
        //transformar roles a GrantedAuthority
        var roles = new ArrayList<GrantedAuthority>();
        
    for (Rol item : usuario.getRoles()) {
            roles.add(new SimpleGrantedAuthority(item.getNombre()));
        }
        //se retorna el user (clase UserDetails)
        return new User(usuario.getUsername(), usuario.getPassword(), roles);

    }

    @Override
    public Usuario getUsuarioPorusername(String username) {
        return usuarioDao.findbyUsername(username);
    }
}
