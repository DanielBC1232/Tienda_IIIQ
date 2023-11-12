
package com.Tienda.Tienda_IIIQ.service;

import com.Tienda.Tienda_IIIQ.domain.Producto;
import java.util.List;

public interface ProductoService {
   
    //Retorna una lista de categorias (activas o todas)
    public List<Producto> getProductos(boolean activos);
    
    //retorna una categoria por ID
    public Producto getProducto(Producto producto);
    
    //se inserta un nuevo registro so el Id de la categoria esta vacio
    //sea actualiza el registro si el Id de la categoria NO esta vacio
    public void save(Producto producto);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto producto);
    
    
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
    
    
    
}