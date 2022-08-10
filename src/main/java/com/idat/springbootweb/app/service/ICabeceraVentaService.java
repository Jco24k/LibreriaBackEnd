package com.idat.springbootweb.app.service;
import java.util.List;

import com.idat.springbootweb.app.entity.CabeceraVenta;




public interface ICabeceraVentaService {
		public List<CabeceraVenta> listarCabVenta();
		public CabeceraVenta crearCabVenta(CabeceraVenta cabeceraVenta);
		public CabeceraVenta editarCabVenta(Long id);
		public void eliminarCabVenta(Long id);
}
