package ProduktyKondomy;

public abstract class GrupaProduktow {

	private String nazwa;
	private int cena;

	public GrupaProduktow(String nazwa, int cena) {
		super();
		this.nazwa = nazwa;
		this.cena = cena;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}
	
	public String toString() {
		return nazwa + " " + cena;
	}

}
