package mainapp;

import models.Baraja;
import models.Carta;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		
		Baraja baraja = new Baraja (1, true);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bienvenido :)");
		boolean terminar = false;
		double puntuacion = 0;
		
		do {
			if (puntuacion < 7.5) {
				System.out.println("¿Qué quieres hacer?   Tu puntuación es: " + puntuacion);
				System.out.println("  ");
				System.out.println("1) Quiero coger una carta");
				System.out.println("2) Quiero plantarme");
				
				int elegir = Integer.parseInt(sc.nextLine());
				
				switch (elegir) {
				case 1:
					Carta aux = new Carta(baraja.robar().getId());
					System.out.println("Has sacado el " + aux.getNombreCarta());
					puntuacion += aux.getValor7ymedia();
					break;
					
				case 2:
					System.out.println("Te has plantado con " + puntuacion + " puntos :$");
					terminar = true;
					break;
					
				default:
					System.out.println("No se reconoce la opción escogida :(");
					break;
				}
				
		
			} else {
				System.out.println("Te has pasado alv :v");
				terminar = true;
			}
			
		} while (!terminar);
		
	}

}
	


	