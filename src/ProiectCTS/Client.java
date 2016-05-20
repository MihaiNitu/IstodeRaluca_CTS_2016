package ProiectCTS;

public class Client implements Utilizator{
	UtilizatorObj uObject;
	SingletonCerere object;
	public String getNume() {
		return uObject.getNume();
	}

	public void setNume(String nume) {
		if(nume!="")
		{	uObject.setNume(nume);}
		else
		{	System.out.println("Can't save a Prenume because it is empty");}	
		
	
	}

	public String getPrenume() {
		return uObject.getPrenume();
	}

	public void setPrenume(String prenume) {
		if(prenume!=""){
		uObject.setPrenume(prenume);}
		else
		{	System.out.println("Can't save a Prenume because it is empty");}
	}

	public String getCnp() {
		return uObject.getCnp();
	}

	public void setCnp(String cnp) {
		uObject.setCnp(cnp);
	}

	public float getSalariu() {
		return uObject.getSalariu();
	}

	public void setSalariu(float salariu) {
		uObject.setSalariu(salariu);
	}



	@Override
	public void afisareUtilizator() {
		System.out.println("Client : "+uObject.getNume() );
		
	}

	@Override
	public SingletonCerere getCerere() {
		// TODO Auto-generated method stub
		return object.getCerere();
	}

	@Override
	public void creareUtilizator(String nume, String prenume, String cnp,
			float salariu) {
	uObject = new UtilizatorObj(nume, prenume, cnp, salariu);
		
	}

	@Override
	public void creareUtilizatorNull() {
	uObject = new UtilizatorObj();
		
	}
	
	


}
