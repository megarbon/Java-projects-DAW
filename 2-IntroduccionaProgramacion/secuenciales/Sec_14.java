package secuenciales;

import java.util.Scanner;

public class Sec_14 {

	public static void main(String[] args) {
		int num, decenas, unidades, numInv;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Dime un número de dos cifras ");
		num = Integer.parseInt(sc.nextLine());		
		

		decenas = (num/10);
		unidades = num % 10;
		
		System.out.println("Primera cifra (unidades): " + unidades);
		System.out.println("Segunda cifra (decenas): " + decenas);
		
		numInv = unidades * 10 + decenas;
		System.out.println("Segunda cifra (decenas): " + numInv);
		
		sc.close();

	}

}
