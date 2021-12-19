package uml.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Klasa {
	private String nazwa;
	
	private List <Uczen> uczniowie = new ArrayList<>();

	public Klasa(String nazwa) {
		super();
		this.nazwa = nazwa;
	}
	
	public void dodajUcznia (Uczen u) {
		
		if (u.getKlasa() != null) {
			throw new IllegalArgumentException("Uczen ma juz klase");
		}
		uczniowie.add(u);
		u.setKlasa(this);
	}
	

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	
}
