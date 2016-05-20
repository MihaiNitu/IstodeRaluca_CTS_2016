package ProiectCTS.Factory;

import ProiectCTS.Singleton.SingletonCerere;

public class Manager implements Utilizator {
	UtilizatorObj uObject ;
	
	public String getNume() {
		return uObject.getNume();
	}

	public void setNume(String nume) {
		uObject.setNume(nume);
	}

	public String getPrenume() {
		return uObject.getPrenume();
	}

	public void setPrenume(String prenume) {
		uObject.setPrenume(prenume);
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
	
	public float calculateBonus(float salariu) {
		if (salariu < 0) 
			return 0;
		if (salariu > 10000)
			return 0;
		return (salariu * 15)/10;
	}

	@Override
	public void creareUtilizator(String nume, String prenume, String cnp,
			float salariu) {
		uObject = new UtilizatorObj(nume, prenume, cnp, salariu);
		
	}

	@Override
	public void afisareUtilizator() {
		// TODO Auto-generated method stub
		System.out.println("Manager : "+uObject.getNume() );
	}

	@Override
	public SingletonCerere getCerere() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creareUtilizatorNull() {
		// TODO Auto-generated method stub
		uObject = new UtilizatorObj();
	}
	

}
