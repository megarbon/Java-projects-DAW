package matrices;

public class Ej3_2 {
	public static void main(String[] args) {

		int[][] matriz = { { 1, 2, 3 }, { 4, 5 }, { 6 } };

		int identica1[][], identica2[][]; // Creamos solo las referencias

		System.out.println("MATRIZ ORIGINAL 1");
		escribir(matriz);

		/* FORMA 1 */
		identica1 = creaIdentica(matriz);

		/* FORMA 2 */
		identica2 = matriz.clone();

		System.out.println("FORMA 1");
		escribir(identica1);
		System.out.println("FORMA 2");
		escribir(identica2);

		System.out.println(matriz);
		System.out.println(identica1);
		System.out.println(identica2);
	}

	static void escribir(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	static int[][] creaIdentica(int[][] mat) {
		int[][] nueva = new int[mat.length][];

		for (int i = 0; i < mat.length; i++) {
			nueva[i] = new int[mat[i].length];
			for (int j = 0; j < mat[i].length; j++)
				nueva[i][j] = mat[i][j];
		}

		return nueva;
	}

}
