package com.idat.springbootweb.app.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class DetalleVentaId implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idCabecera;

	private Long idProducto;

	public DetalleVentaId(Long cabeceraId, Long productoId) {
		this.idCabecera = cabeceraId;
		this.idProducto = productoId;
	}

	public DetalleVentaId() {
		
	}

	
	

}
