package lab5;



public class Cerc {
	private double raza;
	private String culoare;
	
	public Cerc(){
		raza = 1.0;
		culoare = "rosu";	
	}
	
	public Cerc(double r){
		raza = r;
		culoare = "rosu";
	}
	
	public Cerc (double r, String c){
		raza = r;
		culoare = c;
	}
	
	public double getRaza(){
		return raza;
	}
	
	public String getCuloare(){
		return culoare;
	}
	
	public double getAria(){
		return raza * raza * Math.PI;
	}
	
}
