package uml.przyklady;

public abstract class Osoba {
	private String imie;
	private String nazwisko;
	private String plec;
	private int rokUrodzenia;

	public Osoba(String imie, String nazwisko, String plec, int rokUrodzenia) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.plec = plec;
		this.rokUrodzenia = rokUrodzenia;
	}

	// metoda abstrakcyjan nie ma cia³a
	public abstract double obliczDochod();

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	public int getRokUrodzenia() {
		return rokUrodzenia;
	}

	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}

	public String toString() {
		return imie + " " + nazwisko;
	}

}
