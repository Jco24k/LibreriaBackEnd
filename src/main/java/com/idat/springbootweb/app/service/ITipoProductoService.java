package com.idat.springbootweb.app.service;
import java.util.List;

import com.idat.springbootweb.app.entity.Cliente;
import com.idat.springbootweb.app.entity.TipoProducto;




public interface ITipoProductoService {
		public List<TipoProducto> listarCliente();
		public TipoProducto  crearCliente(TipoProducto  cliente);
		public TipoProducto  editarCliente(Long id);
		public void eliminarCliente (Long id);
}
