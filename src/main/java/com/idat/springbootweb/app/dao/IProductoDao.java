package com.idat.springbootweb.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.idat.springbootweb.app.entity.Producto;

public interface IProductoDao extends JpaRepository<Producto,Long> {
	public List<Producto> findByMarcaStartingWith(String nombre);
	
	@Query(value = "SELECT p.id,p.marca,p.descripcion,cantidad as stock ,p.precio,p.id_tipo_producto,p.id_proveedor FROM  producto p INNER JOIN detalle_almacen d on p.id = d.id_producto\r\n"
			+ "	where d.id_almacen = :id_almacen",nativeQuery = true)
	public List<Producto>findByProductosAlmacen(@Param("id_almacen") Long id_almacen);
}
