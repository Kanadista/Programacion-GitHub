/*
Propósito: Lanzar un dado varias veces, ver que numeros salen y mostrar el resultado en porcentajes.
Entradas: numero veces
Salidas: 1, 2, 3, 4, 5, 6, resultado, tiradas, porcentaje
Precondiciones: Que el numero de veces no sea menor que 1
Variables
 Enteras: 1, 2, 3, 4, 5, 6, numero veces, rnd, resultado, tiradas, porcentaje
 Programa:Principal
	Inicio
	 hacer
	  hacer
	   Escribe("Cuantas veces quieres tirar el dado")
	   Leer(teclado)
	    para(tiradas = 0, tiradas < entradas, tiradas++)
	      resultado = Generar numero aleatorio(1 al 6)
	 segun(resultado)
		para(1)
		 uno++
		para(2)
		 dos++
		para(3)
		 tres++
		para(4)
		 cuatro++
		para(5)
		 seis++
		para(6)
		 seis++
	fin_segun
	 porcentajeUno = (uno/tiradas)*100
	 porcentajeDos = (dos/tiradas)*100
	 porcentajeTres = (tres/tiradas)*100
	 porcentajeCuatro = (cuatro/tiradas)*100
	 porcentajeCinco = (cinco/tiradas)*100
	 porcentajeSeis = (seis/tiradas)*100
	mientras(tiradas<=0)
	 Escribir("El porcentaje de que salga 1 es", porcentajeUno," el porcentaje de que salga 2 es," porcentaje 2 etc...)
		Escribir("Quieres repetir el programa? S/N:")
		vcb = Leer(teclado)
		mientras(vcb = S)
*/

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class dado{
		public static void main(String [] args){
			Scanner teclado = new Scanner(System.in);
			Random rnd = new Random();
			int entrada = 0;
			double tiradas = 0;
			int resultado = 0;
			double uno = 0;
			double dos = 0;
			double tres = 0;
			double cuatro = 0;
			double cinco = 0;
			double seis = 0;
			double porcentajeUno = 0;
			double porcentajeDos = 0;
			double porcentajeTres = 0;
			double porcentajeCuatro = 0;
			double porcentajeCinco = 0;
			double porcentajeSeis = 0;
			char vcb = ' ';
			
	do{		
		System.out.print("Cuantas veces deseas tirar el dado?: ");
		entrada = teclado.nextInt();
		
		for(tiradas = 0; tiradas < entrada; tiradas++){
			resultado = rnd.nextInt(6) + 1;
		 switch(resultado) {
			case(1):
			uno++;
			break;
			case(2): 
			dos++;
			break;
			case(3):
			tres++;
			break;
			case(4):
			cuatro++;
			break;
			case(5):
			cinco++;
			break;
			case(6):
			seis++;
			break;
		 }	
		}
		
		porcentajeUno = (uno/tiradas)*100;
		porcentajeDos = (dos/tiradas)*100;
		porcentajeTres = (tres/tiradas)*100;
		porcentajeCuatro = (cuatro/tiradas)*100;
		porcentajeCinco = (cinco/tiradas)*100;
		porcentajeSeis = (seis/tiradas)*100;
		System.out.println("===============Resultados===============");
		System.out.println("El numero de dados que han salido uno es "+uno+".");
		System.out.println("El numero de dados que han salido dos es "+dos+".");
		System.out.println("El numero de dados que han salido tres es tres es "+tres+".");
		System.out.println("El numero de dados que han salido cuatro es "+cuatro+".");
		System.out.println("El numero de dados que han salido cinco es "+cinco+".");
		System.out.println("El numero de dados que han salido seis es "+seis+".");
		System.out.println("=========================================");
		System.out.println("===============Porcentajes===============");
		System.out.println("El porcentaje de que salga uno es "+porcentajeUno+"%.");
		System.out.println("El porcentaje de que salga dos es "+porcentajeDos+"%.");
		System.out.println("El porcentaje de que salga tres es "+porcentajeTres+"%.");
		System.out.println("El porcentaje de que salga cuatro es "+porcentajeCuatro+"%.");
		System.out.println("El porcentaje de que salga cinco es "+porcentajeCinco+"%.");
		System.out.println("El porcentaje de que salga seis es "+porcentajeSeis+"%.");
		System.out.println("=========================================");
	
  	
		System.out.print("Quieres repetir el programa? S/N: ");
	  vcb = teclado.next().charAt(0);
	  vcb = Character.toUpperCase(vcb);
  }while(vcb == 'S');	
 }
}
