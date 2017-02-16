package package1;

public class CD extends Media {
	// a)
	private Persona artista;
	
	// b)
	public CD(String titulo, Persona artista, int año) {
		super(titulo);
		this.artista = artista;
		this.año = año;
	}
	// Metodo print que me obliga a crear la clase Media
	public String print() {
		return 	"Datos del CD: \n" + "------------------------ \n" + 
				"Titulo: " + this.getTitulo() + "\n" + 
				"Artista: "	+ artista.getNombre() + "\n" + 
				"Año :" + this.año;
	}
	
	// c)
	// Setters y getters
	public Persona getArtista() {
		return this.artista;
	}
	public void setArtista(Persona artista) {
		this.artista = artista;
	}	
}
