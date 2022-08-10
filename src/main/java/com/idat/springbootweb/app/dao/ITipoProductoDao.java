package com.idat.springbootweb.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.idat.springbootweb.app.entity.TipoProducto;

public interface ITipoProductoDao extends CrudRepository<TipoProducto,Long> {
	
}
