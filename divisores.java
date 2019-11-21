/*
 * Propósito: Calcular los divisores de dos números y los divisores comunes.
 * Entradas: numero, numero2
 * Salidas: divisoresnumero, divisoresnumero2, eco datos
 * 
 * Variables:
 * Enteros: numero, numero2, divisoresnumero, divisoresnumero2, i, j, k
 * 
 * PSEUDOCODIGO GENERALIZADO
 *  Inicio Programa
 *	 Introducir Y validar Numeros
 *	 Calcular divisores individuales
 * 	 Calcular divisores comunes
 * 	 Mostrar divisores individuales y comunes
 * 	Fin Programa
 * 
 * PSEUDOCODIGO ESPECIFICO
 * 
 * Inicio Programa
 * 
 * repetir
 * 	 Escribir("Introduce el primer numero")
 * 	 Leer(numero)
 * 	  si(numero < 0)
 * 		Escribir("No es un numero valido")
 *    fin si
 * mientras(numero < 0)	 
 * 
 * repetir
 * 	 Escribir("Introduce el segundo numero")
 * 	 Leer(numero2)
 * 	  si(numero2 < 0)
 * 		Escribir("No es un numero valido")
 *    fin si
 * mientras(numero2 < 0)
 * 
 * 	para(i = 0; i < numero; i++)
 * 		si(numero % i == 0)
 * 			Escribir("Los divisores son: "+i)
 *  	fin si
 * 	fin para
 * 
 * 	para(j = 0; j < numero2; j++)
 * 		si(numero % j == 0)
 * 			Escribir("Los divisores son: "+j)
 *  	fin si
 * 	fin para
 * si(numero < numero2)
 * 
 * 	para(k = 0; k < numero; k++)
 * 		si((numero % k == 0) && (numero2 % k == 0))
 * 			Escribir("Los divisores comunes son: +k)
 * 		fin si
 * fin para
 * 
 * si no
 * 	para(k = 0; k < numero2; k++)
 * 		si((numero % k == 0) && (numero2 % k == 0))
 * 			Escribir("Los divisores comunes son: +k)
 * 		fin si
 *  fin para
 * 
*/

import java.io.*;
import java.util.Scanner;
 
public class divisores {
	
	public static void main (String[] args) {

Scanner teclado = new Scanner(System.in);
int numero = 0;
int numero2 = 0;
int i = 0;
int j = 0;
int k = 0;

	
	do{
		System.out.print("Introduce el primer numero: ");
		numero = teclado.nextInt();
		if(numero < 0){
			System.out.print("No es un numero valido");
		}
	}while(numero < 0);
		
	do{
		System.out.print("Introduce el segundo numero: ");
		numero2 = teclado.nextInt();
		if(numero2 < 0){
			System.out.print("No es un numero valido");
		}
		
	}while(numero2 < 0);
	
	for(i = 1; i < numero; i++){
		if(numero % i == 0){
			System.out.println("Los divisores de "+numero+" son: "+i);
		}
	 }
	
	for(j = 1; j < numero2; j++){
		if(numero2 % j == 0){
			System.out.println("Los divisores de "+numero2+" son: "+j);
		}
	 }
	if(numero < numero2){
	for(k = 1; k < numero; k++){
		if((numero % k == 0) && (numero2 % k == 0)){
			System.out.println("Los divisores comunes son:"+k);
		}
		
	 }
	}else{
	for(k = 1; k < numero2; k++){
		if((numero % k == 0) && (numero2 % k == 0)){
			System.out.println("Los divisores comunes son:"+k);
		}
	  }		
	}
  }
}

