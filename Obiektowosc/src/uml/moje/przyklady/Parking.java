package uml.moje.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Parking {

	private String nazwa;
	private String adres;
	private List<Samochod> samochody = new ArrayList<>();

	public Parking(String nazwa, String adres) {
		super();
		this.nazwa = nazwa;
		this.adres = adres;
	}

	public void dodajSamochod(Samochod s) {
		if (s.getParking() != null) {
			throw new IllegalArgumentException("Auto zaparkowane gdzieœ indziej");
		}
		samochody.add(s);
		s.setParking(this);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}
