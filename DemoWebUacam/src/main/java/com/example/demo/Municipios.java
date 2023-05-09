package com.example.demo;

public class Municipios {

	private int id;
	private String cabecera;
	private String cveInegi;
	private String nombre;
	
	public Municipios() {
		
	}

	public Municipios(int id, String cabecera, String cveInegi, String nombre) {
		super();
		this.id = id;
		this.cabecera = cabecera;
		this.cveInegi = cveInegi;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCabecera() {
		return cabecera;
	}

	public void setCabecera(String cabecera) {
		this.cabecera = cabecera;
	}

	public String getCveInegi() {
		return cveInegi;
	}

	public void setCveInegi(String cveInegi) {
		this.cveInegi = cveInegi;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
