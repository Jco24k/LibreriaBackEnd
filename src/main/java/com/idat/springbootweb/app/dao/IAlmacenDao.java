package com.idat.springbootweb.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.idat.springbootweb.app.entity.Almacen;


public interface IAlmacenDao extends JpaRepository<Almacen,Long> {
	public Almacen findByNombre(String nombreString);

}
