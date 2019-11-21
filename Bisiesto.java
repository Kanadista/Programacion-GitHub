/*
Propósito: Saber si un año es bisiesto o no.
Entradas: fecha
Salida: eco datos

Programa: Principal
	Inicio
	//obtener datos
	Escribir("Introduzca un año")
	Leer(año)
	SI((año MOD 400 == 0) O ((año MOD 4 == 0) Y (año MOD 100 != 0))
	Escribe("Es un año bisiesto")
	SI_NO
	Escribe("No es un año bisiesto")
	FIN_SI
	Fin
*/

import java.util.Scanner;
import java.io.*;

public class Bisiesto{
	public static void main (String [] args){
	 Scanner teclado = new Scanner(System.in);
	 int fecha = 0;
	 
	 //obtener la fecha
	 System.out.print("Introduzca una fecha:");
	 fecha = teclado.nextInt();
	 if(fecha<1500){
	 System.out.println("No es una fecha valida");
 }
	 else{
	 if((fecha%400 == 0)||(fecha%4 == 0 && fecha%100 != 0)){
       System.out.println("Es una fecha bisiesta");
	 } 
	else{
		System.out.println("No es una fecha bisiesta");
	  }
	}
  }
	
} //Fin programa principal
