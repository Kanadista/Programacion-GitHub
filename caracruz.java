/*
Propósito: Lanzar una moneda e imprimir si ha sido cara o cruz.
Entradas: repeticion programa
Salidas: resultado moneda
Variables: 
 Entero: resultado, random
 Programa: Principal
	Inicio
		Generar numero aleatorio
	 SI(resultado == 0)
	  Escribir("Ha sido cara")
	 SI NO 
	  Escribir("Ha sido cruz")
	 FIN SI
	FIN

*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class caracruz{
	public static void main (String [] args){
	
	Scanner teclado = new Scanner(System.in);
	Random rnd = new Random();
	char vcb = ' ';
	int moneda = 0;
	
	do{
		moneda = rnd.nextInt(2);
		if(moneda == 0){
			System.out.println("Es cara");
		}else{
			System.out.println("Es cruz");
		}
	System.out.print("Quieres repetir el programa? S/N: ");
	  vcb = teclado.next().charAt(0);
	  vcb = Character.toUpperCase(vcb);				
  }while(vcb == 'S');		
 }	
}
