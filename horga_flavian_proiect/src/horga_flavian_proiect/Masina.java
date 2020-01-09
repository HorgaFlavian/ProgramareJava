package horga_flavian_proiect;

public class Masina {
	int idUnic;
	static int id = 0;
	String fabricant;
	String model;
	int an;
	int kilometraj;
	double pret;
	
	//constructori 
	Masina (String fabricant, String model, int an, int kilometraj, double pret){
		this.idUnic = id++;
		this.fabricant = fabricant;
		this.model = model;
		this.an = an;
		this.kilometraj = kilometraj;
	}
	
	Masina(){
	}
	
	public Masina(String line) {
		String[] split = line.split(" ");
		fabricant = split[0];
		model = split[1];
		an = Integer.parseInt(split[2]);
		kilometraj = Integer.parseInt(split[3]);
		pret = Integer.parseInt(split[4]);
	}
	
	//getteri
	public int getId() {
		return idUnic;
	}
	public String getFabricant() {
		return fabricant;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getKilometraj() {
		return kilometraj;
	}
	
	public double getPret() {
		return pret;
	}
	
	
	}

