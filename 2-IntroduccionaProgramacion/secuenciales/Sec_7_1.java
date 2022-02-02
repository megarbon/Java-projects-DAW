package secuenciales;
// Ejercicio 7_1
//


import java.util.Scanner;

public class Sec_7_1 {
	public static void main(String[] args) {
		Scanner sc;
		int minutos, res_horas, res_min;
		
		sc = new Scanner(System.in);

		System.out.print("Dime la cantidad de minutos:");
		minutos = Integer.parseInt(sc.nextLine());
		
		res_horas = minutos / 60;
		res_min = minutos % 60;

		sc.close();

		// Afinamos el mensaje:
		String cadHoras = res_horas > 1 ? " horas y " : " hora y ";
		String cadMinutos = res_min > 1 ? " minutos." : " minuto.";
		
		System.out.println(res_horas + cadHoras + res_min + cadMinutos);
	}
	

	
}
