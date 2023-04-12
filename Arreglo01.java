package clase110423;

import java.util.Scanner;

public class arreglos1 {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		int edad[];
		int n;
		
		System.out.println("cuantas edades de estudiantes va a ingresar");
		n=tc.nextInt();
		edad= new int [n];
		
		for (int i=0;i<edad.length;i++) {
			
			System.out.println("Ingrese la edad "+i+" del estudiante");
			edad[i]=tc.nextInt();
		}
		for (int j:edad) {
		System.out.println("Edad "+j);
	
		}
	}

}
