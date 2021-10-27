/**********************
 * 
 * Crea una aplicación que nos cuente el número de cifras de un número entero positivo 
 * (hay que controlarlo) pedido por teclado. 
 * Crea un método que realice esta acción, pasando el número por parámetro, devolverá el número de cifras.
 * @author melakug
 *
 *********************/


import java.util.Scanner;

public class procedimientos_6 {

	public static void main(String[] args) {
		Scanner sc;
		int num, cifras = 0;
		sc = new Scanner(System.in);
		do {
			System.out.println("Ingrese un número entero positivo: ");
			num = sc.nextInt();
		}while(num>0);
		
		while(num>1) {
			cifras++;
			num = num / 10;
		}
		System.out.println("Tu numero tiene " + cifras + "cifras.");
	}

}
