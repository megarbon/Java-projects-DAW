package arrays2;
// Sin arrays, ya lo habíamos hecho

import java.util.Scanner;
public class Ej5_2 {
	
public static boolean Capicua(int numero){
	boolean resultado=false;
	int resto;
	int n_inv=0;
	int aux=numero;
	
	while(numero!=0){
		resto=numero%10;
		n_inv=n_inv*10+resto;
		numero=numero/10;
	}
	
	if(n_inv==aux){
		resultado=true;
	}else{
		resultado=false;
	}
	
	return resultado;
}

public static void main(String[] args){
	boolean comprobar;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Introduce el numero");
	int numero=sc.nextInt();
	
	comprobar=Capicua(numero);
	
	if(comprobar==true){
		System.out.println("El numero es capicua");
	}else{
		System.out.println("El numero no es capicua");
	}
	sc.close();
}
}