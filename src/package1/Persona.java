package package1;

public class Persona {
	// a)
	private String nombre;
	// b)
	public Persona(String nom){
		this.nombre = nom;
	}
	// c)
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nom){
		this.nombre=nom;
	}
}
