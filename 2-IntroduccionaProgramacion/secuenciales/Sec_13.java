package secuenciales;
// Ejercicio 13

import java.text.DecimalFormat;
import java.util.Scanner;

public class Sec_13 {
	public static void main(String[] args) {
		Scanner sc;
		int num;
		
		sc = new Scanner(System.in);
		
		System.out.println("Dime el n�mero: ");
		num = Integer.parseInt(sc.nextLine());		
			
		System.out.println( "Ra�z cuadrada: " +  Math.sqrt(num));
		
		double cubica = Math.pow(num, 1.0/3); // Ojo, sin decimal me da 1.0, porque es elevado a cero
		System.out.println( "Ra�z c�bica: " +  cubica);
		
		// Creo una variable solo por mostrar que se puede hacer de las dos formas
		
		String patron = "###.##";
        
        //Creamos un objeto DecimalFormat
        DecimalFormat objDF = new DecimalFormat (patron);
        System.out.println( "Ra�z c�bica: " +  objDF.format(cubica));
        
		sc.close();

	}
	
	//https://codesitio.com/recursos-utiles-para-tu-web-o-blog/cursos/curso-de-java-como-presentar-numeros-con-formato/
}
