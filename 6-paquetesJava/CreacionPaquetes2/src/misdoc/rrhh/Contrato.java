package misdoc.rrhh;

public class Contrato{
	private String nombre;
	private int duracionMeses;
	
	public Contrato(String nuevoNombre, int nuevaDuracion){
		nombre = nuevoNombre;
		duracionMeses = nuevaDuracion;
	}
	
	public void imprimirInfo(){
		System.out.println("--- CONTRATO ---");
		System.out.print("El contrato está a nombre de: ");
		System.out.println(nombre);
		System.out.print("Con una duración de  ");
		System.out.print(duracionMeses);
		System.out.println(" meses. ");		
	}
}