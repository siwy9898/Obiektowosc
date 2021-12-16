package uml.moje.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Kierowca {

	private String imie;

	private List<Samochod> samochody = new ArrayList<>();

	public Kierowca(String imie) {
		super();
		this.imie = imie;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public List<Samochod> getSamochody() {
		return samochody;
	}
 

}
