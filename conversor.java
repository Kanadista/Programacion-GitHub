/*
Propósito: Convertir monedas
Entradas: Repeticion programa, moneda a cambiar, moneda a la que realizar el cambio, cantidad a convertir
Salidas: eco datos, cantidad convertida
Precondiciones: La cantidad a convertir sera mayor a 0
Variables
Real: cantidad a convertir, cantidad convertida
Entero: moneda a cambiar, moneda a la que realizar el cambio
Caracter: repetiion programa

 hacer
	Inicio programa
	 Escribir("Que moneda quieres convertir: 1.Euros 2.Dolares. 3.Libras 4.Rublos 5.Won coreanos")
		Leer(monedaInicial)
		Validar datos
	 Escribir("A que moneda quieres convertir: 1.Euros 2.Dolares 3.Libras 4.Rublos 5.Won coreanos")
		Leer(monedaFinal)
		Validar datos
	 Escribir("Cuanto quieres convertir")
	 Leer(cantidad)
	 
	 Segun(monedaInicial)
		para(1)
			Segun(monedaFinal)
				para(1)
					Escribir("Es la misma moneda")
				para(2)
					cantidad * 0.86
					Escribir("La cantidad es"cantidad" dolares.")
				para(3)
					cantidad * 70.39
					Escribir("La cantidad es"cantidad" libras.")
				para(4)
					cantidad * 1285.10
					Escribir("La cantidad es"cantidad" rublos.")
				para(5)
					cantidad * 27027.03
					Escribir("La cantidad es"cantidad" won coreanos.")
				fin segun
		
		para(2)
			Segun(monedaFinal)
				para(1)
					cantidad * 0.90
					Escribir("La cantidad es"cantidad" euros.")
				para(2)
					Escribir("Es la misma moneda")
				para(3)
					cantidad * 0.78
					Escribir("La cantidad es"cantidad" libras.")
				para(4)
					cantidad * 63.73
					Escribir("La cantidad es"cantidad" rublos.")
				para(5)
					cantidad * 1155.90
					Escribir("La cantidad es"cantidad" won coreanos.")
				fin segun
		
		para(3)
			Segun(monedaFinal)
				para(1)
					cantidad * 1.16
					Escribir("La cantidad es"cantidad" euros.")
				para(2)
					cantidad * 1.29
					Escribir("La cantidad es"cantidad" dolares.")
				para(3)
					Escribir("Es la misma moneda")
				para(4)
					cantidad * 82.02
					Escribir("La cantidad es"cantidad" rublos.")
				para(5)
					cantidad * 1486.14
					Escribir("La cantidad es"cantidad" won coreanos.")
				fin segun
		
		para(4)
			Segun(monedaFinal)
				para(1)
					cantidad * 0.014
					Escribir("La cantidad es"cantidad" euros.")
				para(2)
					cantidad * 0.016
					Escribir("La cantidad es"cantidad" dolares.")
				para(3)
					cantidad * 0.012
					Escribir("La cantidad es"cantidad" libras.")
				para(4)
					Escribir("Es la misma moneda")
				para(5)
					cantidad * 18.14
					Escribir("La cantidad es"cantidad" won coreanos.")
				fin segun
	
		para(5)
			Segun(monedaFinal)
				para(1)
					cantidad * 0.00078
					Escribir("La cantidad es"cantidad" euros.")
				para(2)
					cantidad * 0.00087
					Escribir("La cantidad es"cantidad" dolares.")
				para(3)
					cantidad * 0.00067
					Escribir("La cantidad es"cantidad" libras.")
				para(4)
					cantidad * 0.055
					Escribir("La cantidad es"cantidad" rublos.")
				para(5)
					Escribir("Es la misma moneda")
				fin segun
		fin segun
	
	Escribir("Deseas repetir el programa S/N")
	Leer(teclado)
	mientras(teclado == S)
fin programa

*/

import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

