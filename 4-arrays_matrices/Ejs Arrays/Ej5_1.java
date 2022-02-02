package arrays2;
import java.util.*;
import javax.swing.JOptionPane;
public class Ej5_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Introducimos un numero
		
	
		String numero=JOptionPane.showInputDialog("Introduce un numero para comprobar si es capicua");

		int digitos[]=convierteNumeroAArray(numero);
			
		System.out.println("Primera forma:");
		System.out.println("______________");
		//Invocamos el metodo, segun el resultado mostramos un mensaje u otro
		if (EsCapicua(digitos)){
			System.out.println("El numero "+numero+" es capicua");
		}else{
			System.out.println("El numero "+numero+" no es capicua");
		}
		
		int numero2 = dameNumero(sc, "Introduce un numero para comprobar si es capicua");
		digitos = convierteNumeroAArray2(numero2);
		System.out.println("Segunda forma:");
		System.out.println("______________");
		if (EsCapicua(digitos)){
			System.out.println("El numero "+numero2+" es capicua");
		}else{
			System.out.println("El numero "+numero2+" no es capicua");
		}
		
		sc.close();
	}
	
	/*
	 * Convertimos un numero (leido en forma de cadena) en un array con sus digitos
	 * Aprovechamos el String para averiguar la longitud del numero,
	 * para crear un array compatible, y para dividirlo en digitos
	 */
	public static int[] convierteNumeroAArray(String numero){
		// Habría que comprobar que es un numero
		int digitos[]=new int[numero.length()];

		for(int i=0;i<digitos.length;i++){
			//digitos[i]=Character.getNumericValue(numero.charAt(i));

			//digitos[i]=Integer.parseInt(String.valueOf(numero.charAt(i)));
			
			digitos[i]=Integer.parseInt(numero.substring(i, i+1));
		}

		return digitos;
	}

	
	public static int[] convierteNumeroAArray2(int numero){
		int num = numero;
		
		//System.out.println("numdigitos" + numDigitos(numero));
		
		int digitos[]=new int[numDigitos(numero)];

		for(int i=0;i<digitos.length;i++){
			digitos[i]=num%10;
			num /= 10;			
		}
		
		return digitos;
	}
	
	
	public static int numDigitos(int numero){
		int num = numero, cont = 0;
		
		while (num >0) {			
			num = num/10;			
			cont++;
		}

		return cont;
	}
	
	
	public static boolean EsCapicua (int lista[]){

		//Creamos otro array
		int listaprueba[]=new int [lista.length];

		/*
		 * Asignamos los valores al nuevo array lo hacemos aniadiendo
		 * los ultimos valores del primer array, al principio del nuevo array
		 * ,es decir, le damos la vuelta al array
		 */
		for (int i=0, j=1; j<=lista.length; i++, j++){
			listaprueba[i]=lista[lista.length-j];
		}

		//Usamos el metodo de java.util.Arrays para comparar los arrays
		if (Arrays.equals(lista, listaprueba)){
			return true;
		}

		return false;

	}
	
	
	public static int dameNumero(Scanner sc, String msg) {
		System.out.println(msg);
		return sc.nextInt();
	}

}