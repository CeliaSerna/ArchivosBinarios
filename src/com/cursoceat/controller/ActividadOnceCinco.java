package com.cursoceat.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ActividadOnceCinco {
	public static void main(String[] args) {

	try(ObjectInputStream flujoEntrada = new ObjectInputStream(
		new FileInputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\datos.dat")))
	{
		int[] tabla = (int[]) flujoEntrada.readObject();
		System.out.println(Arrays.toString(tabla));
		//si usamos readOject para leer hay que usar
		//writeObject para escribir
		

	}catch (IOException e) {
		System.out.println("Error");		
	}catch (ClassNotFoundException e) {
		System.out.println("El fichero no almacena un objeto tabla");
	}
	
}
}