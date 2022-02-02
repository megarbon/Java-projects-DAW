package arrays2;

import javax.swing.JOptionPane;
public class Ej3_1 {

	public static void main(String[] args) {

		//Indicamos el tamanio
		String texto=JOptionPane.showInputDialog("Introduce un tamanio");
		int num[]=new int[Integer.parseInt(texto)];

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
			//Generamos un numero entre los parametros pasados
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

		//Array que almacenara los numeros terminados en el numero pedido
		int terminadosEn[]=new int[num.length];

		int numeroFinal;

		for (int i=0;i<terminadosEn.length;i++){

			/*
			 * Restamos el numero por el mismo numero sin unidades
			 * Por ejemplo, 325-320=5
			 */
			//numeroFinal=num[i]-(num[i]/10*10);
            numeroFinal=num[i]%10;//El resto de dividir entre 10 da el ultimo digito
			//Tambien podriamos hacerlo asi:
			//String s=Integer.toString(num[i]);;		
			//numeroFinal=Character.getNumericValue(s.charAt(s.length()-1));

			//Si el numero obtenido es el buscado, lo aniadimos
			if (numeroFinal==ultimo_numero){
				terminadosEn[i]=num[i];
			}
		}

		return terminadosEn;
	}

}
