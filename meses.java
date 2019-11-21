/*
 Proposito: Leer un numero del 1 al 12 y pintar en pantalla el año que corresponde.
 Entrada: numero
 Salida: echo datos
 Precondiciones: El numero no puede ser negativo.
 Variables:
 entero: numero
	Programa: Principal
	 Inicio
	  //obtener datos
	  Escribe("Introduce un numero del 1 al 12")
		Leer(numero)
	  segun(numero)
	   para(numero==1)
	    Escribe("Es enero")
	   para(numero==2)
	    Escribe("Es febrero")
	   para(numero==3)
	    Escribe("Es marzo")
	   para(numero==4)
	    Escribe("Es abril")
	   para(numero==5)
	    Escribe("Es mayo")
	   para(numero==6)
	    Escribe("Es junio")
	   para(numero==7)
	    Escribe("Es julio")
	   para(numero==8)
	    Escribe("Es agosto")
	   para(numero==9)
	    Escribe("Es septiembre")
	   para(numero==10)
	    Escribe("Es octubre")
	   para(numero==11)
	    Escribe("Es noviembre")
	   para(numero==12)
	    Escribe("Es diciembre")
	   otro
	    Escribe("No es un numero valido")
	   fin_segun
*/

import java.io.*;
import java.util.Scanner;

public class meses{
	public static void main (String [] args){
		
	Scanner teclado = new Scanner(System.in);
	int numero = 0;
	char vcb = ' ';
		
		do{
	//obtener y validar datos
	System.out.print("Introduzca un numero del 1 al 12: ");
	numero = teclado.nextInt();
	switch(numero)
	{
	 case 1:
	 System.out.println("El mes es enero");
	 break;
	 case 2:
	 System.out.println("El mes es febrero");
	 break;
	 case 3:
	 System.out.println("El mes es marzo");
	 break;
	 case 4:
	 System.out.println("El mes es abril");
	 break;
	 case 5:
	 System.out.println("El mes es mayo");
	 break;
	 case 6:
	 System.out.println("El mes es junio");
	 break;
	 case 7:
	 System.out.println("El mes es julio");
	 break;
	 case 8:
	 System.out.println("El mes es agosto");
	 break;
	 case 9:
	 System.out.println("El mes es septiembre");
	 break;
	 case 10:
	 System.out.println("El mes es octubre");
	 break;
	 case 11:
	 System.out.println("El mes es noviembre");
	 break;
	 case 12:
	 System.out.println("El mes es diciembre");
	 break;
	 default:
	 System.out.println("No es un numero valido");
	 break;
	 
	  }
	 System.out.print("Quieres repetir el programa? S/N: ");
	  vcb = teclado.next().charAt(0);
	  vcb = Character.toUpperCase(vcb);
	  }while(vcb == 'S');
    } 
  }
