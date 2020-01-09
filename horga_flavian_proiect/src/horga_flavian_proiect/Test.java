package horga_flavian_proiect;
import java.io.File;
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Test {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws Exception, IOException {
		int alegere = 0;
		
		 System.out.println("Bine ati venit, va rugam alegeti o optiune (un numar intreg de la 1 la 6)");
	        Meniu();
	        do {
	            
	            System.out.println("0 pentru meniul principal");
	           
	            alegere = scanner.nextInt();
	            while(alegere <0 || alegere >6)
	            {
	                System.out.println("Va rugam introduceti o optiune corecta");
	                alegere = scanner.nextInt();
	            }
	            optiuneMeniu(alegere);
	            
	            
	            
	        } while(alegere != 6);
	        
//	        
	        
//	        DE FACUT AGREGARE, COMPOZITIE;
	        
////Agregare 
//	        Scanner s = new Scanner(new File("listaMasini.txt"));
//			ArrayList<String> result = new ArrayList<>();
//	        try (s) {
//			    while (s.hasNext()) {
//			        result.add(s.nextLine());
//			    }
//			}
//			
//			Masina[] masini = new Masina[result.size()];
//			for(int i = 0; i < result.size(); i++) {
//			     masini[i] = new Masina(result.get(i));
//			}
//			
//			Cumparator c1 = new Cumparator ("Gigel", "Vasile", masini[1],masini[2]);
//			System.out.println("Cumparatorul " + c1.nume + c1.prenume + " a cumparat masinile: " +result.get(1).toString()+ " " + result.get(2).toString());
 //Asociere
//		Scanner s = new Scanner(new File("listaMasini.txt"));
//		ArrayList<String> result = new ArrayList<>();
//		 
//		try (s) {
//		    while (s.hasNext()) {
//		        result.add(s.nextLine());
//		    }
//		}
//		
//		Masina[] masini = new Masina[result.size()];
//		for(int i = 0; i < result.size(); i++) {
//		     masini[i] = new Masina(result.get(i));
//		}
//		
//		
//	        Cumparator c1 = new Cumparator ("Popescu", "Ionut","02346543","pionut@gmail.com");
//	        System.out.println("Cumparatorul " + c1.getNume2() +" " + c1.getPrenume() + " doreste masina " + masini[1].getFabricant()+ " " + masini[1].getModel() );
	
//Overriding
//	   Persoana persoana1 = new Cumparator("Ionut");
//	   persoana1.getNume();
//	   
//	   Persoana p2 = new Cumparator("Gigel");
		
	        
	}
	
public static void Meniu() {
        
         System.out.println("==================================");
         System.out.println("0. Meniu principal");
         System.out.println("1. Afiseaza masinile din stock");
         System.out.println("2. Afiseaza masinile proaspat adaugate");
         System.out.println("3. Adauga masina");
         System.out.println("4. Afiseaza lista cu angajati");
         System.out.println("5. Sorteaza masinile in ordine alfabetica");
         System.out.println("6. Iesire program");
         System.out.println("==================================");
        
}

public static void optiuneMeniu(int actiune) throws Exception {
    switch (actiune) {
        case 0:
            System.out.println("Meniu principal");
            Meniu();
            break;
        case 1:
            System.out.println("Lista masini in ordinea introdusa in fisier");
            afiseazaMasini();
            break;
        case 2:
            System.out.println("Lista masini proaspat adaugate");
            afiseazaMasiniAdaugate();
            break;
        case 3:
            System.out.println("Adauga masina");
            adaugaMasina();
            break;
        case 4:
            System.out.println("Afiseaza lista cu angajati");
            afiseazaAngajati();
            break;
        case 5:
            System.out.println("Sorteaza masinile in ordine alfabetica");
            SorteazaMasini();
        case 6:
        	
        	break;
        default:
            break;}
            
    }
	
public static void afiseazaMasini() throws FileNotFoundException {
		
		Scanner s = new Scanner(new File("listaMasini.txt"));
		ArrayList<String> result = new ArrayList<>();
		 
		try (s) {
		    while (s.hasNext()) {
		        result.add(s.nextLine());
		    }
		}
		
		Masina[] masini = new Masina[result.size()];
		for(int i = 0; i < result.size(); i++) {
		     masini[i] = new Masina(result.get(i));
		}
		System.out.println();
		System.out.println("Fabricant Model An Kilometraj Pret");
		System.out.println();
		for(int i = 0; i < result.size(); i++) {
		     System.out.println(result.get(i).toString());
		}
		
		}


public static void afiseazaMasiniAdaugate() throws FileNotFoundException {
	
	Scanner s = new Scanner(new File("listaMasiniAdaugate.txt"));
	ArrayList<String> result = new ArrayList<>();
	try(s) {
		while(s.hasNext()) {
			result.add(s.nextLine());
		}
		
	}
	Masina[] masini = new Masina[result.size()];
	for(int i = 0; i < result.size(); i++) {
		masini[i] = new Masina(result.get(i));
	}
	System.out.println();
	System.out.println("Fabricant Model An Kilometraj Pret");
	System.out.println();
	for(int i = 0; i < result.size(); i++) {
		System.out.println(result.get(i).toString());
	}
	
	
}


public static void adaugaMasina() throws IOException {
    String fabricant;
    String model;
    int an = 0;
    int kilometraj = 0;
    double pret = 0.0F;
	boolean optiune;
	
	System.out.println("Introduceti o masina dupa urmatorul exemplu:");
	System.out.println("Fabricant Model An Kilometraj Pret");
	System.out.println("Volkgwagen Golf 2007 34500 7500");
	
	do {
		optiune = true;
		fabricant = scanner.next();
		model = scanner.next();
		if(scanner.hasNextInt())
			an = scanner.nextInt();
		else optiune = false;
		if(scanner.hasNextInt())
			kilometraj = scanner.nextInt();
		else optiune = false;
		if(scanner.hasNextDouble())
			pret = scanner.nextDouble();
		else optiune = false;
		
		
		if(!optiune) {
			System.out.println("Date gresite/format gresit");
		}
		
		
	} while(optiune == false);
	FileWriter write = new FileWriter ("listaMasiniAdaugate.txt", true); // true - sa nu faca overwrite la fisier
	PrintWriter printWrite = new PrintWriter(write);
	printWrite.printf("%s %s %d %d %.0f", fabricant, model, an, kilometraj, pret);
	printWrite.println();
	printWrite.close();

}

 protected  static void afiseazaAngajati() throws FileNotFoundException{
	Scanner s = new Scanner(new File("listaAngajati.txt"));
	ArrayList<String> result = new ArrayList<>();
	 
	try (s) {
	    while (s.hasNext()) {
	        result.add(s.nextLine());
	    }
	}
	
	Angajat[] angajati = new Angajat[result.size()];
	for(int i = 0; i < result.size(); i++) {
	    angajati[i] = new Angajat(result.get(i));
	}
	
	for(int i = 0; i < result.size(); i++) {
	     System.out.println(result.get(i).toString());
	}
	
	
	
}
 
 public static void SorteazaMasini() throws FileNotFoundException {
	 Scanner s = new Scanner(new File("listaMasini.txt"));
		ArrayList<String> result = new ArrayList<>();
		 
		try (s) {
		    while (s.hasNext()) {
		        result.add(s.nextLine());
		    }
		}
		
		Collections.sort(result);
		System.out.println();
		System.out.println("Fabricant Model An Kilometraj Pret");
		System.out.println();
		for(int i = 0; i < result.size(); i++) {
		     System.out.println(result.get(i).toString());
		     
		}
	 
 }
	 
	
		
	
}





	

	

