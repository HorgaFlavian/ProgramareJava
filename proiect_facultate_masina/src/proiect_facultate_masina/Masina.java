package proiect_facultate_masina;

public class Masina {
	
	String NI; // numar identificare--VIN
	String fabricant;
	String model;
	int an;
	int kilometraj;
	float pret;
	
	Masina(){
	}

	Masina (String NI, String fabricant, String model, int an, int kilometraj, int pret){
		this.NI = NI;
		this.fabricant = fabricant;
		this.model = model;
		this.an = an;
		this.kilometraj = kilometraj;
		this.pret = pret;
		
	}
	
	public boolean adaugaMasina(String NI, String fabricant, String model, int an, int kilometraj, int pret) {
		this.NI = NI;
		this.fabricant = fabricant;
		this.model = model;
		this.an = an;
		this.kilometraj = kilometraj;
		this.pret = pret;
		return true;
		
	}
	
	public String getNI() {
		return NI;
	}
	
	public String getFabricant() {
		return fabricant;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getAn() {
		return an;
	}
	
	public int getKilometraj() {
		return kilometraj;
	}
	
	public float getPret() {
		return pret;
	}
}
