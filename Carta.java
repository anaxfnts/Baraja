package models;

import java.util.Scanner;


public class Carta {
	Scanner sc = new Scanner (System.in);
	
	//Propiedades
	private int numero;
	private int palo;
	
	
	//Constructores
	
	/**
	 * @param numero entero que representa el número de la carta.
	 * @param palo entero del 0 al 3 que representa el número del palo.

	 */
	public Carta(int numero, int palo) {
		super();
		this.numero = numero;
		this.palo = palo;
	}
	
	/**
	 * Constructor que crea una carta a partir de su id [1-40]
	 * @param id de la carta
	 */
	public Carta(int id) {
		super();
		if (id != 10 && id != 20 && id != 30 && id != 40)
			this.numero = id % 10;
		else if (id == 10 || id == 20 || id == 30 || id == 40)
			this.numero = 10;
		else
			throw new IllegalArgumentException("La carta con el ID " + id + " no puede ser creada :(");
		this.palo = (id - 1) / 10;
	}


	
	//Getters y Setters
	public int getId() {
		int id = (this.numero) + (this.palo * 10);
		return id;
	}

	public int getNumero() {
		return this.numero;
	}
	
	public int getPalo() {
		return this.numero;
	}
	
	
	public String getNombreNumero() {
		String nombreNumero;
		switch (this.numero) {
		case 1:
			nombreNumero = "as";
			break;
		case 2:
			nombreNumero = "dos";
			break;
		case 3:
			nombreNumero = "tres";
			break;
		case 4:
			nombreNumero = "cuatro";
			break;
		case 5:
			nombreNumero = "cinco";
			break;
		case 6:
			nombreNumero = "seis";
			break;
		case 7:
			nombreNumero = "siete";
			break;
		case 8:
			nombreNumero = "sota";
			break;
		case 9:
			nombreNumero = "caballo";
			break;
		case 10:
			nombreNumero = "rey";
			break;
		default:
			nombreNumero = "No se ha podido reconocer el número :(";
			break;
		}
		return nombreNumero;
	}

	
	
	public String getNombrePalo() {
		String nombrePalo;
		switch (this.palo) {
		case 0:
			nombrePalo = "oros";
			break;
		case 1:
			nombrePalo = "copas";
			break;
		case 2:
			nombrePalo = "espadas";
			break;
		case 3:
			nombrePalo = "bastos";
			break;
		default: 
			nombrePalo="No se ha reconocido el palo, introduce un número del 0 al 3";
			break;
		}
		return nombrePalo;
	
	}
	
	
	public String getNombreCarta() {
		return this.getNombreNumero() + " de " + this.getNombrePalo();
	}

	public int getValorTute() {
		int valorT;
		if (this.numero == 1)
			valorT= 11;
		else if (this.numero == 3)
			valorT = 10;
		else if (this.numero == 8)
			valorT = 2;
		else if (this.numero == 9)
			valorT = 3;
		else if (this.numero == 10)
			valorT = 4;
		else
			valorT = this.numero;
		return valorT;
	}

	public int getValorMus() {
		int valorMus;
		if (this.numero == 1 || this.numero == 2)
			valorMus = 1;
		else if (this.numero == 3 || this.numero == 8 || this.numero == 9 || this.numero == 10)
			valorMus = 10;
		else
			valorMus = this.numero;
		return valorMus;
	}

	public double getValor7ymedia() {
		double valor7;
		if (this.numero == 8 || this.numero == 9 || this.numero == 10)
			valor7 = 0.5;
		else
			valor7 = (double) this.numero;
		return valor7;
	}

	//To String
	
	@Override
	public String toString() {
		return "Carta [sc=" + sc + ", numero=" + numero + ", palo=" + palo + "]";
	}
	
	
	

}

	


