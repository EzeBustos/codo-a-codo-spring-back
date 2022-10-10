package ar.com.codoacodo.herencia;

public class CreadorDeFiltros {
	//metodo estático: metodo que no le pertenece a una instancia, sino a una clase
	
	public static IFiltros crearFiltro(String clave) {
		
		IFiltros filtro;
		
		switch (clave) {
			case "MASVENDIDOS":
				filtro = new MasVendidos();
				break;
			case "MAYORPRECIO":
				filtro = new MayorPrecio();
				break;
			case "MENORPRECIO":
				filtro = new MenorPrecio();
				break;
	
			default:
				filtro = new MasVendidos();
				break;
		}
		return filtro;
	}

	public static IFiltros crearFiltroDefault() {
		return crearFiltro("MASVENDIDOS");
	}
	
	
}
