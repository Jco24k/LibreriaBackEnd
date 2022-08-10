package com.idat.springbootweb.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.springbootweb.app.dao.IAlmacenDao;
import com.idat.springbootweb.app.dao.IDetalleAlmacenDao;
import com.idat.springbootweb.app.entity.Almacen;
import com.idat.springbootweb.app.entity.DetalleAlmacen;


@Service
public class DetalleAlmacenServiceImpl implements IDetalleAlmacenService {

	@Autowired
	private IDetalleAlmacenDao cabVentaDao;
	

	@Override
	@Transactional 
	public DetalleAlmacen crearDetVenta(DetalleAlmacen cabVenta) {	
			return cabVentaDao.save(cabVenta);
	}



	@Override
	@Transactional
	public List<DetalleAlmacen> listarDetVenta() {
		return (List<DetalleAlmacen>) cabVentaDao.findAll();
	}


	@Override
	@Transactional
	public void eliminarDetVenta(Long id) {
		cabVentaDao.deleteById(id);
	}



	@Override
	@Transactional
	public DetalleAlmacen  editarDetVenta(Long id) {
		// TODO Auto-generated method stub
		return cabVentaDao.findById(id).orElse(null);
	}



	@Override
	public List<DetalleAlmacen> buscar_x_nombre(Long id_almacen) {
		
		return cabVentaDao.findByIdAlmacen(id_almacen);
	}



	@Override
	public DetalleAlmacen actualizarDetVenta(Long id_almacen,Long id_producto) {
		 return cabVentaDao.findByIdAlmacenAndIdProducto(id_almacen, id_producto);
	}






}
