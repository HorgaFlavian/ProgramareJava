package horga_flavian_proiect;



public class Angajat extends Persoana {
	
	 int idUnic;
	 static int id = 0;
	 
	 Angajat(){
		 
	 }
	 
	 Angajat(String nume, String prenume, String nrtelefon, String email){
		this.idUnic = id++;
		this.nume = nume;
		this.prenume = prenume;
		this.nrtelefon = nrtelefon;
		this.email = email;
	}
	
	 Angajat(String nume, String prenume, String nrtelefon){
		this.idUnic = id++;
		this.nume = nume;
		this.prenume = prenume;
		this.nrtelefon = nrtelefon;
		
	}
	
	public Angajat(String line) {
		String[] split = line.split(" ");
		nume = split[0];
		prenume = split[1];
		nrtelefon = split[2];
		email = split[3];
	}

	
	
	//setteri
	public void setEmail(String emailNou) {
		email = emailNou;
	}
	
	public void setNrtelefon(String nrtelefonNou){
		nrtelefon = nrtelefonNou;
	}
	
	
	//toString
	public String toString() {
		return idUnic + ". " + nume + " " + prenume + " " + nrtelefon + " " + email;
	}
}
