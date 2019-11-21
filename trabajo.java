import java.io.*;
import java.util.Scanner;

public class trabajo{
	public static void main(String [] args){
	Scanner teclado = new Scanner(System.in);
	int mayor = 0;
	int menor = 0;
	double total = 0;
	int numero = 0;
	double i = 0;
	double med = 0;
	char vcb = ' ';
	int cantidadNumeros = 0;
	
	do{
		System.out.print("Cuantos numeros deseas introducir: ");
		cantidadNumeros = teclado.nextInt();
			if(cantidadNumeros <= 0){
				System.out.println("No es un numero valido.");
			}
	}while(cantidadNumeros <= 0);
		System.out.print
		("Introduce un numero: ");
			numero = teclado.nextInt();
			mayor = numero;
			menor = numero;
			total = total + numero;
		for(i = 1; i < cantidadNumeros; i++){
			System.out.print("Introduce un numero: ");
				numero = teclado.nextInt();
	
				if(numero > mayor){
					mayor = numero;
				}
				if(numero < menor){
					menor = numero;
				}
					total = total + numero;
			}
			
	med = total/i;
	System.out.println("El mayor numero introducido ha sido: "+mayor+".");
	System.out.println("El menor numero introducido ha sido: "+menor+".");
	System.out.println("La media de los numeros introducidos es: "+med+".");
 }
}
