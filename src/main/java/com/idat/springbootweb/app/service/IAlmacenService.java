package com.idat.springbootweb.app.service;
import java.util.List;

import com.idat.springbootweb.app.entity.Almacen;
import com.idat.springbootweb.app.entity.Cliente;
import com.idat.springbootweb.app.entity.DetalleAlmacen;





public interface IAlmacenService{
		public List<Almacen> listarDetVenta();
		public Almacen crearDetVenta(Almacen detalleVenta);
		public Almacen editarDetVenta(Long id);
		public void eliminarDetVenta(Long id);
		public Almacen buscar_x_nombre(String nombre);
}
