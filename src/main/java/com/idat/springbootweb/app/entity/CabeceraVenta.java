package com.idat.springbootweb.app.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="boleta_venta_cab")
public class CabeceraVenta implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	@JoinColumn(name="id_usuario")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name="id_cliente")
	private Cliente cliente;
	
	
	private float total;
	
	private Date fecha_emision;
	

}
