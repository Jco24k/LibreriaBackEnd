package com.idat.springbootweb.app.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "producto")
@Data
@Table(name="producto")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String marca;
	
	private String descripcion;

	private int stock;
	
	private float precio;
	
	@OneToOne
	@JoinColumn(name="id_proveedor")
	private Proveedor proveedor;
	
	@OneToOne
	@JoinColumn(name="id_tipo_producto")
	private TipoProducto tipo;
	

}
