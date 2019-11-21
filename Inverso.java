/*Proposito: Calcular el inverso de un número.
Entrada: numero
Salida: numero

Variables: 
 Reales: numero

Programa: Principal
	Inicio
	//obtener numero
	Escribir("Introduzca un numero")
	Leer(numero)
	//bucle si
	SI(numero==0)
		Escribir("0 no es un numero correcto)
	 SI_NO
		numero = -numero
	FIN_SI
*/

import java.util.Scanner;
import java.io.*;

public class Inverso{
	
	public static void main (String [] args){
		
		Scanner teclado = new Scanner(System.in);
		double numero = 0;
		
	//obtener numero
	System.out.print("Introduzca un numero: ");
	numero = teclado.nextDouble();
	
	//calcular inverso
	if(numero == 0){
		System.out.print("0 no es un numero valido");
	}
	else{
		numero = numero*-1;
		System.out.println("El inverso del numero es: "+numero);
	}
	
	
	
	
	}
	
	
}
