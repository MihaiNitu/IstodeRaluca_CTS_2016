package ProiectCTS;

public class Autoturisme {
	
	private String marca;
	private int cantitate;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantitate() {
		return cantitate;
	}

	public void setCantitate(int cantitate) {
		this.cantitate = cantitate;
	}

	public void cumpara(){
		System.out.println("autoturism/e [Marca : "+marca+" Cantitate: "+cantitate+" ] cumparat/e" );
	}
	
	public void vinde(){
		System.out.println("autoturism/e [Marca : "+marca+" Cantitate: "+cantitate+" ] vandut/e");
	}
}
