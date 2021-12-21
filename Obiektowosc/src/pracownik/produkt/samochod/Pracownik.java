package pracownik.produkt.samochod;

public class Pracownik extends Osoba {

	String adres;
	double pensja;

	public Pracownik(String imie, String nazwisko, String adres, double pensja) {
		super(imie, nazwisko);
		this.adres = adres;
		this.pensja = pensja;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public double getPensja() {
		return pensja;
	}

	public void setPensja(double pensja) {
		this.pensja = pensja;
	}

}
