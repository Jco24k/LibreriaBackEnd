package com.idat.springbootweb.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
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

@Entity
@Data
@Table(name="detalle_almacen")
@IdClass(DetalleAlmacenId.class)
public class DetalleAlmacen implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long idAlmacen;
	
	@Id
	private Long idProducto;
	
	private int cantidad;
	
	private Date fecha_llegada;
	
	
	

}
