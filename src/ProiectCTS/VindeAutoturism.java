package ProiectCTS;

public class VindeAutoturism implements Comanda{
	
	private Autoturisme auto;
	
	public VindeAutoturism(Autoturisme auto){
		this.auto = auto;
	}

	@Override
	public void executa() {
		auto.vinde();		
	}

}
