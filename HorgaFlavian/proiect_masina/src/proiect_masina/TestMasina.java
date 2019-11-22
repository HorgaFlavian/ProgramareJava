package proiect_masina;
import java.util.ArrayList;


public class TestMasina {
	public static void main(String args[]){
		
		Masina m1 = new Masina();
//		if (m1.getDisponibilitate() == true){
//			System.out.println("Masina este disponibila");
//		}
//		else{
//			System.out.println("Masina nu este disponibila");
//		}
//		System.out.println("Producatorul este: " + m1.getProducator());
//		System.out.println("Modelul este: "+ m1.getModel());
//		System.out.println("Pretul este: "+ m1.getPret());
//		System.out.println("Culoarea: " + m1.getCuloare());
//		System.out.printf("Motor(modificatie): %.2f%n", m1.getCapacitate());
//		
//		
//		System.out.println();
//		System.out.println();
		
		
		Masina m2 = new Masina(4500,1.6,"Dacia","Sandero","Rosie",true);
//		if (m2.getDisponibilitate() == true){
//			System.out.println("Masina este disponibila");
//		}
//			else{
//				System.out.println("Masina nu este disponibila, va rugam reveniti");
//			}
//		
//		System.out.println("Producatorul este: " + m2.getProducator());
//		System.out.println("Modelul este: " + m2.getModel());
//		System.out.println("Pretul este: "+ m2.getPret());
//		System.out.println("Culoarea este: "+ m2.getCuloare());
//		System.out.println("Motorul(modificatia): "+m2.getCapacitate());
//		
//		
//		System.out.println();
//		System.out.println();
		
		
		Masina m3 = new Masina(2700,2,"BMW","316i","Gri",false);
//		if (m3.getDisponibilitate() == true){
//			System.out.println("Masina este disponibila");
//		}
//			else{
//				System.out.println("Masina nu este disponibila, va rugam reveniti");
//			}
//		System.out.println("Producatorul este: " + m3.getProducator());
//		System.out.println("Modelul este: " + m3.getModel());
//		System.out.println("Pretul este: "+ m3.getPret());
//		System.out.println("Culoarea este: "+ m3.getCuloare());
//		System.out.println("Motorul(modificatia): "+m3.getCapacitate());
//		
//		System.out.println();
//		System.out.println();
//		
	Masina m4 = new Masina(6500,2.0,"Skoda","OctaviaCombi","Gri",true);
	m4.setDisponibilitate(false);
		
//		if (m4.getDisponibilitate() == true){
//			System.out.println("Masina este disponibila");
//		}
//			else{
//				System.out.println("Masina nu este disponibila, va rugam reveniti");
//			}
//		System.out.println("Producatorul este: " + m4.getProducator());
//		System.out.println("Modelul este: " + m4.getModel());
//		System.out.println("Pretul este: "+ m4.getPret());
//		System.out.println("Culoarea este: "+ m4.getCuloare());
//		System.out.println("Motorul(modificatia): "+m4.getCapacitate());
//		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println(m2.toString());
	
	ArrayList<Masina> masini = new ArrayList<Masina>();
	masini.add(m1);
	masini.add(m2);
	masini.add(m3);
	masini.add(m4);
	
	for(int i = 0; i < masini.size(); i++){
		if (masini.get(i).getDisponibilitate() == true){
		System.out.println(masini.get(i).toString());
		}
		else{
			System.out.println(masini.get(i).getProducator() + " " + masini.get(i).getModel() + " nu este disponibila");
		}
	}
	
	
	
		
			
		
	}
		
}
