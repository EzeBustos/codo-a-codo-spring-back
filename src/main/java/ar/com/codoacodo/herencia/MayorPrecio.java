package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MayorPrecio extends FiltroBase implements IFiltros {
	
	public MayorPrecio () {
		super("Mayor Precio");
	}
	public MayorPrecio (Articulo[] lista) {
		super("Mayor Precio", lista);
	}
	
	public void ordenar() {
		System.out.println("Ordenado por " + getNombre());
		//_3_|_5_|_4_|_2_|_9_|
		
		//_9_|_5_|_4_|_3_|_2_|
		
		//algoritmos de ordenamiento
		
		//bubuja/ secuncial/ (binaria?)/ mergesort/ heapsort/ quicksort
		
		
		
		//a - b = 0 => iguales
		//a - b > 0 => a es mayor que b
		//a - b < 0 => b es mayor que a
		Arrays.sort(lista, (a, b) -> Float.compare(b.getPrecio(), a.getPrecio()));
		
	}
	
	
}
