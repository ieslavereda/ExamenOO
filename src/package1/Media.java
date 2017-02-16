package package1;

public abstract class Media {
	// a)
	private String titulo;
	// b)
	protected int año;
	
	// c)
	// Constructores
	public Media(String tit) {
		this.titulo = tit;
	}
	
	// d)
	// Setters y getters de Año
	public void setAños(int año) {
		this.año = año;
	}
	public int getAño() {
		return this.año;
	}
	
	// Setters y getters de Titulo
	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String tit) {
		this.titulo = tit;
	}
	
	// e)
	// Metodo abstracto print
	public abstract String print();
}
