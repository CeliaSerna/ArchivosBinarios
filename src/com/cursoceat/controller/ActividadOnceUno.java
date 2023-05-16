package com.cursoceat.controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ActividadOnceUno implements Serializable{
	
	private static final long serialVersionUID = 1L;
//ACTIVIDAD 11.1//
	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**escribir en un archivo datos.dat los valores de 10 enteros**/
		
		int[] tabla = {0,1,2,3,4,5,6,7,8,9};
		ObjectOutputStream flujoSalida = null;
		
	try {
		flujoSalida = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PROGRAMACION\\Documentos\\JAVA\\FicherosBinarios\\archivos\\datos.dat"));
//se recorre el array tabla para escribir en datos.dat
	//pero al ser posible que el array sea tipo object
	//podemos implementar la escritura en una sola linea
	//con writeObjects
		//for(int i=0; i<tabla.length; i++) {
			flujoSalida.writeObject(tabla);
		//}//lo creamos como writeInt para poder leerlo con readInt
	}catch(IOException e) {
			System.err.println(e.getMessage());
		}finally {
			if(flujoSalida != null) {
				try {
					flujoSalida.close();
					
				}catch(IOException e) {
					System.err.println(e.getMessage());
				}
			}
		}
		
		
}
}
