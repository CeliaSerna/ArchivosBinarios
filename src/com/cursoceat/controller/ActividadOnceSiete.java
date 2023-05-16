package com.cursoceat.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ActividadOnceSiete {
static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	try(ObjectOutputStream salida= new ObjectOutputStream(
			new FileOutputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\numeros.dat"))){
		System.out.println("Escribe numero entero");
		int numero = entrada.nextInt();
	while(numero!=-1) {
		salida.writeInt(numero);
		System.out.println("Escribe numero entero");
		 numero= entrada.nextInt();
		
	}
	}catch (IOException e) {
		System.out.println(e.getMessage());
	}
	//////////abrimos flujo de entrada	
	try(ObjectInputStream entrada= new ObjectInputStream(new
			FileInputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\numeros.dat"));ObjectOutputStream salida = new
			ObjectOutputStream(new FileOutputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\numerosCopia.dat"))){
		System.out.print("[");
		while (true) {
			int numero = entrada.readInt();
			System.out.print(numero + " ");
			salida.writeInt(numero);
			
		}
	}catch (EOFException ex) {
		System.out.println("]\nFiin de fichero");
	}catch (IOException ex) {
		System.out.println(ex);
	}
			
	
	
	
	
	}

}
