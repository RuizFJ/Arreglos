package clase110423;

import java.util.Scanner;

public class arreglo02 {

	public static void main(String[] args) {
	Scanner tc = new Scanner(System.in);
		
		int volt[];
		int min=0,sum=0,maxi=0,n;
		float prom=0;
		
		try {
		// Datos de entrada
		do {
		System.out.println("Ingrese la cantidad de voltajes que desea ingresar");
		n=tc.nextInt();
		} while(n<=0);
		volt=new int [n];
//		Proceso
		for (int i=0;i<volt.length;i++) {
			do {
			System.out.println("Ingrese el voltaje "+i);
			volt[i]=tc.nextInt();
			} while (volt[i]<=0);
			sum=volt[i]+sum;
			prom= (float) sum/n;
				if (i==0) {
					min = volt[i];
				}
			  if (volt[i]<min) {
				min=volt[i];
			  }	
			   if (volt[i]>maxi) {	
				maxi=volt[i];		
			}
		}	
		System.out.println("El voltaje minimo es = "+ min);
		System.out.println("El voltaje maximo es = "+maxi);
		System.out.println("El promedio de los voltajes es = "+prom);
		
		} catch (java.util.InputMismatchException m) {
			System.out.println("Error el dato debe de se numérico");
		}
	}
}
