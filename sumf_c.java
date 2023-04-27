package Prueba;

import java.util.Scanner;

public class sumf_c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner tc = new Scanner(System.in);
		
		int notas [][],sumfil [],sumacolu [];
		int f,c,suma,suma2,auxi,min;
		
		
		System.out.println("Ingrese cuantos estudiantes va a ingresar");
		f=tc.nextInt();
		System.out.println("Ingrese la cantidad de notas que ingresara");
		c=tc.nextInt();
		
		notas= new int [f][c];
		sumfil= new int [f];
		sumacolu= new int [c];
		
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				System.out.println("Ingrese la nota ["+(j+1)+"]"+" Del alumno ["+(i+1)+"]");
				notas[i][j]=tc.nextInt();
			}
		}
		
		for (int p=0;p<f;p++) {
			suma=0;
			for (int j=0;j<c;j++) {
				suma+=notas[p][j];
				
			}
			for (int l=0;l<sumfil.length;l++) {
				sumfil[p]=suma;
				
			}
		}
		
		for (int x=0;x<c;x++) {
			suma2=0;
			for (int j=0;j<f;j++) {
				suma2=suma2 +notas[j][x];
				
			}
			System.out.println(suma2);
			for (int l=0;l<c;l++) {
				sumacolu[x]=suma2;
				
			}
		}
		
		
		
		System.out.println("El array es");
		for (int i=0;i<f;i++) {
			for (int j=0;j<c;j++) {
				System.out.print(notas[i][j]+" ");
			}
			System.out.println(" ");
		}
		
System.out.println("\nLa suma de las filas es ");
for (int i:sumfil) {
	System.out.print(i+" ");
}

	
	System.out.println("\nLa suma de las columnas es ");
	for (int i:sumacolu) {
		System.out.print(i+" ");
	}
	}

}
