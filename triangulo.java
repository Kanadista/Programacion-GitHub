/* 
 *
 * Propósito: Imprimir en pantalla un triángulo cuya base sea un número introducido por el usuario.
 * Entradas: inicioPrograma, numero, acumulador, repeticionPrograma
 * Salidas: eco datos, triangulo
 * 
 * Variables
 * Enteros: numero, i, j, opcion, numero2
 * Char: inicioPrograma, repeticionPrograma, caracter
 * 
 * PSEUDOCODIGO GENERALIZADO
 * Inicio Programa
 *  Preguntar ejecuccion Programa
 *  Introducir numero
 *  Leer y validar numero
 * 	Introducir caracter
 *  Bucle For para imprimir triangulo
 *  Preguntar repeticion Programa
 *  Despedir al usuario
 * Fin Programa
 * 
 * PSEUDOCODIGO ESPECIFICO
 * 
 * Inicio Programa
 *  Char inicioPrograma = ' '
 * 	Char repeticionPrograma = ' '
 *  Entero numero = 0
 *  Entero i = 0
 *  Entero j = 0
 *  Char caracter = ' '
 * 	Entero opcion = 0
 *  Entero numero2 = 0
 * 
 * 	Escribir("Desea ejecutar el programa? S/N: ")
 * 	Leer(inicioPrograma)
 * 	Si(inicioPrograma == 'S')
 * 		Repetir
 * 	
 * 			repetir
 * 			Escribir("Que deseas hacer? 1. Imprimir un triangulo | 2. Imprimir un cuadrado | 3. Imprimir un rectangulo | 0. Salir |: ")
 * 			Leer(opcion)
 * 			 si(opcion < 1 || opcion > 6)
 * 				Escribir("No es una entrada valida")
 * 			mientras(opcion < 1 || opcion > 6)
 * 			segun(opcion)
 * 				
 * 				caso 1:
 * 			 		repetir
 * 					Escribir("Introduzca un numero, este numero será la base del triángulo: ")
 *		   	 		Leer(numero)	
 * 			  		 si(numero <= 1)
 * 						Escribe("No es un numero valido")
 * 				     Fin si
 * 			 		mientras(numero <= 1)
 * 						Escribir("Introduzca el caracter con el que deseas realizar el triángulo")
 * 						Leer(caracter)
 * 						Para(i = 0, i < numero, i++)
 * 							Para(j = 0, j<=i, j++)
 * 							 Escribir(caracter)
 * 							Fin Para
 * 						Escribir(" ")
 * 						Fin Para
 * 				break;
 * 				
 * 				caso 2:
 * 					repetir
 * 					Escribir("Introduzca un numero, este numero sera igual a los lados del cuadrado: ")
 * 					Leer(numero)	
 * 			  		 si(numero <= 1)
 * 						Escribe("No es un numero valido")
 * 				     Fin si
 * 			 		mientras(numero <= 1)
 * 						Escribir("Introduzca el caracter con el que desea realizar el cuadrado")
 * 						Leer(caracter)
 * 						Para(i = 0, i < numero, i++)
 * 							para(j = 0, j < numero, j++)
 * 							Escribir(caracter)
 * 							fin para
 * 						Escribir(" ")
 * 						Fin Para
 * 				break;
 * 				
 * 				case 3: 
 * 					repetir
 * 						Escribir("Introduzca dos numeros, estos seran los lados del rectangulo. Ten en cuenta que no pueden ser el mismo numero.")
 * 						Escribir("Introduzca el primer numero: ")
 * 						Leer(numero)
 * 						Escribir("Introduzca el segundo numero: ")
 * 						Leer(numero2)
 * 					 si((numero <= 1 || numero2 <= 1) || (numero == numero2)
 * 						Escribir("No es una entrada valida, recuerda que deben ser numeros distintos.")
 * 					 fin si 
 * 					mientras((numero <= 1 || numero <=1) || (numero == numero2) 
 * 						Escribir("Introduzca el caractere con el que desea realizar el rectangulo")
 * 						Leer(caracter)
 * 						Para(i = 0, i < numero, i++)
 * 							para(j = 0, j < numero2, j++)
 * 							Escribir(caracter)
 * 							fin para
 * 						Escribir(caracter);
 * 						Escribir(" ");
 * 						fin para
 * 			    break; 
 * 
 * 		Escribir("Deseas repetir el programa? S/N: ")
 * 		Leer(repeticionPrograma)
 * 		Mientras(repeticionPrograma == 'S')
 * 		Escribir("Hasta luego.")
 * 	Fin Si
 * Fin Programa
 */
 
 import java.io.*;
 import java.util.Scanner;
 
