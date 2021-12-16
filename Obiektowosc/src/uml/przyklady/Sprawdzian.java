package uml.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Sprawdzian {
	private String przedmiot;
	private List <Ocena> oceny = new ArrayList<>();

	public Sprawdzian(String przedmiot) {
		super();
		this.przedmiot = przedmiot;
	}

	public String getPrzedmiot() {
		return przedmiot;
	}

	public void setPrzedmiot(String przedmiot) {
		this.przedmiot = przedmiot;
	}

	public List<Ocena> getOceny() {
		return oceny;
	}
	
	
	
}
