package ProiectCTS;

import java.util.ArrayList;

public class Broker {
	private ArrayList<Comanda> listaComenzi = new ArrayList<Comanda>();
	
	public void preiaComanda(Comanda comanda){
		listaComenzi.add(comanda);
		
	}
	public void plaseazaComanda(){
		for(Comanda comanda:listaComenzi){
			comanda.executa();
		}
		listaComenzi.clear();	
	}

}
