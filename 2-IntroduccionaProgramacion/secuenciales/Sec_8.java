package secuenciales;
// Ejercicio 8


import java.util.Scanner;

public class Sec_8 {
	public static void main(String[] args) {
		Scanner sc;
		float sueldo_base, venta1, venta2, venta3, comision;
		
		sc = new Scanner(System.in);

		System.out.print("Dime el sueldo base:");
		sueldo_base = Float.parseFloat(sc.nextLine());
		
		System.out.print("Dime precio de la venta 1:");
		venta1 = Float.parseFloat(sc.nextLine());
		
		System.out.print("Dime precio de la venta 2:");
		venta2 = Float.parseFloat(sc.nextLine());
		
		System.out.print("Dime precio de la venta 3:");
		venta3 = Float.parseFloat(sc.nextLine());
				
		sc.close();
				
		//comision<-venta1*0.1+venta2*0.1+venta3*0.1;
		comision = (float)((venta1+venta2+venta3)*0.1);
	
		System.out.println("Comisión por ventas:" + comision);
		System.out.println("Sueldo total:" + (sueldo_base+comision));
		
	}
	
}
