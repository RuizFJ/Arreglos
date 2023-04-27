package clase110423;

import java.util.Scanner;

public class prueba1m3 {
	
	
	/* Declare una matriz de 10x3. Capte la primer columna los valores de las cantidades de productos.
	 * para la segunda columna los valores del precio de los productos y calcule en la tercer columna el precio *
	 * la cantidad. validar que los productos en cuanto a cantidad estan entre 1 y 8. El precio del producto está
	 * entre 1 y 500.
	 */

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		
		int notas [][]= new int [10][3];
		int multicolum;
		
		try {
		
		for (int i=0;i<10;i++ ) {
			for (int j=0;j<1;j++) {
				do {
				System.out.println("Ingrese la cantidad de productos que llevara (No tiene que ser mayor a 8) ["+(i+1)+"]");
				notas[i][j]=tc.nextInt();
				} while (notas [i][j]<=0 || notas [i][j]>8);
			}
		}
		

		for (int i=0;i<10;i++) {
			for (int j=1;j<2;j++) {
				do {
				System.out.println("Ingrese el precio ["+(i+1)+"]");
				notas[i][j]=tc.nextInt();
				} while (notas [i][j]<=0 || notas [i][j]>500);
			}
		}
		for (int i=0;i<10;i++) {
			multicolum=1;
			for(int j=0;j<2;j++) {
				multicolum=multicolum*notas[i][j];
			}
			
			for (int l=2;l<3;l++) {
				notas[i][l]=multicolum;
			}
		}
		
		System.out.println("\n|Cantidad| | Precio |  | Total |");
		for (int i=0;i<10;i++) {
			for(int j=0;j<3;j++) {
		
	System.out.print(notas[i][j]+" ");
			}
			System.out.println(" ");
			}
				
			
		
	} catch (java.util.InputMismatchException m){
		System.out.println("Eror el dato debe ser numerico");
	}
		
	}

}
