/* 
Propósito: Leer caracteres introducidos por teclado e imprimir las veces que se han introducido mayusculas, signos de puntuacion y el mismo caracter de forma consecutiva.
Entrada: inicioPrograma, caracteres, repeticionPrograma
Salidas: eco datos, numeroMayusculas, numeroSimbolos, numeroConsecutivos

Variables: 
char inicioPrograma, caracter, caracterAnterior, repeticionPrograma
enteros: numeroMayusculas, numeroSimbolos, numeroConsecutivos, total, porcMayusculas, porcSimbolos, porcConsecutivos 

--PSEUDOCODIGO GENERALIZADO--
Inicio Programa
	Pregunta inicio programa
	Bucle introduccion caracteres
	Bucle identificador de caracteres
	Informe de los resultados
Fin Programa

--PSEUDOCODIGO ESPECIFICO--

Inicio Programa
	Escribir("Deseas ejecutar el programa? S/N: ")
	Leer(inicioPrograma)
	mientras(inicioPrograma = S)
	  hacer
	   	hacer
	  		Escribir("Introduce un caracter, cuando desees dejar de introducir caracter introduzca "*".)
	  		Leer(caracter)
	  			si (caracter = caracterAnterior)
	  				numeroConsecutivo++
	  				total++
	  			sino 
	  			  si(caracter es mayusculas)
	  				numeroMayusculas++
	  				total++
	  			sino 
	  			  si(caracter = '?' O caracter = '¿' O caracter = '!' O caracter = '¡' O caracter = '.' O caracter = ':' O caracter = ',' O caracter = ';' O  caracter = "-")
	  				numeroSimbolos++
	  				total++
					sino
					total++
	  			caracter = caracterAnterior
	  		
	  	mientras(caracter != '*')
	  	
	  		Escribe("La cantidad de mayusculas introducidas ha sido "+numeroMayusculas+", el numero de simbolos ha sido "+numeroSimbolos+," y el numero de caracteres introducidos consecutivos "+numeroConsecutivos+".")
	  		porcMayusculas = numeroMayusculas/total * 100
	  		porcSimbolos = numeroSimbolos/total * 100
	  		porcConsecutivos = numeroConsecutivos/total * 100
	  		Escribe("El porcentaje de mayusculas es "+porcMayusculas+)
	  		Escribe("El porcentaje de simbolos es "+porcSimbolos+)
	  		Escribe("El porcentaje de numeros consecutivos es "+porcConsecutivos+)
	  		Escribe("Deseas repetir el programa? S/N: ")
	  		Leer(repeticionPrograma)
	  mientras(repeticionPrograma = S)
    fin mientras
 Escribir("Hasta luego")
Fin Programa
*/

import java.io.*;
import java.util.Scanner;

public class caracteres{
	public static void main (String [] args){
	
char inicioPrograma = ' ';
char caracter = ' ';
char caracterAnterior = ' ';
char repeticionPrograma = ' ';
int numeroMayusculas = 0;
int numeroSimbolos = 0;
int numeroConsecutivos = 0;
int porcMayusculas = 0;
int porcSimbolos = 0;
int porcConsecutivos = 0;
int total = 0;
Scanner teclado = new Scanner(System.in);

		System.out.print("Deseas iniciar el programa? S/N: ");
		inicioPrograma = teclado.next().charAt(0);
		inicioPrograma = Character.toUpperCase(inicioPrograma);
		while(inicioPrograma == 'S'){
		 do{
				porcMayusculas = 0;
	 			porcSimbolos = 0;
				porcConsecutivos = 0;
				numeroMayusculas = 0;
				numeroSimbolos = 0;
				numeroConsecutivos = 0;
				total = 0;
			do{
				System.out.print("Introduzca un caracter. Cuando desee parar introduzca un '*': ");
				caracter = teclado.next().charAt(0);
				if(caracter == caracterAnterior){
					numeroConsecutivos++;
					total++;
				}
				else
				 if(Character.isUpperCase(caracter)){
					numeroMayusculas++;
					total++;
				 }
				 else 
			   	  if((caracter == '!') || (caracter == '?') || (caracter == '.') || (caracter == ',') || (caracter == ':') || (caracter == ';')){
					numeroSimbolos++;
					total++;
				  }
				   else{
					total++;
				   }
				caracterAnterior = caracter;
			}while(caracter != '*');
			porcMayusculas = (numeroMayusculas/total) * 100;
			porcSimbolos = (numeroSimbolos/total) * 100;
			porcConsecutivos = (numeroConsecutivos/total) * 100;
			System.out.println("El numero de mayusculas ha sido "+numeroMayusculas+", el numero de simbolos "+numeroSimbolos+" y el numero de caracteres consecutivos "+numeroConsecutivos+"."); 
			System.out.println("El porcentaje de mayusculas es "+porcMayusculas+".");
			System.out.println("El porcentaje de simbolos es "+porcSimbolos+".");
			System.out.println("El porcentaje de caracteres consecutivos es "+porcConsecutivos+".");
		
		System.out.print("Deseas repetir el programa? S/N: ");
		repeticionPrograma = teclado.next().charAt(0);
		repeticionPrograma = Character.toUpperCase(repeticionPrograma);
	
  }while(repeticionPrograma == 'S');
 }
}
}

