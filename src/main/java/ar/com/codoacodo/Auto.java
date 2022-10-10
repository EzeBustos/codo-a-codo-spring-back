package ar.com.codoacodo;

public class Auto {
	/*
	 atributos
	 */
	boolean encendido;
	float velocidad; //Alt+Shif+r (cambiar el nombre de la variable en todos lados)
	String marca;
	String modelo;
	int anio;
	float velocidadMaxima;
	
	//Constructor
	Auto(){
		this.encendido = false;
		this.velocidadMaxima = 200;
		this.velocidad = 0;
	}
	
	Auto(final float velocidadMaxima){
		this.velocidad = 0;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	//metodos
	void encender() {
		if(!encendido) {
			
			System.out.println("se encendo el auto"); 
			encendido = true;
		}else {
			System.out.println("ya esta encendido"); 
		}
	}
	void apagar() {
		if(encendido) {
			System.out.println("apagando");
			this.encendido = false;
			this.detener();
		}else {
			System.out.println("ya esta apagado");
		}
	}
	void acelerar() {
		if(this.encendido) {
			if(this.velocidad < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidad++;
			}else {
				System.out.println("se quema el auto");
			}
		}else {
			System.out.println("debe encender el auto");
		}
	}
	
	void quintaAFondo() {
		if(this.encendido) {
			while(this.velocidad < velocidadMaxima) {
				System.out.println("acelerando");
				this.velocidad++;				
			}
			System.out.println("se quema el auto");			
		}else {
			System.out.println("debe encender el auto");
		}
	}
	
	void frenar() {
//		if(this.encendido) {
			if(this.velocidad > 0) {				
				System.out.println("frenando");
				this.velocidad--;
			}else {
				System.out.println("llegaste a 0");
			}
//		}else {
//			System.out.println("auto apagado");
//		}
	}
	
	void detener() {
		//acceder a otro metodo, desde un metodo
		while(this.velocidad > 0) {					
			this.frenar();
		}
	}
	
	void mostrarInfo() {
		System.out.println("encendido: " + encendido);
	}
	
}
