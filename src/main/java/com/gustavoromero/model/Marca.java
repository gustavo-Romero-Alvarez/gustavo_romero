package com.gustavoromero.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "marca")
public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_Marca;
	
	@Size(min = 3, message = "Descripcion debe tener minimo 3 caracteres")
	@Column(name = "descripcion", nullable = false, length = 150)
	private String descripcion;
	
	@Size(min = 3, message = "Direccion debe tener minimo 3 caracteres")
	@Column(name = "direccion", nullable = false, length = 120)
	private String direccion;
	
	@Size(min = 3, message = "Ciudad debe tener minimo 3 caracteres")
	@Column(name = "ciudad", nullable = false, length = 80)
	private String ciudad;
	
	@OneToMany(mappedBy = "marca", cascade = { CascadeType.ALL }, orphanRemoval = true)
	private List<Producto> producto;
	
	

	public Integer getId_Marca() {
		return id_Marca;
	}

	public void setId_Marca(Integer id_Marca) {
		this.id_Marca = id_Marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Producto> getProducto() {
		return producto;
	}

	public void setProducto(List<Producto> producto) {
		this.producto = producto;
	}
	
	
	
	
	
	

}
