package procedimientos_1;

/*********************************
 * Crea una subrutina en java a la que se le pase un número N 
 * que se le pedirá al usuario y muestre por pantalla la frase “Módulo ejecutándose” N veces.
 * @author melakug
 *
 **********************************/

import java.util.Scanner;
public class procedimientos_1 {
		public static void main(String[] args) {
			int N;
			Scanner sc;
			sc = new Scanner(System.in);
			System.out.println("Cuantas veces quieres que te lo repita");
			N = sc.nextInt();
		}
		
	public static int repes(int num) {
		for(int i = 0; i < num; i++) {
			System.out.println("Hola pinche ya te lo dije " + i + " veces");
		}
	}
}
