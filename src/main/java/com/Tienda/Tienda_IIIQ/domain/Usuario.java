
package com.Tienda.Tienda_IIIQ.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;


@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Generatedvalue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;
    
    private Long username;
    
    private Long password;
    
    private Long nombre;
    
    private Long apellidos;
    
    private Long correo;
    
    private Long telefono;
    
    private Long rutaImagen;
    
    private Long activo;
    
    @OneToMany
    JoinColumn(name="id_usuario")
        private List<Rol> roles;
}
