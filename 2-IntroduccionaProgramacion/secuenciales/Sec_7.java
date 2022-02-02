package secuenciales;
// Ejercicio 7


import java.util.Scanner;

public class Sec_7 {
	public static void main(String[] args) {
		Scanner sc;
		int minutos, res_horas, res_min;
		
		sc = new Scanner(System.in);

		System.out.print("Dime la cantidad de minutos:");
		minutos = Integer.parseInt(sc.nextLine());
		
		res_horas = minutos / 60;
		res_min = minutos % 60;

		sc.close();
	
		System.out.println(res_horas + " horas y " + res_min + " minutos.");
		// Corregir cuando sale plural inadecuadamente
	}
	

	
}
