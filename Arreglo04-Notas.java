package clase110423;

import java.util.Scanner;

public class Arreglo04 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
	float notas[],sum = 0,prom=0;
	int n;
		
	
	try {
		do {
		System.out.println("Cuantas notas desea ingresar");
		n=tc.nextInt();
		} while (n<=0);
		notas = new float[n];
		
		for (int i=0;i<notas.length;i++) {
			do {
			System.out.println("Ingrese las notas");
			notas[i]=tc.nextFloat();
			} while (notas[i]<0 || notas[i]>100);
		  sum += notas[i];
			prom = sum/n;
			
			
			
		} if (prom>=60) {
			System.out.println("Esta aprobado");
		}
		else if (prom<60) {
			System.out.println("Está reprobado");
		}
		System.out.println("La suma de las notas es = "+sum+" \nSu promedio es = "+prom);
		
		
	} catch (java.util.InputMismatchException m) {
		System.out.println("Error el dato tiene que ser entero");
	}
		
		
		
		
		
		

	}

}
