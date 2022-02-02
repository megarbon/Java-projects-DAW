package arrays2;

import java.util.Scanner;
public class Ej1 {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		final int TAM = 100;
	
		int[] array1=new int[TAM];
		
		rellenarArray(array1, teclado);
        escribir(array1);
        escribirReves(array1);
        teclado.close();
   	}
	
	// Por variar, el bucle hecho de otra manera...
    static void rellenarArray(int[] a, Scanner tec){
    	for (int i=1;i<=a.length;i++)   		
    		 a[i-1]=i;		
    }
    
    static void escribir(int[] a){
    	for(int i=0;i<a.length;i++)
    		System.out.print(a[i]+" ");
    	System.out.println();
    }
	
    static void escribirReves(int[] a){
    	for(int i=a.length-1;i>=0;i--)
    		System.out.print(a[i]+" ");
    	System.out.println();
    }
 }
