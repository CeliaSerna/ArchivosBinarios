package com.cursoceat.controller;

import java.io.Serializable;

public class Socio implements Serializable{

	protected String dni;
	protected String nombre;
	
	public Socio(String dni, String nombre) {
		
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Socio [DNI=" + dni + ", Nombre=" + nombre + "]";
	}
	
	
	
}
