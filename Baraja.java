package models;
import java.util.ArrayList;
import java.util.Collections;

public class Baraja {
	
	//Propiedades
	private ArrayList<Carta> listaCartas;
	
	//Constructores
	public Baraja() {
		listaCartas = new ArrayList<Carta>();
	}
	public Baraja(int tipobaraja) {
    this();
	if (tipobaraja == 1 || tipobaraja == 2) {
		for (int i = 1; i < (40 * tipobaraja) + 1; i++) {
			if (i < 41)
				this.listaCartas.add(new Carta(i));
			else
				this.listaCartas.add(new Carta(i - 40));
		}
	}
}
	
	public Baraja(int tipobaraja, boolean barajar) {
		this(tipobaraja);
		barajar();
	}
	
	
	
    //Métodos

	public void barajar() {
		Collections.shuffle(listaCartas);
	}

	public void cortar (int posicion) {
		ArrayList<Carta> aux =new ArrayList<Carta>();
		for (int i = 0; i < posicion; i++) {
			aux.add(this.listaCartas.get(0));
			this.listaCartas.remove(0);
			
		}
		
		for (int i = 0; i < posicion; i++) {
			
		}
	}
	
	public Carta robar() {
		return this.listaCartas.remove(0);
	}
	
	public void insertaCartaFinal (int id_carta) {
		int aux =id_carta;
		this.listaCartas.add(new Carta(aux));
	}
	
	public void insertaCartaPrincipio (int id_carta) {
		int aux =id_carta;
		this.listaCartas.add(0, new Carta(aux));
	}
	
	public void insertaCartaFinal(Carta c) {
		this.listaCartas.add(c);
	}
	
	public void insertaCartaPrincipio(Carta c) {
		this.listaCartas.add(0, c);
	}
	
	public int getNumeroCartas() {
		return this.listaCartas.size();
		
	}
	
	public boolean isVacia() {
		return this.listaCartas.isEmpty();
	}
	
	//To String
	@Override
	public String toString() {
		return "Baraja [lista_cartas=" + listaCartas + "]";
	}
	
	
	
}
