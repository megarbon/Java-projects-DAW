package secuenciales;

import java.util.Scanner;

public class Sec_17 {

	public static void main(String[] args) {
		int horapartida, minpartida, segpartida, seginicial, segfinal, segviaje, horallegada, minllegada, segllegada;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Hora de salida:");
		horapartida = Integer.parseInt(sc.nextLine());		
		System.out.println("Minutos de salida:");
		minpartida = Integer.parseInt(sc.nextLine());	
		System.out.println("Segundos de salida:");
		segpartida = Integer.parseInt(sc.nextLine());
		System.out.println("Tiempo que has tardado en segundos:");
		segviaje = Integer.parseInt(sc.nextLine());
		
			
		//Convierto la hora de salida a segundos
		seginicial = horapartida * 3600 + minpartida*60 + segpartida;
		//Le sumo los segundos que ha tardado
		segfinal = seginicial + segviaje;
		
		//Convierto los segundos totales a hora, minuto y segundos
		horallegada = (int)(segfinal / 3600); // Horas
		minllegada = (int)((segfinal % 3600) / 60); // Minutos
		segllegada = (int)(segfinal % 3600) % 60; // Segundos que no se pudieron transformar en minutos
		
		//Muestro la hora de llegada
		System.out.println("Hora de llegada");
		System.out.println( horallegada + ":" + minllegada + ":" + segllegada);

		sc.close();
	}
	
}
