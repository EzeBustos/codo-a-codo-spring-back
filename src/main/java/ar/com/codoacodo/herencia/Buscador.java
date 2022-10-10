package ar.com.codoacodo.herencia;

public class Buscador {
	private String claveBusqueda;
	private Articulo[] resultados;
	private IFiltros filtros;
	
	public Buscador(String claveDelUsuario){
		//this.claveBusqueda = claveDelUsuario;
		this.setClaveBusqueda(claveDelUsuario);
		//this.resultados = new Articulo[]{};
		this.setResultados(new Articulo[]{});
		
		//this.setFiltros(new MasVendidos());  //antes
		this.setFiltros(CreadorDeFiltros.crearFiltroDefault());
		}
	
	private void setFiltros(IFiltros filtro) {
		this.filtros = filtro;		
	}
	
	public void cambiarFiltro(IFiltros nuevoFiltro) {
		setFiltros(nuevoFiltro);
	}
	
	public void ordenar() {
		/*switch (claveDeOrdenamiento) {
			case "MASVENDIDOS":
				this.setFiltros(new MasVendidos(this.getResultados()));
				break;
			case "MAYORPRECIO":
				this.setFiltros(new MayorPrecio(this.getResultados()));
				break;
			case "MENORPRECIO":
				this.setFiltros(new MenorPrecio(this.getResultados()));
				break;
	
			default:
				this.setFiltros(new MasVendidos(this.getResultados()));
				break;
		}*/
		
		//down casting de IFiltros a FiltroBase
		((FiltroBase)(this.filtros)).setLista(getResultados());
		this.filtros.ordenar();
	}

	/*firma del metodo: void*/
	public void buscar(){
		/*Simular que busco en una db*/
		
		DBUtil db = new DBUtil(); 
		
		/*Articulo[] resultados = db.obtenerResultado(this.claveBusqueda);
		this.resultados = resultados;*/
		
		//this.resultados = db.obtenerResultado(this.claveBusqueda);
		this.setResultados(db.obtenerResultado(this.claveBusqueda));
	}
	
	public void mostrarResultados() {
		System.out.println("Hemos encontrado " + this.cantidadResultados() + "resultados para " + this.claveBusqueda);
		for(Articulo aux : this.getResultados()) {
			System.out.println("Tirulo: " + aux.getTitulo());
			System.out.println("Autor: " + aux.getAutor());
			System.out.println("Img: " + aux.getImg());
			System.out.println("Precio: " + aux.getPrecio());
			System.out.println("Cant. Vendidos: " + aux.getCantVendidos());
			System.out.println("Fecha Public: " + aux.getFechaDePublicacion());
			System.out.println("-------");
		}
	}
	
	int cantidadResultados() {
		return this.resultados.length;
	}
	
	//getters/setters : metodos
	String getClaveBusqueda(){
		return this.claveBusqueda;
	}
	public Articulo[] getResultados() {
		return this.resultados;
	}

	public void setResultados(Articulo[] resultados) {
		this.resultados = resultados;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}
	
	
}
