package main;
import misdoc.*;

public class ImportacionDePaquetes{
	public static void main(String args[]){
		Factura factura1 = new Factura("Jesús Carretero", 100.00);
		Factura factura2 = new Factura("Félix García", 300.00);
				
		factura1.imprimirInfo();
		factura2.imprimirInfo();		
	}
}