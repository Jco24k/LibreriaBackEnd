package com.idat.springbootweb.app.service;
import java.util.List;

import com.idat.springbootweb.app.entity.Cliente;
import com.idat.springbootweb.app.entity.Proveedor;




public interface IProveedorService {
		public List<Proveedor> listarCliente();
		public Proveedor  crearCliente(Proveedor  cliente);
		public Proveedor  editarCliente(Long id);
		public void eliminarCliente (Long id);
}
