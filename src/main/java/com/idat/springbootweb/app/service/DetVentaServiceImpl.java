package com.idat.springbootweb.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.idat.springbootweb.app.dao.IDetalleVentaDao;
import com.idat.springbootweb.app.entity.DetalleVenta;


@Service
public class DetVentaServiceImpl implements IDetalleVentaService {

	@Autowired
	private IDetalleVentaDao cabVentaDao;
	

	@Override
	@Transactional 
	public DetalleVenta crearDetVenta(DetalleVenta cabVenta) {	
			return cabVentaDao.save(cabVenta);
	}



	@Override
	@Transactional
	public List<DetalleVenta> listarDetVenta() {
		return (List<DetalleVenta>) cabVentaDao.findAll();
	}


	@Override
	@Transactional
	public void eliminarDetVenta(Long id) {
		cabVentaDao.deleteById(id);
	}



	@Override
	@Transactional
	public DetalleVenta  editarDetVenta(Long id) {
		// TODO Auto-generated method stub
		return cabVentaDao.findById(id).orElse(null);
	}


}
