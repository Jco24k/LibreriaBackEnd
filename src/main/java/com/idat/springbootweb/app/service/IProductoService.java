package com.idat.springbootweb.app.service;
import java.util.List;
import com.idat.springbootweb.app.entity.Producto;




public interface IProductoService {
		public List<Producto> listarProducto();
		public Producto  crearProducto(Producto  producto);
		public Producto  editarProducto(Long id);
		public List<Producto> buscar_x_marca(String nombre);
		public void eliminarProducto (Long id);
		
		public List<Producto> buscar_x_almacen(Long id_almacen);
}
