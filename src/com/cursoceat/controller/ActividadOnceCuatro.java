package com.cursoceat.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ActividadOnceCuatro {

	public static void main(String[] args) {
		

		/**
		 * leer el archivo datos.dat con readInt
		 */
	try(ObjectInputStream flujoEntrada = new ObjectInputStream(
		new FileInputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\datos.dat"))){
		int [] tabla= new int[10];
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i]=flujoEntrada.readInt();
			//System.out.print(tabla[i]);
		}
		System.out.println(Arrays.toString(tabla));
	}catch (IOException e) {
		System.err.println("error");
	}
			
		
		
	}

}
