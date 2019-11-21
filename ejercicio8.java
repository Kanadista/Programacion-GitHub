/*
Propósito: Conocer el tipo de un triángulo
Salida: a, b, c, echo datos
Precondiciones: Los lados del triángulo han de ser positivos.
Variables:
 Reales: a, b, c.
 Programa: Principal
  Inicio
  //obtener y validar datos
  Escribe("Introduzca el lado mayor del triángulo")
   Leer(a)
  Escribe("Introduzca el segundo lado")
   Leer(b)
  Escribe("Introduzca el tercer lado")
   Leer(c)
   SI ((a<0) OR (b<0) OR (c<0))
    Escribe("El lado no puede ser 0")
  FIN_SI
	//ver el tipo de un triangulo
	SI (a=>b+c)
	 Escribir("No se trata de un triángulo")
	 SINO
	  SI (a*a = b*b+c*c)
	   Escribe("Es un triángulo rectángulo")
	    SINO 
	     SI (a*a > b*b+c*c)
	      Escribe("Es un triángulo obtusángulo")
	       SINO
	        SI (a*a > b*b+c*c)
	         Escribe("Es un triángulo acutángulo")
	       FIN_SI
	     FIN_SI
	    FIN_SI
	   FIN_SI  
Fin
*/

import java.io.*;
import java.util.Scanner;

public class ejercicio8{
	public static void main (String [] args){
	 
	 Scanner teclado = new Scanner(System.in);
	 double a = 0;
	 double b = 0;
	 double c = 0;
	//obtener datos
	System.out.print("Introduzca el lado mayor del triangulo: ");
	a = teclado.nextDouble();
	System.out.print("Introduzca el segundo lado: ");
	b = teclado.nextDouble();
	System.out.print("Introduzca el tercer lado: ");
	c = teclado.nextDouble();
	//validar datos
	if((a<=0) || (b<=0) || (c<=0)){
	 System.out.println("El lado ha de ser mayor a 0");
	}
	else{
			if(a>=b+c){
			System.out.println("No es un triangulo");
			}
			else{
			if(a*a == b*b + c*c){
			System.out.println("Es un triangulo rectangulo");
			}
			else{
			 if(a*a > b*b + c*c){
			 System.out.println("Es un triangulo obtusangulo");
			}
			  else{
			   if(a*a < b*b + c*c){
			   System.out.println("Es un triangulo acutangulo");
				}
			  }	
		}
   }
}
}//Cierre programa principal
	
}
