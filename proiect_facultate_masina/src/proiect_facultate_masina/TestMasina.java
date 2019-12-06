package proiect_facultate_masina;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import proiect_facultate_masina.Masina;

public class TestMasina {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws  IOException, Exception{
		// TODO Auto-generated method stub
		ArrayList<Masina> masini = new ArrayList<>();
		Masina newMasina = new Masina("EI43", "Volkswagen", "GOLF 5", 2009, 45000,9000);
		masini.add(newMasina);
		masini.add(new Masina("SD432","Opel","Astra H",2006,200000,6000));
		
		new FileOutputStream("fisierMasini.txt", true).close();
		int optiuneMeniu = 0;
		
		System.out.println("Bine ati venit in magazinul nostru, va rugam alegeti una dintre optiuni - Apasati 0 pentru a reveni la meniu ");
		listaMeniu();
		do {
			System.out.println("Ce doriti sa faceti?");
			optiuneMeniu = sc.nextInt();
			while (optiuneMeniu<0 || optiuneMeniu>6) {
				System.out.println("Va rugam introduceti o optiune valida !");
				optiuneMeniu = sc.nextInt();
			}
			
			doOptiuneMeniu(optiuneMeniu, masini);
			
		}while(optiuneMeniu != 6);
	}

	public static void listaMeniu() {
		System.out.println("Ce doriti sa faceti? ");
        System.out.println("================================================================");
        System.out.println("1. Afisati lista cu masini intr-o ordine aleatoare.");
        System.out.println("2. Adaugati o masina noua.");
        System.out.println("3. Stergeti o masina");
        System.out.println("4. Cautati o masina (dupa numarul de identificare");
        System.out.println("5. Afisati masinile care se incadreaza intr-o categorie de pret.");
        System.out.println("6. Iesiti din program");
        System.out.println("================================================================");
	}
	
	public static void  doOptiuneMeniu(int Actiune, ArrayList<Masina> masini) throws Exception{
		String newMasina;
		String NI;
		String producator;
		String model;
		Masina masinaGasita = null;
		
		int nrMasina = 0;
		int an = 0;
		int kilometraj = 0;
		float pretMin = 0.00F;
		float pretMax = 0.00F;
		float pret = 0.00F;
		boolean optiuneValida = true;
		
		switch(Actiune) {
		 case 0:
             System.out.println("Meniu principal");
             listaMeniu();
             break;
         case 1:
             System.out.println("Lista masini");
             afiseazaMasini(masini);
//             break;
//         case 2:
//             System.out.println("Add new car to database.");
//             adaugaMasinaNoua(masini);
//             break;
//         case 3:
//             System.out.println("Delete a car from a database.");
//             stergeMasina(masini);
//             break;
//         case 4:
//             System.out.println("Search for a Car.");
//             cautaMasina(masini);
//             break;
//         case 5:
//             System.out.println("List of cars by given price range.");
//             sorteazaMasina(masini);
//             break;
//         case 6:
//             break;
         default:
             break;
		}
		
		
	}
	
	public static void afiseazaMasini(ArrayList<Masina> masini){
		String formatter = "| %-2d | %-6s | %-15s | %-15s | %-5d | %-8d | $%.2f   |%n";
        System.out.format("+----+--------+-----------------+-----------------+-------+----------+------------+%n");
        System.out.printf("| #  | NI     | PRODUCATOR      | Model           |  AN   |     KM   | Pret      |%n");
        System.out.format("+----+--------+-----------------+-----------------+-------+----------+------------+%n");
        int i = 0;
        //for - each loop https://www.w3schools.com/java/java_for_loop.asp (nu stiu exact cum functioneaza)
        for (Masina masina:masini) {
        	System.out.format(formatter,++i,masina.getNI(),masina.getFabricant(),masina.getModel(),masina.getAn(),masina.getKilometraj(),masina.getPret());
        }
	}
	
	
}
