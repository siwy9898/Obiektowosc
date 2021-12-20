package ProduktyKondomy;

public class Kondom extends Produkt {
	private int rozmiar;

	public Kondom(String nazwa, int cena, int rozmiar) {
		super(nazwa, cena);
		this.rozmiar = rozmiar;
	}

}
