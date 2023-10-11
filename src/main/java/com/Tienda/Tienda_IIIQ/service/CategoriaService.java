
package com.Tienda.Tienda_IIIQ.service;

import com.Tienda.Tienda_IIIQ.domain.Categoria;
import java.util.List;



public interface CategoriaService {
   
    public List<Categoria> getCategorias(boolean activos);
    
    public Categoria getCategoria(Categoria categoria);
    
}
