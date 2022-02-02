package secuenciales;

import java.util.Scanner;

public class Sec_15 {

	public static void main(String[] args) {
		int a,b,aux;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Introduce valor de la variable A:");
		a = Integer.parseInt(sc.nextLine());	
		
		System.out.println("Introduce valor de la variable B:");
		b = Integer.parseInt(sc.nextLine());	

		aux = a;
		a = b;
		b = aux;
		
		System.out.println( "Nuevo valor de A:" + a );
		System.out.println( "Nuevo valor de B:" + b );
		
		sc.close();

	}

}
