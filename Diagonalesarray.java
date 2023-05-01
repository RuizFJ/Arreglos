package Prueba;

import java.util.Scanner;

public class practica2 {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		
		/*Dado u arreglo bidimensinal imprimirlo , 
		 * imprimir la diagonal principal, la diagonal
		 * encima de la principal y la diagonal por debajo
		 * de la principal
		 */
		
		int array [][];
		int f,c;
		try {
		System.out.println("Ingrese las filas");
		f= tc.nextInt();
		System.out.println("Ingrese las columnas");
		c=tc.nextInt();
		if (f==c) {
		array=new int [f][c];
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				System.out.println("Ingrese el numero ["+i+"]"+" ["+j+"]");
				array[i][j]= tc.nextInt();
			}
		}
		
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		System.out.println("\nLa diagonal principal es ");
		for (int i=0;i<f;i++) {
		
				System.out.print(array[i][i]+" ");
			
		}
		System.out.println("\nLa diagonal encima de la principal es ");
		for (int i=0;i<f-1;i++) {
		
				System.out.print(array[i][i+1]+" ");
				
			
		}
		System.out.println("\nLa diagonal debajo de la principal es ");
		for (int i=0;i<f-1;i++) {
		
				System.out.print(array[i+1][i]+" ");
				
			
		}
		} else {
			System.out.println("Las filas y columnas deben ser iguales");
		}
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numerico ");
		}
	}

}
