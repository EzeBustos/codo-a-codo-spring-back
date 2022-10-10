package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.clase6.Libro;
import ar.com.codoacodo.herencia.clase6.Musica;
import ar.com.codoacodo.herencia.clase6.Pelicula;

public class DBUtil {
	
	Articulo[] obtenerResultado(String claveBusqueda) {
		Libro primero = new Libro("http://sitio.com.ar/img/img1.jpg", "titulo" + claveBusqueda, "Autor1", 4390);
		primero.setIsbn("9789876378253");
		primero.setNroPaginas(72);
		primero.setCantVendidos(150);
		
		Libro l2 = new Libro("http://sitio.com.ar/img/imgl2.jpg", "titulo2" + claveBusqueda, "Autor2", 490, 75, "9789876378352");
		l2.setCantVendidos(15);
		
		Musica m1 = new Musica("http://sitio.com.ar/img/imgm1.jpg", "titulo3" + claveBusqueda, "Autor3", 40500, "Sony Music", new String[] {});
		m1.setCantVendidos(100);
		Musica m2 = new Musica("http://sitio.com.ar/img/imgm2.jpg", "titulo4" + claveBusqueda, "Autor4", 4050);
		m2.setSello("Warner");
		m2.setCantVendidos(50);
		
		Pelicula p1 = new Pelicula("http://sitio.com.ar/img/imgp1.jpg", "titulo5" + claveBusqueda, "Autor5", 2040, "Fox", "Blue Ray");
		p1.setCantVendidos(510);
		Pelicula p2 = new Pelicula("http://sitio.com.ar/img/imgp2.jpg", "titulo6" + claveBusqueda, "Autor6", 4020);
		p2.setFormato("DVD");
		p2.setCantVendidos(10);
		
		Articulo a = new Articulo("http://sitio.com.ar/img/imgart.jpg", "titulo7" + claveBusqueda, "Autor7", 439);
		a.setCantVendidos(64);
		
		//crear un vector/array/arreglo!
		/*Articulo[] resultado = new Articulo[3]; //vector vacio
		resultado[0] = primero;
		resultado[1] = segundo;
		resultado[2] = tercero;*/
		
		//Articulo[] res = new Articulo[] {primero, segundo, tercero};//vector con datos cargados
		
		//return res;
		
		return new Articulo[] {primero, l2, m1, m2, p1, p2, a};
	}
}
