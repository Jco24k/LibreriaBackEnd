package com.idat.springbootweb.app.service;
import java.util.List;

import com.idat.springbootweb.app.entity.Almacen;
import com.idat.springbootweb.app.entity.Cliente;
import com.idat.springbootweb.app.entity.DetalleAlmacen;





public interface IDetalleAlmacenService{
		public List<DetalleAlmacen> listarDetVenta();
		public DetalleAlmacen crearDetVenta(DetalleAlmacen detalleVenta);
		public DetalleAlmacen editarDetVenta(Long id);
		public void eliminarDetVenta(Long id);
		public List<DetalleAlmacen> buscar_x_nombre(Long id_almacen);
		public DetalleAlmacen actualizarDetVenta(Long id_almacen,Long id_producto);
}
