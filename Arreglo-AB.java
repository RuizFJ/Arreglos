package clase110423;

import java.util.Scanner;

public class arreglo07 {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner (System.in);
		
		/* Leer por teclado dos tablas de 10 numeros enteros y mezclarlas
		 * en un tercera de la forma: el 1° de A, el 1° de B, el 2° de A , el 2° de B 
		*/
		
		int a [] = new int [10];
		int b [] = new int [10];
		int c [] = new int [20] ;
		try {
		for (int i=0;i<a.length;i++) {
			System.out.println("Ingrese el numero "+(i+1));
			a[i]=tc.nextInt();
		}
		

		for (int j=0;j<a.length;j++) {
			System.out.println("Ingrese el numero "+(j+1));
			b[j]=tc.nextInt();
		}
		 
		int j = 0;
		for (int i=0;i<a.length;i++) {
			c[j]=a[i];
			j++;
			c[j]=b[i];
			j++;
			
		}
		System.out.println("Los elementos ordenados son = ");
	for (int d: c) {
		System.out.print(d+" ");
		
	}
		 } catch (java.util.InputMismatchException l) {
			System.out.println("Error los datos deben de ser númericos");
		}
		
	}

}
