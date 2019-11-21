/*
Propósito: Simular una partida de piedra, papel o tijeras
Entradas: Ejecucion programa, eleccion, repeticion programa
Salidas: Eleccion maquina, resultado, contadorVictorias, contadorDerrotas, contadorEmpates

Variables: 
Enteros: eleccion, eleccionMaquina
caracteres: ejecucion, repeticion

Inicio Programa
	ejecucion = ' '
	repeticion = ' '
	eleccion = 0
	contadorVictorias = 0
	contadorDerrotas = 0
	contadorEmpates = 0

		Escribir("Deseas ejecutar el programa?")
		Leer(ejecucion)
		 SI(ejecucion = "S")
			hacer
			 Escribir("Escoge una de las siguientes opciones: 1. Piedra | 2. Papel | 3. Tijeras")
			  Leer(eleccion)
			  hacer
				SI(eleccion < 0 O eleccion > 3)
					Escribir("No es una entrada válida")
			  mientras(eleccion < 0 O eleccion > 3)
			 eleccionMaquina = nuevoRandom(3)+1
			 
			 SI(eleccion = 1 Y eleccionMaquina = 1)
				Escribir("El jugador escoge piedra y la máquina piedra.")
				Escribir("Es un empate.")
				contadorEmpates++
				SINO
					SI(eleccion = 1 Y eleccionMaquina = 2)
						Escribir("El jugador escoge piedra y la máquina papel.")
						Escribir("Has perdido.")
						contadorDerrotas++
						SINO
							SI(eleccion = 1 Y eleccionMaquina = 3)
								Escribir("El jugador escoge piedra y la máquina tijeras.")
								Escribir("Has ganado.")
								contadorVictorias++
								SINO
									SI(eleccion = 2 Y eleccionMaquina = 1)
										Escribir("El jugador escoge papel y la máquina piedra.")
										Escribir("Has ganado.")
										contadorVictorias++
										SINO
											SI(eleccion = 2 Y eleccionMaquina = 2)
												Escribir("El jugador escoge papel y la máquina papel.")
												Escribir("Es un empate.")
												contadorEmpates++
												SINO
													SI(eleccion = 2 Y eleccionMaquina = 3)
														Escribir("El jugador escoge papel y la máquina tijeras.")
														Escribir("Has perdido.")
														contadorDerrotas++;
														SINO
															SI(eleccion = 3 Y eleccionMaquina = 1)
																Escribir("El jugador escoge tijeras y la máquina piedra.")
																Escribir("Has perdido.")
																contadorDerrotas++;
																SINO
																	SI(eleccion = 3 Y eleccionMaquina = 2)
																		Escribir("El jugador escoge tijeras y la máquina papel.")
																		Escribir("Has ganado.")
																		contadorVictorias++;
																		SINO
																			Escribir("El jugador escoge tijeras y la máquina tijeras.")
																			Escribir("Es un empate.")
																			contadorEmpates++;
																		
			
			 Escribir("Deseas repetir el programa?")
			 Leer(repeticion)
			mientras(repeticion = "S")			
			
			Escribir("Ha habido un total de "+contadorVictorias+ "victorias, un total de "+contadorDerrotas+" derrotas, y un total de "+contadorEmpates+" empates.		
	
	Escribir("Hasta luego")
Fin Programa
*/

import java.io.*;
import java.util.Scanner;
import java.util.Random;


 public class ppt{
		public static void main(String [] args){
		
		char ejecucion = ' ';
		char repeticion = ' ';
		int eleccion = 0;
		int eleccionMaquina = 0;
		int contadorVictorias = 0;
		int contadorDerrotas = 0;
		int contadorEmpates = 0;
		Random rnd = new Random();
		Scanner teclado = new Scanner(System.in);
		
		
		
			System.out.print("Deseas ejecutar el programa? S/N: ");
			 ejecucion = teclado.next().charAt(0);
			 ejecucion = Character.toUpperCase(ejecucion);
			  if(ejecucion == 'S'){
				 do{ //ESCOGER MOVIMIENTO
					 do{ //VALIDACION DE ENTRADA
						System.out.print("Escoge una de las siguientes opciones: 1.Piedra | 2.Papel | 3.Tijeras: ");
						eleccion = teclado.nextInt();
						 if(eleccion < 1 || eleccion > 3){
						  System.out.println("No es una entrada valida.");
						}
					}while(eleccion < 1 || eleccion > 3);
						
					eleccionMaquina = rnd.nextInt(3)+1; //ASIGNAR NUMERO ALEATORIO A LA ELECCION DE LA MAQUINA
					
					if(eleccion == 1 && eleccionMaquina == 1){ 
						System.out.println("El jugador escoge piedra y la maquina piedra.");
						System.out.println("Es un empate.");
						contadorEmpates++;
					}else
						if(eleccion == 1 && eleccionMaquina == 2){
							System.out.println("El jugador escoge piedra y la maquina papel.");
							System.out.println("Has perdido.");
							contadorDerrotas++;
						}else
							if(eleccion == 1 && eleccionMaquina == 3){
								System.out.println("El jugador escoge piedra y la maquina tijeras.");
								System.out.println("Has ganado.");
								contadorVictorias++;
							}else
								if(eleccion == 2 && eleccionMaquina == 1){
									System.out.println("El jugador escoge papel y la maquina piedra.");
									System.out.println("Has ganado.");
									contadorVictorias++;
								}else
									if(eleccion == 2 && eleccionMaquina == 2){
										System.out.println("El jugador escoge papel y la maquina papel.");
										System.out.println("Es un empate.");
										contadorEmpates++;
									}else
										if(eleccion == 2 && eleccionMaquina == 3){
											System.out.println("El jugador escoge papel y la maquina tijeras.");
											System.out.println("Has perdido.");
											contadorDerrotas++;
										}else
											if(eleccion == 3 && eleccionMaquina == 1){
												System.out.println("El jugador escoge tijeras y la maquina piedra.");
												System.out.println("Has perdido.");
												contadorDerrotas++;
											}else
												if(eleccion == 3 && eleccionMaquina == 2){
													System.out.println("El jugador escoge tijeras y la maquina papel.");
													System.out.println("Has ganado.");
													contadorVictorias++;
												}else
													if(eleccion == 3 && eleccionMaquina == 3){
													System.out.println("El jugador escoge tijeras y la maquina tijeras.");
													System.out.println("Es un empate.");
													contadorEmpates++;
												}
							
			System.out.print("Deseas repetir el programa? S/N: ");
			repeticion = teclado.next().charAt(0);
			repeticion = Character.toUpperCase(repeticion);
    }while(repeticion == 'S'); //WHILE REPETICION
		System.out.println("Ha habido un total de "+contadorVictorias+" victorias, un total de "+contadorDerrotas+" derrotas, y un total de "+contadorEmpates+" empates."); //RECUENTO 
   } //FIN SI EJECUCION
   System.out.println	("Hasta luego");
 }	 
}
		
		
		
		
		
		
		
		
		




