package pracownik.produkt.samochod;

public abstract class Osoba {
	private String imie;
	private String nazwisko;

	public Osoba(String imie, String nazwisko) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
	}

	public void kupProdukt(Produkt produkt) {

	}

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

	public String toString() {
		return imie + " " + nazwisko;

	}

}
