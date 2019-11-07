package proiect_masina;

public class Masina {
	private int pret;
	private double capacitate;
	private String producator;
	private String model;
	private String culoare;
	private boolean disponibilitate;
	
	public Masina(){
		pret = 1500;
		culoare = "negru";
		capacitate = 1.9;
		model = "Golf";
		producator = "Volkswagen";
		disponibilitate = true;
	}
	
	public Masina(int p, String pr){
		pret = p;
		producator = pr;
		culoare = "negru";
		model = "Golf";
		disponibilitate = true;	
	}
	
	public Masina (int p, double cap, String pr, String mo, String c, boolean disp){
		pret = p;
		capacitate = cap;
		producator = pr;
		model = mo;
		culoare = c;
		disponibilitate = disp;
		
	}
	
	public int getPret(){
		return pret;
	}
	
	public double getCapacitate(){
		return capacitate;
	}
	
	public String getProducator(){
		return producator;
	}
	
	public String getModel(){
		return model;
	}
	
	public String getCuloare(){
		return culoare;
	}
	
	public boolean getDisponibilitate(){
		return disponibilitate;
	}
}
