package ProiectCTS;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		/////FACTORY///////
		
		UtilizatorFactory factory1 = new UtilizatorFactory();
		Utilizator client = factory1.getUtilizator("Client");
		client.creareUtilizator("Andrei", "andrei", "445586682584", 4000);
		client.afisareUtilizator();
		Utilizator manager = factory1.getUtilizator("Manager");
		manager.creareUtilizatorNull();
		manager.afisareUtilizator();
		Utilizator reprezentant = factory1.getUtilizator("Reprezentant");
		reprezentant.creareUtilizatorNull();
		reprezentant.afisareUtilizator();  
		
		
		  //////////SINGLETON//////////
		SingletonCerere cerere = SingletonCerere.getCerere();
		cerere.setId(2);
		cerere.setAvans(60);
		cerere.showMessage();
		
		
		/////////COMMAND/////////
		Autoturisme auto1 = new Autoturisme();
		auto1.setMarca("DACIA");
		auto1.setCantitate(5);
		Autoturisme auto2 = new Autoturisme();
		auto2.setMarca("ROVER");
		auto2.setCantitate(7);
		CumparaAutoturism comandaCumparaAuto = new CumparaAutoturism(auto1);
		VindeAutoturism comandaVindeAuto = new VindeAutoturism(auto2);
		Broker broker = new Broker();
		broker.preiaComanda(comandaCumparaAuto);
		broker.preiaComanda(comandaVindeAuto);
		broker.plaseazaComanda();
		
		
		  //////////CITIRE FISIER////////
		 /////Client/////
		ArrayList<Utilizator> listaClienti = new ArrayList<Utilizator>();
		Utilizator u;
		File f = new File("utilizator.txt");
		try {
			Scanner scanner;
			scanner = new Scanner(f);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				String[] array = line.split(" ");
				UtilizatorFactory factory= new UtilizatorFactory();
				u = factory.getUtilizator("Client");
				u.creareUtilizator(array[0], array[1], array[2], Float.parseFloat(array[3]));
				listaClienti.add(u);
			}
			scanner.close();
			
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<listaClienti.size(); i++)
		{
			System.out.println("Client " +i+ " :"+listaClienti.get(i).getNume()+" "+listaClienti.get(i).getPrenume());
		}
		
		///////Manageri/////
		
		ArrayList<Utilizator> listaManageri = new ArrayList<Utilizator>();
		Utilizator m;
		File f2 = new File("manageri.txt");
		try {
			Scanner scanner;
			scanner = new Scanner(f2);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				String[] array = line.split(" ");
				UtilizatorFactory factory= new UtilizatorFactory();
				m = factory.getUtilizator("Manager");
				m.creareUtilizator(array[0], array[1], array[2], Float.parseFloat(array[3]));
				listaManageri.add(m);
			}
			scanner.close();
			
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<listaManageri.size(); i++)
		{
			System.out.println("Manager " +i+ " :"+listaManageri.get(i).getNume()+" "+listaManageri.get(i).getPrenume());
		}
		
		
		//////Reprezentanti/////
		ArrayList<Utilizator> listaReprezentanti= new ArrayList<Utilizator>();
		Utilizator r;
		File f3 = new File("reprezentanti.txt");
		try {
			Scanner scanner;
			scanner = new Scanner(f3);
			while(scanner.hasNext()){
				String line = scanner.nextLine();
				String[] array = line.split(" ");
				UtilizatorFactory factory= new UtilizatorFactory();
				r = factory.getUtilizator("Reprezentant");
				r.creareUtilizator(array[0], array[1], array[2], Float.parseFloat(array[3]));
				listaReprezentanti.add(r);
			}
			scanner.close();
			
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0; i<listaReprezentanti.size(); i++)
		{
			System.out.println("Reprezentant " +i+ " :"+listaReprezentanti.get(i).getNume()+" "+listaReprezentanti.get(i).getPrenume());
		}
		
	}
	
	
}
