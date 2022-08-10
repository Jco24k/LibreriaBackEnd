package com.idat.springbootweb.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.idat.springbootweb.app.entity.Cliente;
import com.idat.springbootweb.app.entity.Proveedor;

public interface IProveedorDao extends CrudRepository<Proveedor,Long> {
}
