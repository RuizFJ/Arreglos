package clase110423;

import java.util.Scanner;

public class ejercicio46 {

	public static void main(String[] args) {
		
		Scanner tc = new Scanner(System.in);
		
		int array [];
		int sum = 0,n,sum2 = 0,min = 0,max=0,cont = 0,cont2 = 0,mini,auxi = 0,auxi2;
		float mod = 0,prom=0;
		System.out.println("Ingrese el tamaño del elemento");
		n=tc.nextInt();
		
		array=new int [n];
		
		for(int i=0;i<array.length;i++) {
			
			System.out.println("Ingrese el numero "+(i+1));;
			array[i]=tc.nextInt();
			
			sum+= array[i];
			sum2+= Math.pow(array[i], 2);
			mod=(float) Math.sqrt(sum2);
			prom= (float) sum/n;
			if (i==0) {
				min=array[i];
				
			} if (array[i]<min) {
				min=array[i];
				cont=i;
				
			} if (array[i]>max) {
				max=array[i];
				cont2=i;
			}
			
			
		}
		
		for (int i=0;i<array.length-1;i++) {
			mini=i;
			for(int j=i+1;j<array.length;j++) {
				if (array[j]<array[mini]) {
					mini=j;
				}
			}
			auxi=array[i];
			array[i]=array[mini];
			array[mini]=auxi;
			
		}
		
		System.out.println("La suma del arreglo es "+sum+"\nLa suma del arreglo al cuadrado es "+sum2+"\nEl minimo es "+min+" Su posicion es la "+cont+"\nel maximo es "+max+" Su posicion es la "+cont2+"\nSu promedio es "+prom+"\nSu modulo es "+mod);
		System.out.println("");
		System.out.println("El arreglo ordenado de forma ascendente es ");
		for(int s:array) {
			System.out.print(s+" ");
		}
		
		

	}

}
