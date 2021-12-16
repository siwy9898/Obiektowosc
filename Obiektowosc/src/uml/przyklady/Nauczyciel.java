package uml.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Nauczyciel extends Osoba {

	private String przedmiot;
	
	private List<Szkolenie> szkolenia = new ArrayList<>();

	public Nauczyciel(String imie, String nazwisko, String plec, int rokUrodzenia, String przedmiot) {
		super(imie, nazwisko, plec, rokUrodzenia);
		this.przedmiot = przedmiot;
	}

	@Override
	public double obliczDochod() {
		return 3000;
	}

	public String getPrzedmiot() {
		return przedmiot;
	}

	public void setPrzedmiot(String przedmiot) {
		this.przedmiot = przedmiot;
	}

	public List<Szkolenie> getSzkolenia() {
		return szkolenia;
	}
	
	

}
