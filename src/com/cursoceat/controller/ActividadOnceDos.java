package com.cursoceat.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ActividadOnceDos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String estrofa= "Con diez cañones por banda,\n"
			+"viento en popa a toda vela,\n"
			+"no corta el mar, sino vuela, \n"
			+"un velero bergantín.";
	
	try(ObjectOutputStream out= new ObjectOutputStream(new
		FileOutputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\estrofa.dat"))){
		out.writeObject(estrofa);
	}catch (IOException ex) {
		System.out.println(ex.getMessage());
	}
	
	
	
	
	}

}
