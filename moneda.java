/*
 Proposito: Lanzar dos monedas y contar cuantas veces salen 2 caras, 2 cruces y cara y cruz.
 Entrada: Repeticion programa
 Salida: Numero caras, numero cruz, numero ambas, numero total, random
 Variables
Entero: cara, cruz, resultadocara, resultadocruz, resultadoambos, tiradasTotales, random
	Programa: Principal
	 Inicio
	 para(tiradasTotales = 0, mientras tiradasTotales<12, tiradasTotales++)
	  Generar numero random1 (0, 1)
	  Generar numero random2 (0,1)
	   SI (numerorandom1 == 0 Y numerorandom2 == 0)
	    cara++
		SI_NO (numerorandom == 1 Y numerorandom ==1)
		 cruz++
		  SI_NO
		   ambos++
	  finpara
	  Escribir ("En 12 tiradas," cara "han sido 2 caras," cruz", han sido cruz y" ambas" han sido cara/cruz.")
Fin.

*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class moneda{
	public static void main (String [] args){
	Scanner teclado = new Scanner(System.in);
	Random rnd = new Random();
	int doscara = 0; 
	int doscruz = 0;
	int caracruz = 0;
	int tiradas = 0;
	int moneda1 = 0;
	int moneda2 = 0;
	int entrada = 0;
	char vcb = ' ';
	

	do{	
	entrada = doscara = caracruz = doscruz = 0;
	do{
	System.out.print("Cuantas veces quieres tirar las monedas?: ");
	entrada = teclado.nextInt();
	
	if(entrada>0){
		
		for (tiradas = 0; tiradas < entrada; tiradas++){
		
			moneda1 = rnd.nextInt(2);
			moneda2 = rnd.nextInt(2);
			switch(moneda1){
				case 0:
				 switch(moneda2){
					case 0: 
					doscara++;
					break;
					case 1: 
					caracruz++;
					break;
				 }
				break;
				case 1:
				 switch(moneda2){
					case 0:
					caracruz++;
					break;
					case 1:
					doscruz++;
				break;
				 }
		
		}		
	}
 

	System.out.println("En " +tiradas+ " tiradas, "+doscara+" han sido dos caras seguidas, "+doscruz+" han sido dos cruces seguidas y "+caracruz+" han sido cara/cruz.");
  }else{
  System.out.println("No es un numero valido");
  }
	}while(entrada<=0);
	System.out.print("Quieres repetir el programa? S/N: ");
	  vcb = teclado.next().charAt(0);
	  vcb = Character.toUpperCase(vcb);
	}while(vcb == 'S');
 
}
}
