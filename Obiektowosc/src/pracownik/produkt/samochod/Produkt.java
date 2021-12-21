package pracownik.produkt.samochod;

import java.util.ArrayList;
import java.util.List;

public class Produkt {
	private String nazwa;
	private double cena;
	private List<Klient> klienci = new ArrayList<>();

	public Produkt(String nazwa, double cena) {
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

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String toString() {
		return nazwa + " " + cena;
	}

	public List<Klient> getKlienci() {
		return klienci;
	}

	public void setKlienci(List<Klient> klienci) {
		this.klienci = klienci;
	}
}