public class conversor{
	public static void main(String [] args){
	 Scanner teclado = new Scanner(System.in);
	 double cantidad = 0;
	 double resultado = 0;
	 double cantidadGuardada = 0; 	
     int monedaInicial = 0;
     int monedaFinal = 0;
     char vcb = ' ';
     DecimalFormat decimales = new DecimalFormat("0.00");
     
     System.out.print("Do you wish to start the program? Y/N: ");
      vcb = teclado.next().charAt(0);
      vcb = Character.toUpperCase(vcb);
      if(vcb == 'Y'){
		  do{
			do{
			  System.out.print("Which currency do you wish to convert? \n 1. Euros || 2. Dollars || 3. Pounds || 4. Rubles || 5.Corean Won ||: ");
			  monedaInicial = teclado.nextInt();

				if(monedaInicial < 1 || monedaInicial > 5){
					System.out.println("That's not a valid entry.");
				}
			}while(monedaInicial < 1 || monedaInicial > 5);
			
			do{
			  System.out.print("And to which currency do you want to convert it? \n 1. Euros || 2. Dollars || 3. Pounds || 4. Rubles || 5.Corean Won ||: ");
			  monedaFinal = teclado.nextInt();

				if(monedaFinal < 1 || monedaFinal > 5){
					System.out.println("That's not a valid entry.");
				}
			}while(monedaFinal < 1 || monedaFinal > 5);
		
			 do{
			  System.out.print("How much do you want to exchange?: ");
			  cantidad = teclado.nextDouble();
			  cantidadGuardada = cantidad;
			  if(cantidad <=0 ){
				  System.out.println("That's not a valid entry.");
			  } 
			}while(cantidad <= 0);
				switch(monedaInicial){
					
					case(1):
						switch(monedaFinal){
							case(1):
								System.out.println("That's the same currency.");
								break;
							case(2):
								cantidad = cantidad * 1.12;
								System.out.println( decimales.format(cantidadGuardada)+" euros equals "+ decimales.format(cantidad) +" dollars.");
								break;
							case(3):
								cantidad = cantidad * 0.86;
								System.out.println(decimales.format(cantidadGuardada)+" euros equals "+ decimales.format(cantidad) +" pounds.");
								break;
							case(4):
								cantidad = cantidad * 70.39;
								System.out.println(decimales.format(cantidadGuardada)+" euros equals "+ decimales.format(cantidad) +" rubles.");
								break;	
							case(5):
								cantidad = cantidad * 1285.10;
								System.out.println(decimales.format(cantidadGuardada)+" euros equals "+ decimales.format(cantidad) +" korean wons.");
								break;
		
							}
						break;
					
					case(2):
						switch(monedaFinal){
							case(1):
								cantidad = cantidad * 0.90;
								System.out.println(decimales.format(cantidadGuardada)+" dollars equals "+ decimales.format(cantidad) +" euros.");
								break;
							case(2):
								System.out.println("That's the same currency");
								break;
							case(3):
								cantidad = cantidad * 0.78;
								System.out.println(decimales.format(cantidadGuardada)+" dollars equals "+ decimales.format(cantidad) +" pounds.");
								break;
							case(4):
								cantidad = cantidad * 63.69;
								System.out.println(decimales.format(cantidadGuardada)+" dollars equals "+ decimales.format(cantidad) +" rubles.");
								break;	
							case(5):
								cantidad = cantidad * 1156.26;
								System.out.println(decimales.format(cantidadGuardada)+" dollars equals "+ decimales.format(cantidad) +" korean wons.");
								break;
							}
						break;
					
					case(3):
						switch(monedaFinal){
							case(1):
								cantidad = cantidad * 1.16;
								System.out.println(decimales.format(cantidadGuardada)+" pounds equals "+ decimales.format(cantidad) +" euros.");
								break;
							case(2):
								cantidad = cantidad * 1.29;
								System.out.println(decimales.format(cantidadGuardada)+" pounds equals "+ decimales.format(cantidad) +" dollars.");
								break;
							case(3):
								System.out.println("That's the same currency");
								break;
							case(4):
								cantidad = cantidad * 81.86;
								System.out.println(decimales.format(cantidadGuardada)+" pounds equals "+ decimales.format(cantidad) +" rubles.");
								break;	
							case(5):
								cantidad = cantidad * 1486.06;
								System.out.println(decimales.format(cantidadGuardada)+" pounds equals "+decimales.format(cantidad) +" korean wons.");
								break;
							}
						break;
						
					case(4):
						switch(monedaFinal){
							case(1):
								cantidad = cantidad * 0.014;
								System.out.println(decimales.format(cantidadGuardada)+" rubles equals "+ decimales.format(cantidad) +" euros.");
								break;
							case(2):
								cantidad = cantidad * 0.016;
								System.out.println(decimales.format(cantidadGuardada)+" rubles equals "+ decimales.format(cantidad) +" dollars.");
								break;
							case(3):
								cantidad = cantidad * 0.012;
								System.out.println(decimales.format(cantidadGuardada)+" rubles equals "+ decimales.format(cantidad) +" pounds.");
								break;
							case(4):
								System.out.println("That's the same currency");
								break;	
							case(5):
								cantidad = cantidad * 18.15;
								System.out.println(decimales.format(cantidadGuardada)+" rubles equals "+ decimales.format(cantidad) +" korean wons.");
								break;
							}
						break;
						
					case(5):
						switch(monedaFinal){
							case(1):
								cantidad = cantidad * 0.00078;
								System.out.println(decimales.format(cantidadGuardada)+" korean wons equals "+ decimales.format(cantidad) +" euros.");
								break;
							case(2):
								cantidad = cantidad * 0.00086;
								System.out.println(decimales.format(cantidadGuardada)+" korean wons equals "+ decimales.format(cantidad) +" dollars.");
								break;
							case(3):
								cantidad = cantidad * 0.00067;
								System.out.println(decimales.format(cantidadGuardada)+" korean wons equals "+ decimales.format(cantidad) +" pounds.");
								break;
							case(4):
								cantidad = cantidad * 0.055;
								System.out.println(decimales.format(cantidadGuardada)+" korean wons equals "+ decimales.format(cantidad) +" rubles.");
								break;	
							case(5):
								System.out.println("That's the same currency");
								break;
							}
						break;	
						
		}					
		System.out.print("Do you wish to start over? Y/N: ");
		vcb = teclado.next().charAt(0);
		vcb = Character.toUpperCase(vcb);
   }while(vcb == 'Y'); //fin do while repeticion
  }//fin primer if
 }
}
