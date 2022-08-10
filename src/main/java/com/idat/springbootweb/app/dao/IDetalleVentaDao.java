package com.idat.springbootweb.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.idat.springbootweb.app.entity.DetalleVenta;

public interface IDetalleVentaDao extends CrudRepository<DetalleVenta,Long> {
	
}
