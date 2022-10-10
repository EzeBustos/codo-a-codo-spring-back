package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MasVendidos extends FiltroBase implements IFiltros {
	public MasVendidos () {
		super("Mas Vendidos", new Articulo[]{});
	}
	public MasVendidos (Articulo[] lista) {
		super("Mas Vendidos", lista);
	}
	
	public void ordenar() {
		System.out.println("Ordenado por " + getNombre());
		
		Arrays.sort(lista, (a, b) -> Integer.compare(b.getCantVendidos(), a.getCantVendidos()));
	}
}
