package com.cursoceat.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AcitividadOnceSeis {

	public static void main(String[] args) {
	
	try(ObjectInputStream flujoEntrada = new ObjectInputStream(
			new FileInputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\estrofa.dat"))){
		
	String cancion= (String)flujoEntrada.readObject();
	System.out.println(cancion);
		
	}catch (IOException e) {
		System.out.println(e.getMessage());
	}catch(ClassNotFoundException ex) {
		System.out.println(ex);
	}
			
			
		
		
		
		

	}

}
