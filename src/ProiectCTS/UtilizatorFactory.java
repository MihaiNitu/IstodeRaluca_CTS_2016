package ProiectCTS;

public class UtilizatorFactory {
	public Utilizator getUtilizator(String tipUtilizator){
		
		if (tipUtilizator== null){
			return null;}
		else if(tipUtilizator.equalsIgnoreCase("Client")){
			return new Client();}
		else if(tipUtilizator.equalsIgnoreCase("Manager")){
			return new Manager();}
		else if(tipUtilizator.equalsIgnoreCase("Reprezentant")){
			return new Reprezentant();}
		return null;
	}

}
