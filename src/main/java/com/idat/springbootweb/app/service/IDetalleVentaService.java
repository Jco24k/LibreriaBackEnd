package com.idat.springbootweb.app.service;
import java.util.List;
import com.idat.springbootweb.app.entity.DetalleVenta;




public interface IDetalleVentaService{
		public List<DetalleVenta> listarDetVenta();
		public DetalleVenta crearDetVenta(DetalleVenta detalleVenta);
		public DetalleVenta editarDetVenta(Long id);
		public void eliminarDetVenta(Long id);
}
