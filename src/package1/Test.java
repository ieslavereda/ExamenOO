package package1;

public class Test {

	public static void main(String[] args) {
		
		// a)
		Persona michael = new Persona("Michael");
		Persona amy = new Persona("Amy");
		
		// b)
		CD[] cds = new CD[2];		
		cds[0] = new CD("Thriller",michael,1982);
		cds[1] = new CD("Black to black",amy,2006);
		
		// c)
		for(int i=0;i<cds.length;i++){
			System.out.println(cds[i].print());
		}
		
		// d)
		cds[0].getArtista().setNombre("Michael Jackson");
		// Instrucciones no necesarias solo comprobación de la linea anterior
		// System.out.println(cds[0].print()); 				
		
	}

}
