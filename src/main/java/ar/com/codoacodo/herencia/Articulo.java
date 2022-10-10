package ar.com.codoacodo.herencia;

import java.util.Date;

public class Articulo {
	private String img;
	private String titulo;
	private String autor;
	private float precio;
	private Date fechaDePublicacion;
	private int cantVendidos;
	
	/*Alt+Shift+s menu para lo que sea constructor y get and set*/
	public Articulo(String img, String titulo, String autor, float precio) {
		this.img = img;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		if(img != null)
			this.img = img;
		else
			this.img = "MARCA DE AGUA";		
	}

	public String getTitulo() {
		if(this.titulo != null) {
			this.titulo = this.titulo.toUpperCase();
		}
		return this.titulo;
		
		// return titulo!=null ? titulo.toUpperCase() : titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	

	public Date getFechaDePublicacion() {
		return fechaDePublicacion;
	}

	public void setFechaDePublicacion(Date fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}

	public int getCantVendidos() {
		return cantVendidos;
	}

	public void setCantVendidos(int cantVendidos) {
		this.cantVendidos = cantVendidos;
	}

	@Override
	public String toString() {
		return "Articulo [img=" + img + ", titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
	}
	
	
	
}
