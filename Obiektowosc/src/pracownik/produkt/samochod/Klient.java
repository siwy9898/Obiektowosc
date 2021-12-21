package pracownik.produkt.samochod;

import java.util.ArrayList;
import java.util.List;

public class Klient extends Osoba {

	private List<Produkt> produkty = new ArrayList<>();

	public Klient(String imie, String nazwisko) {
		super(imie, nazwisko);

	}

	public void kupProdukt(Produkt produkt) {
		produkty.add(produkt);
	}

	public Produkt ulubionyProdukt(Klient klient) {

		for (Produkt p : klient.getProdukty()) {
				
		}
	}

	public List<Produkt> getProdukty() {
		return produkty;
	}

}
