package ar.com.codoacodo;

public class Auto {
	/*
	 atributos
	 */
	boolean encendido;
	float velocidad;
	String marca;
	String modelo;
	int ano;
	
	//Constructor
	Auto(){
		encendido = false;
	}
	
	//metodos
	void encender() {
		encendido = true;
	}
	void apagar() {
		
	}
	void acelerar() {
		
	}
	void frenar() {
		
	}
	
	void mostrarInfo() {
		System.out.println("encendido: " + encendido);
	}
	
}
