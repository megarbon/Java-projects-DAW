import java.util.*;

// Importamos el paquete java.util entero

public class AccesoPaquete3{
	public static void main(String args[]){
		// Se crea el objeto
		Random generadorNumeros = new Random();
		// Se genera e imprime el número
		System.out.println(generadorNumeros.nextInt(1000));
	}
}