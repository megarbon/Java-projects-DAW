package arrays2;

import javax.swing.JOptionPane;
public class Ej3_2 {

	public static void main(String[] args) {	
		//Indicamos el tama�o
		String texto=JOptionPane.showInputDialog("Introduce un tama�o");
		int num[]=new int[Integer.parseInt(texto)];

		// Leemos el digito
		int ultimoDigito = leerDato("Introduce numero entre 0 y 9", 0, 9);
		
		//rellenamos el array
		rellenarNumAleatorioArray(num, 1, 300);

		//Creamos un array que contenga los numeros terminados en el numero especificado
		int terminadosEn[]=numTerminadosEn(num, ultimoDigito);
		
		// Para comprobar que lo hace bien, en tiempo de desarrollo:
		mostrarArray(num);
		
		//Mostramos el resultado
		mostrarArrayTerminadosEn(terminadosEn);
		
	}
	
	public static int leerDato(String msg, int min, int max){
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
			//Generamos un n�mero entre los par�metros pasados
			lista[i]=(int)(Math.random()*(b-a+1)+a);
		}
	}

	public static void mostrarArray(int lista[]){
		for(int i=0;i<lista.length;i++)
			System.out.println(lista[i] );		

	}

	public static void mostrarArrayTerminadosEn(int lista[]){
		for(int i=0;i<lista.length;i++){
			//No incluimos las posiciones que tengan un 0
			if(lista[i]!=0){
				System.out.println("El numero "+lista[i]+" acaba en el numero deseado");
			}
		}
	}

	public static int[] numTerminadosEn (int num[], int ultimo_numero){
		// Devuelve el array que almacenara los numeros terminados en el numero pedido			
		int tam=0, n=0;
		
		// En esta soluci�n cuento primero el n�mero de elementos que acaban en el n�mero dado
		// y creo el array con el tama�o justo
		for (int i=0;i<num.length;i++){
			// numeroFinal=num[i]-(num[i]/10*10);
			// Si el numero obtenido es el buscado, lo a�adimos
			if (num[i]%10==ultimo_numero)
				tam++;
		}
		
		int terminadosEn[]=new int[tam];
		
		for (int i=0;i<num.length;i++)
			//Si el numero obtenido es el buscado, lo a�adimos
			if (num[i]%10==ultimo_numero)
				terminadosEn[n++]=num[i];

		return terminadosEn;
	}

}