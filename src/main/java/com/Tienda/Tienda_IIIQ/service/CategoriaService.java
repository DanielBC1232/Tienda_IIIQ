
package com.Tienda.Tienda_IIIQ.service;

import com.Tienda.Tienda_IIIQ.domain.Categoria;
import java.util.List;



public interface CategoriaService {
   
    //Retorna una lista de categorias (activas o todas)
    public List<Categoria> getCategorias(boolean activos);
    
    //retorna una categoria por ID
    public Categoria getCategoria(Categoria categoria);
    
    //se inserta un nuevo registro so el Id de la categoria esta vacio
    //sea actualiza el registro si el Id de la categoria NO esta vacio
    public void save(Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Categoria categoria);
    
}
