package ProiectCTS;

public class UtilizatorObj {
String nume;
String prenume;
String cnp;
float salariu;

public UtilizatorObj(String n,String p,String c,float s){
	this.nume=n;
	this.prenume=p;
	this.cnp=c;
	this.salariu=s;
	
}
public UtilizatorObj() {
	// TODO Auto-generated constructor stub
}
public String getNume() {
	return nume;
}
public void setNume(String nume) {
	this.nume = nume;
}
public String getPrenume() {
	return prenume;
}
public void setPrenume(String prenume) {
	this.prenume = prenume;
}
public String getCnp() {
	return cnp;
}
public void setCnp(String cnp) {
	this.cnp = cnp;
}
public float getSalariu() {
	return salariu;
}
public void setSalariu(float salariu) {
	this.salariu = salariu;
}
}
