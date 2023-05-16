package com.cursoceat.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ActividadOnceOcho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socio[] tablaSocios=new Socio[4];
		tablaSocios[0]= new Socio("06406020q","Pepe");
		tablaSocios[1]= new Socio("70808090w","Juan");
		tablaSocios[2]= new Socio("06551144c","Luis");
		tablaSocios[3]= new Socio("70717273x","Carmen");
		System.out.println(Arrays.deepToString(tablaSocios));
		
		try(ObjectOutputStream salida= new ObjectOutputStream( new
				FileOutputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\socios.dat"))){
			salida.writeObject(tablaSocios);
		}catch (IOException ex) {
			System.out.println(ex);
		}
	try(ObjectInputStream entrada= new ObjectInputStream(
			new FileInputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\socios.dat"))){
		tablaSocios = (Socio[])entrada.readObject();
	}catch (IOException | ClassNotFoundException ex) {
		System.out.println(ex);
	}
	System.out.println(Arrays.deepToString(tablaSocios));
	
	
	}

}
