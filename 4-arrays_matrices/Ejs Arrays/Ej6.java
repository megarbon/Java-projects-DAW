package arrays2;
public class Ej6 {

	public static void main(String[] args) {
		final int TAM = 11; 
		final int NUM = 100;
		// El tamaño es siempre 100
		int num[]=new int[TAM];// Se inicializa por defecto a cero

		//rellenamos el array
		rellenarNumAleatorioArray(num, 0, TAM-1, NUM);
		
		// Para comprobar que lo hace bien, en tiempo de desarrollo:
		mostrarArray(num);
		
		// Mostramos lo pedido:
		mostrarHistograma(num);						
	}
	
	public static void rellenarNumAleatorioArray(int lista[], int a, int b, int n){
		int valor;
		for(int i=0;i<n;i++){// Se generan 100 números
			//Generamos un número entre los parametros pasados
			valor = (int)(Math.random()*(b-a+1)+a);
			System.out.println(valor);
			lista[valor]++;
			// En esta solucion, segun generamos los numeros rellenamos un array para 
			// ir contando las ocurrencias de cada numero
		}
	}

	public static void mostrarArray(int lista[]){
		System.out.println("---------------------------------");	
		for(int i=0;i<lista.length;i++)
			System.out.println(i + ":" + lista[i]);		
		System.out.println("---------------------------------");	
	}
	
	public static void mostrarHistograma(int lista[]){
		for(int i=0;i<lista.length;i++){		
			System.out.print(i + ":");
			for (int j=0;j<lista[i]; j++)
				System.out.print('*');
			System.out.println();
		}
	}

}