package com.idat.springbootweb.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.springbootweb.app.dao.ICabeceraVentaDao;
import com.idat.springbootweb.app.entity.CabeceraVenta;


@Service
public class CabVentaServiceImpl implements ICabeceraVentaService {

	@Autowired
	private ICabeceraVentaDao cabVentaDao;
	

	@Override
	@Transactional 
	public CabeceraVenta crearCabVenta(CabeceraVenta cabVenta) {	
			return cabVentaDao.save(cabVenta);
	}



	@Override
	@Transactional
	public List<CabeceraVenta> listarCabVenta() {
		return (List<CabeceraVenta>) cabVentaDao.findAll();
	}


	@Override
	@Transactional
	public void eliminarCabVenta(Long id) {
		cabVentaDao.deleteById(id);
	}



	@Override
	@Transactional
	public CabeceraVenta  editarCabVenta(Long id) {
		// TODO Auto-generated method stub
		return cabVentaDao.findById(id).orElse(null);
	}


}
