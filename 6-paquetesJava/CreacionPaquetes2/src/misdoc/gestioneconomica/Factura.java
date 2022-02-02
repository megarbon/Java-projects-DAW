package misdoc.gestioneconomica;

public class Factura{
	private String comprador;
	private double importe;
	
	public Factura(String nuevoComprador, double nuevoImporte){
		comprador = nuevoComprador;
		importe = nuevoImporte;
	}
	
	public void imprimirInfo(){
		System.out.println("--- FACTURA ---");
		System.out.print("Factura a nombre de: ");
		System.out.println(comprador);
		System.out.print("Por un importe de: ");
		System.out.println(importe);	
	}
}