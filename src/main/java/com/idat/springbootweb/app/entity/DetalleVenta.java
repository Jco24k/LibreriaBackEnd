package com.idat.springbootweb.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="boleta_venta_det")
@IdClass(DetalleVentaId.class)
public class DetalleVenta implements Serializable {
	private static final long serialVersionUID = 1L;

	
	
	@Id
	private Long idCabecera;
	@Id
	private Long idProducto;
	
	
	private int cantidad;

	private float precio;
	
	private String tipo_descuento;
	
	private float descuento;
	
	private float sub_total;
}
