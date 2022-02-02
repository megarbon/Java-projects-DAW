package matrices.Ej9_2;

public class Jugador {
	int altura;
	int numero;

	public Jugador(int altura, int numero) {
		super();
		this.altura = altura;
		this.numero = numero;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Jugador [ numero= " + numero + " altura= "+ altura + "]";
	}
}
