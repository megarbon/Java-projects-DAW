/*******************************
 * 
 * Crea una función en java que reciba un número entero y devuelva su factorial.
 * 
 * 
 * @author melakug
 *
 */

import java.util.Scanner;

public class procedimientos_3 {

	public static void main(String[] args) {
		Scanner sc;
		sc = new Scanner(System.in);
		int fact;
		
		
		//Calculo de factoriales
				System.out.println("Introduce un numero para calcular su factorial ");
				fact = sc.nextInt();
				System.out.println("El factorial es: " + factorial(fact));
		
		
	}
	
	//funcion que calcula el factorial de un numero
	
		public static int factorial(int num) {
			if (num == 0) {
				return 1;
			} else
				return num * factorial(num - 1);
		}


}
