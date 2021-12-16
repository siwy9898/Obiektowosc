package uml.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Szkolenie {
	
	private String nazwa;
	
	private List<Nauczyciel> nauczyciele = new ArrayList<>();

	public Szkolenie(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public void dodajNauczyciela(Nauczyciel n) {
		nauczyciele.add(n);
		//informacja zwrotna
		n.getSzkolenia().add(this);
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public List<Nauczyciel> getNauczyciele() {
		return nauczyciele;
	}

	
	

}
