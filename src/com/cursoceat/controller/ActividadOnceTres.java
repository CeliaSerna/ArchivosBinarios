package com.cursoceat.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class ActividadOnceTres {
	
static Scanner entrada = new Scanner(System.in);
	
public static void main(String[] args) {
	try(ObjectOutputStream out= new ObjectOutputStream(
new FileOutputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\datos2.dat")))
		{
	System.out.println("Escriba el numero de elementos");
	int numero  = entrada.nextInt();
	double tabla[]= new double[numero];
	  for(int i=0; i<tabla.length; i++) {
	  System.out.println("Introduzca un numero real");
	  tabla[i]=new Scanner(System.in).useLocale(Locale.US).nextDouble();
	   
	   }
	  out.writeObject(tabla);
	//para la escritura usamos writeObject
	//para la lectura usamos readObject
		}
	
	catch (IOException e) {
		System.err.println(e.getMessage());
	}
	
		
		
		
	}



}
