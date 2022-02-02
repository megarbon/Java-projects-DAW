package matrices.Ej9_2;

// En esta versi�n guardaremos en seleccion el numero de jugador y su altura
public class Ej9_2 {
	public static void main(String[] args) {
		final int NF = 20, NC = 10;
		int[][] matriz = new int[NF][NC];

		rellenar(matriz);
		escribir(matriz);
		calcEquipoAltMedia(matriz);

		Jugador[] seleccion = new Jugador[NF];
		// TENDRA EL NUMERO DEL JUGADOR

		crearSeleccion(seleccion, matriz);

		System.out.println("La seleccion de los jugadores m�s altos es: ");
		for (int i = 0; i < seleccion.length; i++)
			System.out.println("Equipo " + (i + 1) + " " + seleccion[i]);
	}

	static void rellenar(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz[i].length; j++)
				matriz[i][j] = (int) ((Math.random() * (210 - 180 + 1)) + 180);
	}

	static void escribir(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++)
				System.out.print(matriz[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}

	static void calcEquipoAltMedia(int[][] mat) {
		int suma, equipoMax = 0;
		double media, mediaMax = -1;

		for (int i = 0; i < mat.length; i++) {
			suma = 0;
			// Guardamos en suma la suma de las alturas para cada fila
			for (int j = 0; j < mat[i].length; j++) {
				suma = suma + mat[i][j];
			}

			// Calculamos la media de cada fila

			media = (double) suma / (mat[i].length);
			if (media > mediaMax) {
				mediaMax = media;
				equipoMax = i;
			}

			System.out.println("El equipo " + i + " tiene de media: " + media);

		}

		System.out.println("El equipo " + equipoMax + " tiene la media m�s alta: " + mediaMax);

	}

	static void crearSeleccion(Jugador[] sel, int[][] mat) {
		int max, pos;

		for (int i = 0; i < mat.length; i++) {
			max = mat[i][0];// primera columna de la fila i-esima
			pos = 0;
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] > max) {
					max = mat[i][j];
					pos = j;
				}
			}
			sel[i] = new Jugador(max, pos + 1);

		}
	}

}
