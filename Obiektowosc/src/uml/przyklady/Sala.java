package uml.przyklady;

public class Sala {
	private String nazwa;
	private int numer;
	private Szkola szkola;

	public Sala(String nazwa, int numer, Szkola szkola) {
		if (szkola == null) {
			throw new IllegalArgumentException("Szkola jest nullem");
		}

		this.nazwa = nazwa;
		this.numer = numer;
		this.szkola = szkola;

		szkola.getSale().add(this);

	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public Szkola getSzkola() {
		return szkola;
	}

	public void setSzkola(Szkola szkola) {
		this.szkola = szkola;
	}

}
