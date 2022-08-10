package com.idat.springbootweb.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.springbootweb.app.dao.IAlmacenDao;

import com.idat.springbootweb.app.entity.Almacen;
import com.idat.springbootweb.app.entity.DetalleAlmacen;


@Service
public class AlmacenServiceImpl implements IAlmacenService {

	@Autowired
	private IAlmacenDao cabVentaDao;
	

	@Override
	@Transactional 
	public Almacen crearDetVenta(Almacen cabVenta) {	
			return cabVentaDao.save(cabVenta);
	}



	@Override
	@Transactional
	public List<Almacen> listarDetVenta() {
		return (List<Almacen>) cabVentaDao.findAll();
	}


	@Override
	@Transactional
	public void eliminarDetVenta(Long id) {
		cabVentaDao.deleteById(id);
	}



	@Override
	@Transactional
	public Almacen  editarDetVenta(Long id) {
		// TODO Auto-generated method stub
		return cabVentaDao.findById(id).orElse(null);
	}



	@Override
	public Almacen buscar_x_nombre(String nombre) {
		// TODO Auto-generated method stub
		return cabVentaDao.findByNombre(nombre);
	}


}