public class triangulo{
		public static void main(String [] args){
	
	Scanner teclado = new Scanner(System.in);
	char inicioPrograma = ' ';
	char repeticion = ' ';
	char caracter = ' ';
	int numero = 0;
	int numero2 = 0;
	int i = 0;
	int j = 0;
	int opcion = 0;
	
	System.out.print("Deseas ejecutar el programa? S/N: ");
	inicioPrograma = teclado.next().charAt(0);
	inicioPrograma = Character.toUpperCase(inicioPrograma);
		if(inicioPrograma == 'S'){
			do{
				do{
				   System.out.print("Que desea hacer? 1. Imprimir un triangulo | 2. Imprimir un cuadrado | 3. Imprimir un rectangulo | 0. Salir |: ");
					opcion = teclado.nextInt();
					if(opcion < 0 || opcion > 3){
						System.out.println("No es una entrada valida.");
					}
				}while(opcion < 0 || opcion > 3);
			
			switch(opcion){
				
			case 1:	
				do{
					System.out.print("Introduzca un numero, este numero sera la base del triangulo: ");
					numero = teclado.nextInt();
					if(numero <= 1){
					System.out.println("No es un numero valido");
					}
				}while(numero <= 1);
				System.out.print("Introduzca el caracter con el que deseas realizar el triangulo: ");
				caracter = teclado.next().charAt(0);
				for(i = 0; i < numero; i++){ //BUCLE FILA
					for(j = 0; j <= i; j++){ //BUCLE CARACTER
						System.out.print(caracter);
					}
				 
				System.out.println(' ');
				}
				break;
			
			case 2:
				do{
					System.out.print("Introduzca un numero, este numero sera los lados del cuadrado: ");
					numero = teclado.nextInt();
					if(numero <= 1){
					System.out.println("No es un numero valido");
					}
				}while(numero <=1);
				System.out.print("Introduce el caracter con el que deseas realizar el cuadrado: ");
				caracter = teclado.next().charAt(0);
				for(i = 0; i < numero; i++){
					for(j = 0; j < numero; j++){
						System.out.print(caracter);
					}
				System.out.println(' ');
				}
				break;
				
			case 3:
				do{
					System.out.print("Introduzca dos numeros, estos numeros seran los lados del rectangulo. Ten en cuenta de que no pueden ser el mismo numero: \n");
					System.out.print("Introduzca el primer numero: ");
					numero = teclado.nextInt();
					System.out.print("Introduzca el segundo numero: ");
					numero2 = teclado.nextInt();
					if((numero <= 1 || numero2 <= 1) || (numero == numero2)){
							System.out.println("No es una entrada valida, recuerda que deben ser numeros distintos.");
					}
				}while((numero <= 1 || numero2 <= 1) || (numero == numero2));
				System.out.print("Introduce el caracter con el que deseas realizar el rectangulo: ");
				caracter = teclado.next().charAt(0);
				for(i = 0; i < numero; i++){
					for(j = 0; j < numero2; j++){
						System.out.print(caracter);
					}
				System.out.println(' ');
				}
				
					
			} //fin switch
			System.out.print("Deseas repetir el programa? S/N: ");
			repeticion = teclado.next().charAt(0);
			repeticion = Character.toUpperCase(repeticion);
		}while(repeticion == 'S'); //WHILE REPETICION
	}
		System.out.println("Hasta luego.");
 }
} 
