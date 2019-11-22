package lab5;

public class TestCerc {
	public static void main (String args[]){
		
		Cerc c1 = new Cerc(2.0,"albastru");
		System.out.println("Raza este: " + c1.getRaza());
		System.out.println("Culoarea este: " + c1.getCuloare());
		System.out.printf("Aria este: %.5f%n", c1.getAria());
		
		Cerc c2 = new Cerc(5.0);
		System.out.println("Raza este: " + c2.getRaza());
		System.out.println("Culoarea este: " + c2.getCuloare());
		System.out.printf("Aria este: %.5f%n", c2.getAria());
		
		
				
	}

}
