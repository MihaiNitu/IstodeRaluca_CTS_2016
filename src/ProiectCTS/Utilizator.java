package ProiectCTS;

public interface Utilizator {
public void afisareUtilizator();
public SingletonCerere getCerere();
public void setNume(String string);
public void setPrenume(String string);
public void setCnp(String string);
public void setSalariu(float parseFloat);
public String getNume();
public String getPrenume();
public String getCnp();
public float getSalariu();
public void creareUtilizator(String nume,String prenume,String cnp,float salariu);
public void creareUtilizatorNull();
}
