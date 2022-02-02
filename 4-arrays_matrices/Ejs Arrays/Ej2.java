package arrays2;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ej2 {

	public static void main(String[] args) {
		final int TAM = 10, VALORES=100;
		// El tamaño es siempre 10
		int num[]=new int[TAM];
		Scanner sc = new Scanner(System.in);
		
		//rellenamos el array
		rellenarNumAleatorioArray(num, 1, VALORES);

		int posicion = leerDato(sc, "Introduce qué posición quieres ver (numero entre 1 y 10)", 1, TAM);
		
		int valor=contenidoEnArray(num, posicion);
		
		// Para comprobar que lo hace bien, en tiempo de desarrollo:
		mostrarArray(num);
		
		//System.out.println("En la posición " + posicion + " hay un " + valor);
		
		JOptionPane.showMessageDialog (null, "En la posición " + posicion + " hay un " + valor, "Solución", JOptionPane.INFORMATION_MESSAGE);
		/*JOptionPane.showMessageDialog (null, "Message", "Title", JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog (null, "Message", "Title", JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog (null, "Message", "Title", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog (null, "Message", "Title", JOptionPane.QUESTION_MESSAGE);*/
		
		sc.close();
	}
	
	public static int leerDato(Scanner sc, String msg, int min, int max) {
		int dato;
		String texto;
		
		do{
			texto=JOptionPane.showInputDialog(msg);
			dato=Integer.parseInt(texto);
		}while(!(dato>=min && dato<=max));
		
		return dato;
	}
		
	public static void rellenarNumAleatorioArray(int lista[], int a, int b){
		for(int i=0;i<lista.length;i++){
			//Generamos un número entre los parametros pasados
			lista[i]=(int)(Math.random()*(b-a+1)+a);
		}
	}

	public static void mostrarArray(int lista[]){
		for(int i=0;i<lista.length;i++)
			System.out.println(lista[i] );		

	}
	
	public static int contenidoEnArray(int lista[], int pos){
		return (lista[pos-1] );		

	}

}