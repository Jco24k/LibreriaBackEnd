package com.idat.springbootweb.app.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.idat.springbootweb.app.dao.IProductoDao;
import com.idat.springbootweb.app.entity.Producto;


@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDao clienteDao;
	

	@Override
	@Transactional 
	public Producto crearProducto(Producto producto) {	
			return clienteDao.save(producto);
	}



	@Override
	@Transactional
	public List<Producto>  buscar_x_marca(String nombre) {
		return (List<Producto>) clienteDao.findByMarcaStartingWith(nombre);
	}


	@Override
	@Transactional
	public List<Producto> listarProducto() {
		return (List<Producto>) clienteDao.findAll();
	}


	@Override
	@Transactional
	public void eliminarProducto(Long id) {
		clienteDao.deleteById(id);
	}


	@Override
	@Transactional
	public Producto  editarProducto(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}



	@Override
	public List<Producto> buscar_x_almacen(Long id_almacen) {
		return clienteDao.findByProductosAlmacen(id_almacen);
	}


}
