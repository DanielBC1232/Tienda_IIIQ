package com.Tienda.Tienda_IIIQ.service.impl;

import com.Tienda.Tienda_IIIQ.dao.CategoriaDao;
import com.Tienda.Tienda_IIIQ.domain.Categoria;
import com.Tienda.Tienda_IIIQ.domain.Producto;
import com.Tienda.Tienda_IIIQ.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activos) {
        var lista = categoriaDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {
        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada

    @Override
    public List<Categoria> getCategoriasPorDescripcion(String descripcion) {
        return categoriaDao.findByDescripcionContaining(descripcion);
    }
    
    

}
