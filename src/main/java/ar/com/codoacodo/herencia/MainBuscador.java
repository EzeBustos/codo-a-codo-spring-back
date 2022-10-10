package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.clase6.Libro;

public class MainBuscador {

	public static void main(String[] args) {
		
		//Simular que se busco algo
		/*String claveDelUsuario = "iron man";
		
		Buscador miBuscador = new Buscador(claveDelUsuario);
		//miBuscador.claveBusqueda = claveDelUsuario;
		
		miBuscador.buscar();
		
		
		miBuscador.mostrarResultados();*/
		
		String clave = "Harry Potter";
		
		Buscador buscador = new Buscador(clave);
		
		buscador.buscar();
		
		buscador.mostrarResultados();
		System.out.println("----");
		
		buscador.ordenar();		
		buscador.mostrarResultados();
		System.out.println("----");
		
		String claveOrden = "MAYORPRECIO";
		IFiltros filtro = CreadorDeFiltros.crearFiltro(claveOrden);
		buscador.cambiarFiltro(filtro);
		buscador.ordenar();
		buscador.mostrarResultados();		
		System.out.println("----");
		
		claveOrden = "MENORPRECIO";
		filtro = CreadorDeFiltros.crearFiltro(claveOrden);
		buscador.cambiarFiltro(filtro);
		buscador.ordenar();
		buscador.mostrarResultados();		
		System.out.println("----");
		
		//Articulo[] resultados = buscador.getResultados();
		
		//Simulo pantala de resultados
		/*for(Articulo unResultado : resultados) {
			//System.out.println(unResultado.toString());
			if(unResultado instanceof Libro) {
				Libro l = (Libro)unResultado;
				l.getIsbn();
				l.getNroPaginas();
			}
		}*/

	}

}
