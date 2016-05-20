package ProiectCTS;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

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
}
