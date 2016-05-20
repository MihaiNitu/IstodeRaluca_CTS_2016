package ProiectCTS.Testee;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import ProiectCTS.Factory.Utilizator;
import ProiectCTS.Factory.UtilizatorFactory;
import ProiectCTS.Factory.UtilizatorObj;
import ProiectCTS.Singleton.SingletonCerere;

public class Teste {

	public boolean fileEmpty(File f){

		boolean empty = true;
		if(f==null)
			return empty=false;
		
		try {
			Scanner scanner;
			scanner = new Scanner(f);
			if(scanner.hasNext())
				empty=false;
			
			}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empty;
	}
	
	public boolean TestSingletton(SingletonCerere sc1, SingletonCerere sc2) {
		if (sc1 == null || sc2 == null) 
			return false;
		if (sc1.getCerere() == sc2.getCerere()) {
			return true;
		}
		return false;
	}
	
	
	public boolean avansMare(float avans)
	{
		
		boolean a = false;
		if(avans>50 && avans<100)
		{
			return true;
		}
		else if(avans<=0)
		{
			return false;
		}
		return a;
	}
	
	public boolean testSalariu(float sal)
	{	boolean v = false;
		if (sal==0)
			return v;
		else if ((sal>100) && (sal<1000))
			return true;
		else if(sal<0)
			return v;
		return v;
		
		
	}
	
	public String testCnp(String cnp)
	{
		String i="Incorect";
		
		if(cnp.length()==13 && (cnp.contains("[a-zA-Z]+")== false))
		{
			return cnp;
		}
		else if (cnp.length()==0)
		{
			return i;
		}
		
		else if((int)cnp.charAt(0)!=0)
		{
			return i;
		}
		else if(cnp.contains(" ")==true)
		{
			return i;
		}
		return i;
	}
	
	public int CitireFisier(File f) {
		  
		ArrayList<Utilizator> listaClienti = new ArrayList<Utilizator>();
		Utilizator u;		
		if ( f==null || !f.exists())
			return -1;
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
		return listaClienti.size();
	}
	
	public String testNume(String nume)
	{
		if(nume.length()>2 && (nume.matches("[a-zA-Z]+")== true)&& (nume.contains(" ")== false))
		{
			return nume;
		}
		else if (nume.length()<=2)
		{
			return "Incorect";
		}
		
		return "Incorect";
	}
	
	public boolean testObjInLista(ArrayList<UtilizatorObj> lista)
	{
		if(lista==null)
		{
			return false;
		}
		else if(lista.size()>0)
		{
			return true;
		}
		return false;
	}
	
	public boolean testCantitate(int cant)
	{
		boolean c = true;
		if(cant<0 || cant==0 || cant>999)
			return false;

		else 
			return c;
	}
	
}
