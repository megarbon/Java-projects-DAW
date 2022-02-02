package misdoc.gestioneconomica;

public class Recibo{
	public String concepto;
	public int dia;
	public int mes;
	public int año;
	
	public Recibo(String nuevoConcepto, int nuevoDia, int nuevoMes, int nuevoAño){
		concepto = nuevoConcepto;
		dia = nuevoDia;
		mes = nuevoMes;
		año = nuevoAño;
	}
	
	public void imprimirInfo(){
		System.out.println("----RECIBO----");
		System.out.print("Recibo emitido el ");
		System.out.print("El contrato está a nombre de: ");
		System.out.print(dia);
		System.out.print("-");
		System.out.print(mes);
		System.out.print("-");
		System.out.println(año);
		System.out.print("Bajo el concepto: ");
		System.out.println(concepto);	
	}
}