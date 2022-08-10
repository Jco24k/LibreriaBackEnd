package com.idat.springbootweb.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.idat.springbootweb.app.dao.IClienteDao;
import com.idat.springbootweb.app.dao.ITipoProductoDao;
import com.idat.springbootweb.app.entity.Cliente;
import com.idat.springbootweb.app.entity.TipoProducto;


@Service
public class TipoProductoServiceImpl implements ITipoProductoService {

	@Autowired
	private ITipoProductoDao clienteDao;
	

	@Override
	@Transactional 
	public TipoProducto crearCliente(TipoProducto cliente) {	
			return clienteDao.save(cliente);
	}



	@Override
	@Transactional
	public List<TipoProducto> listarCliente() {
		return (List<TipoProducto>) clienteDao.findAll();
	}


	@Override
	@Transactional
	public void eliminarCliente(Long id) {
		clienteDao.deleteById(id);
	}



	@Override
	@Transactional
	public TipoProducto  editarCliente(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}


}
