import java.util.Random;

// Importamos la clase Random del paquete java.util

public class AccesoPaquete2{
	public static void main(String args[]){
		// Se crea el objeto
		Random generadorNumeros = new Random();
		// Se genera e imprime el número
		System.out.println(generadorNumeros.nextInt(1000));
	}
}