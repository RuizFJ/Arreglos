package fran;

import java.util.ArrayList;
import java.util.Scanner;

public class arreglobi1 {

	public static void main(String[] args) {
	
		Scanner tc = new Scanner(System.in);
		
		String frutas;
		System.out.println("Ingrese el tamaño del arreglo");
		int n=tc.nextInt();
		ArrayList<Integer> array1 = new ArrayList<>(n);
		ArrayList<String> array2 = new ArrayList<>(n);
		
		for (int i=0;i<n;i++) {
			
			System.out.println("Ingrese las frutas");
			frutas=tc.next();
			array2.add(frutas);
			array1.add(i);
		}
		
		System.out.println(array2);
		System.out.println(array1);
		
		
		

	}

}
