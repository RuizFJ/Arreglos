package clase110423;

import java.util.Scanner;

public class arreglobi {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int array [][],c,f;
		
		
		System.out.println("Ingrese el numero de filas");
		f=tc.nextInt();
		System.out.println("Ingrese el numero de columnas");
		c=tc.nextInt();
		
		array=new int [f][c];
		
		for (int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Ingrese el numero ["+i+"]"+"["+j+"]");
				array[i][j]=tc.nextInt();
			}
		}
		System.out.println("La matriz es ");
		for (int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		
		
		
		
		
		

	}

}
