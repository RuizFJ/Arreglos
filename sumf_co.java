package Prueba;

import java.util.Scanner;

public class sumf_co {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		try {
		int array [][];
		int sumf[],sumc[],f,c;
		System.out.println("Ingrese el numero de filas");
		f=tc.nextInt();
		sumf= new int [f];
		System.out.println("Ingrese el numero de columnas");
		
		c=tc.nextInt();
		if (f==c) {
		sumc=new int [c];
		array=new int [f][c];
		
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				System.out.println("Ingrese el numero en la posicion "+(i+1)+(j+1));
				array[i][j]=tc.nextInt();
			}
			
		}
		
		
		for (int i=0;i<f;i++) {
			
			for (int j=0;j<c;j++) {
				sumf[i]+=array[i][j];
			}
		}
		
		for (int j=0;j<c;j++) {
			for (int i=0;i<f;i++) {
				sumc[i]+=array[j][i];
			}
		}
		
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				
		System.out.print(array[i][j]+" ");
			}
			
			System.out.println(" ");
		}
		
		
		for (int k:sumf) {
			System.out.println("La suma de las filas es "+k);
		}
		for (int k:sumc) {
			System.out.println("La suma de las columnas es "+k);
		}
		
		
		} else { 
			System.out.println("Las filas y las columnas deben ser iguales ");
		}
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de ser numerico ");
		}
	}

}
