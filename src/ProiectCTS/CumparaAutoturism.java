package ProiectCTS;

public class CumparaAutoturism implements Comanda {

	private Autoturisme auto;
	
	public CumparaAutoturism(Autoturisme auto){
		this.auto = auto;
	}

	@Override
	public void executa() {
		auto.cumpara();
		
	}
	
}
