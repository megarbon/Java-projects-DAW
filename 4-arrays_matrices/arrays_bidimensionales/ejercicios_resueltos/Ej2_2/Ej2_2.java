package matrices.Ej2_2;



public class Ej2_2 {
	public static void main(String[] args) {
		int[][] matrizA = {{1, 2, 3},{4, 5},{6}};
		int num = (int) (Math.random() * 10);

		escribir(matrizA);

		Elemento pos = buscar(matrizA, num);
		
		if (pos != null)
			System.out.println("El numero " + num + " esta en la posicion " + pos);
		else
			System.out.println("El numero " + num + " no esta en la matriz");
	}

	static void escribir(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	static Elemento buscar(int[][] matriz, int n) {
		boolean encont = false;
		Elemento el  = null;

		for (int i = 0; i < matriz.length && !encont; i++) {
			for (int j = 0; j < matriz[i].length && !encont; j++) {
				if (matriz[i][j] == n) {
					el = new Elemento(i, j);				
					encont = true;
				}
			}
		}

		return el;
	}

}