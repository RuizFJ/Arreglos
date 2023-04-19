package clase110423;

import java.util.Scanner;

public class arreglordenamiento {

	public static void main(String[] args) {
		
		
		Scanner tc = new Scanner(System.in);
		
		int arra[],n,auxi = 0,min,pos;
		
		System.out.println("Ingrese el tamaño del arreglo");
		n=tc.nextInt();
		
		arra= new int [n];
		
		for (int i=0;i<arra.length;i++) {
			System.out.println("Ingrese el numero "+(i+1));
			arra[i]=tc.nextInt();
		}
		
		for (int j=0;j<arra.length-1;j++) {
			
			min=j;
			
			for (int x=j+1;x<arra.length;x++) {
				
				if (arra[x]<arra[min]) {
					min=x;
				}
			
			
				auxi=arra[j];
				arra[j]=arra[min];
				arra[min]=auxi;
			}		
			
		}
		
			System.out.println("Los elementos ordenados son");
			for (int l:arra) {
				System.out.print(l+" ");
			}
			
			
			
			}
		
	}


