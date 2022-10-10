package ar.com.codoacodo.herencia;

import java.util.Arrays;

public class MenorPrecio extends FiltroBase implements IFiltros {
	
	public MenorPrecio () {
		super("Menor Precio");
	}
	public MenorPrecio (Articulo[] lista) {
		super("Menor Precio", lista);
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
		Arrays.sort(lista, (a, b) -> Float.compare(a.getPrecio(), b.getPrecio()));
		
	}
	
	
}
