import java.util.ArrayList;
import java.util.Scanner;

public class Array_main {

	public static void main(String[] args) {
		int n;
		//Scanner tc= new Scanner(System.in);
		//System.out.println("Ingrese el tamaño");
	//	n=tc.nextInt();
		
	//	ArrayList<Integer> arr1= new ArrayList<>(n);
		
		ArrayList<String> frutas= new ArrayList<String>();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Pera");
		
		//System.out.println(frutas);
		
		//System.out.println("Array:"+ arr1 + frutas);
		
		//for(int i=1; i<=n; i++) {
		//	arr1.add(i);
			 
		//}
		
		for(int j=0; j<frutas.size(); j++) {
			System.out.println(frutas.get(j));
		}
		
		System.out.println("segunda forma:");
		
		for(String cadena : frutas) {
			System.out.println(cadena);
		}
		
		
		//System.out.println("Array:"+ arr1 +frutas);
	//	System.out.println("Array2:"+ arr1);
		

	}

}
