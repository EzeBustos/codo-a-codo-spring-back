package ar.com.codoacodo.herencia.clase6;

import ar.com.codoacodo.herencia.Articulo;

public class MainClase6 {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro("/libro.jpg", "Iron Man", "Alguien", 3500);
//		libro1. (aca puedo acceder tanto los metodos del padre como los del hjio)
		
		Articulo art = new Articulo ("/libro.jpg", "Iron Man", "Alguien", 3500);
//		art.  (aca puedo acceder tanto los metodos del padre)
		
		
		/*//Padre p = new Hijo();
		Articulo a = new Libro ("/libro.jpg", "Iron Man", "Alguien", 3500);
//		a.  (aca puedo acceder tanto los metodos del padre)
		Libro libroDentroDeA = (Libro)a;
//		libroDentroDeA.   (aca puedo acceder tanto los metodos del padre como los del hjio)*/
		
		
		
	}

}
