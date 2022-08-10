package com.idat.springbootweb.app.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
public class DetalleAlmacenId implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long idAlmacen;

	private Long idProducto;

	public DetalleAlmacenId(Long almacenId, Long productoId) {
		this.idAlmacen = almacenId;
		this.idProducto = productoId;
	}

	public DetalleAlmacenId() {
		
	}

	
	

}
