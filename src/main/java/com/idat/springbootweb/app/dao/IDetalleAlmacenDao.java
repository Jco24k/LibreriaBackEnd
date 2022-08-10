package com.idat.springbootweb.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.idat.springbootweb.app.entity.DetalleAlmacen;
import com.idat.springbootweb.app.entity.Producto;



public interface IDetalleAlmacenDao extends JpaRepository<DetalleAlmacen,Long> {
	
	public List<DetalleAlmacen> findByIdAlmacen(Long id_almacen);
	

	public DetalleAlmacen findByIdAlmacenAndIdProducto(Long idAlmacen,Long idProducto);
}
