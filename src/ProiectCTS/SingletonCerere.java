package ProiectCTS;

public class SingletonCerere {
	private static SingletonCerere instance = new SingletonCerere();
	private int id;
	private float avans;
	private int perioada;
	private float valoareAuto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAvans() {
		return avans;
	}

	public void setAvans(float avans) {
		this.avans = avans;
	}

	public int getPerioada() {
		return perioada;
	}

	public void setPerioada(int perioada) {
		this.perioada = perioada;
	}

	public float getValoareAuto() {
		return valoareAuto;
	}

	public void setValoareAuto(float valoareAuto) {
		this.valoareAuto = valoareAuto;
	}
	
	private SingletonCerere(){}
	
	

	public static SingletonCerere getCerere()
	{
		return instance;
	}
	public void showMessage(){
		System.out.println("cerere: "+instance.getId()+" cu avans"+instance.getAvans());
	}
}
