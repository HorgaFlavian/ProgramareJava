package horga_flavian_proiect;

public class Cumparator extends Persoana {
	 
	int idUnic;
	static int id = 0;
	Masina[] masini;
	
	Cumparator (){
	}
	
	
	Cumparator (String nume, String prenume, Masina m1, Masina m2){
		this.nume = nume;
		this.prenume = prenume;
		masini = new Masina [2];
		this.masini[0] = m1;
		this.masini[1] = m2;
		
	}
	
	
	
	Cumparator(String nume, String prenume, String nrtelefon, String email){
		this.idUnic = id++;
		this.nume = nume;
		this.prenume = prenume;
		this.nrtelefon = nrtelefon;
		this.email = email;
		
	}
	
	Cumparator(String nume, String prenume, String nrtelefon){
		this.idUnic = id++;
		this.nume = nume;
		this.prenume = prenume;
		this.nrtelefon = nrtelefon;
		
	}
	
	Cumparator (String nume){
		this.nume = nume;
	}
	
	public String getPrenume() {
		return prenume;
		
	}
	
	public String getNume2() {
		return nume;
	}
	
	//toString
	public String toString() {
		return "Cumparatorul" + " " + idUnic + " are numele " + nume + " " + prenume + " cu numarul de telefon " + nrtelefon + " si email " + email;
	}
	
	
	//Exemplu pentru Overloading
	public void cerere() {
		System.out.println("Cumparatorul " + this.nume + "doreste o masina cu un pret nespecificat");
	}
	
	
	public void cerere (int pret) {
		System.out.println("Cumparatorul" + this.nume + "doreste o masina cu pretul" + pret);
	}
	
	
	
//	public void getNume() {
//		System.out.println(this.nume);
//	}
//	
	public void setNume(String numeNou) {
		nume = numeNou;
	}
	
	public void setPrenume(String prenumeNou) {
		prenume = prenumeNou;
	}
	
	public void setNrTelefon(String nrTelefonNou) {
		nrtelefon = nrTelefonNou;
	}
	
	public void setEmail(String EmailNou) {
		email = EmailNou;
	}
}
