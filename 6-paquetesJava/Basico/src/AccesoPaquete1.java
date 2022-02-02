// No importamos y utilizamos el nombre de la clase y el paquete

public class AccesoPaquete1{
	public static void main(String args[]){
		// Se crea el objeto
		java.util.Random generadorNumeros = new java.util.Random();
		// Se genera e imprime el número
		System.out.println(generadorNumeros.nextInt(1000));
	}
}