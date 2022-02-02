package matrices;

public class Ej6_1 {
	public static void main(String[] args) {
		final int NF = 4, NC = 5;
		int[][] matriz = new int[NF][NC];

		rellenar(matriz);
		escribir(matriz);
		System.out.println("Matriz con suma de filas y columnas:\n");
		escribirConSuma(matriz);
	}

	static void rellenar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++)
				matriz[i][j] = (int) (Math.random() * 10);
	}

	static void escribir(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				System.out.printf("%4d", matriz[i][j]);
			System.out.println();
		}
		System.out.println();
	}

	static void escribirConSuma(int[][] matriz) {
		int sumaFila;
		int[] fila = new int[matriz[0].length];
		
		for (int i = 0; i < matriz.length; i++) {
			sumaFila = 0;
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.printf("%4d", matriz[i][j]);
				sumaFila += matriz[i][j];
				
				fila[j] = fila[j] + matriz[i][j]; // Es la suma de la columna j
			}
			System.out.printf("%6d %n",sumaFila);// Suma de los elementos de la fila i
		}
		System.out.println();
		for (int i = 0; i < matriz[0].length; i++)
			System.out.printf("%4d", fila[i]);// suma de cada columna i
	}
}
