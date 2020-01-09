package horga_flavian_proiect;

public class Persoana {
	String nume;
	String prenume;
	String nrtelefon;
	String email;

	
//	//Compozitie
//	Persoana(String nume, String prenume){
//		final Cumparator cumparator;
//		this.nume = nume;
//		this.prenume = prenume;
//		cumparator = new Cumparator();
//		
//	}

	Persoana(){
	}
	
	
	
	Persoana(String nume, String prenume, String nrtelefon, String email){
		this.nume = nume;
		this.prenume = prenume;
		this.nrtelefon = nrtelefon;
		this.email = email;
		
		
	}
	
	Persoana(String nume, String prenume, String nrtelefon){
		this.nume = nume;
		this.prenume = prenume;
		this.nrtelefon = nrtelefon;
	}
	
	
	public void getNume() {
		System.out.println(this.nume);
	}
	
}
