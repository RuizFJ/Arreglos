package clase110423;

import java.util.Scanner;

public class arreglo03 {

	public static void main(String[] args) {
		
		// Escribir un programa que pida n numeros, guardarlos en un array y mostrarlos invertidos
		
		Scanner tc = new Scanner(System.in);
		
		
		int num [];
		int n;
		System.out.println("tamaño de arreglo");
		n=tc.nextInt();
		
		
		num=new int [n];
		
		for (int j=n-1;j>=0;j--) {
			System.out.println("Ingrese el numero ");
			num[j]=tc.nextInt();
			
			
		}
	for(int i : num) {
		System.out.println(i);
	}
			
		
		
		
		
		
		
	}

}
