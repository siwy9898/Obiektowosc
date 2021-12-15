package uml.przyklady;

import java.util.*;

public class Uczen {

	private String imie;
	private String nazwisko;
	private String plec;
	private int rokUrodzenia;
	private String oddzial;
	private int numerWDzienniku;
	private long pesel;

	private static List<Uczen> ekstensja = new ArrayList<>();

	public Uczen(String imie, String nazwisko, String plec, int rokUrodzenia, String oddzial, int numerWDzienniku,
			long pesel) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.plec = plec;
		this.rokUrodzenia = rokUrodzenia;
		this.oddzial = oddzial;
		this.numerWDzienniku = numerWDzienniku;
		this.pesel = pesel;
		sprawdzPesel(pesel);
		ekstensja.add(this);

	}

	public Uczen(String imie, String nazwisko, String plec, int rokUrodzenia, long pesel) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.plec = plec;
		this.rokUrodzenia = rokUrodzenia;
		this.pesel = pesel;
		sprawdzPesel(pesel);
		ekstensja.add(this);

	}

	public void sprawdzPesel(long pesel) {

		for (Uczen s : ekstensja) {
			if (s.getPesel() == pesel) {
				throw new IllegalArgumentException("Uczen o takim peselu istnieje");
			}

		}
		this.pesel = pesel;
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

	public int getRokUrodzenia() {
		return rokUrodzenia;
	}

	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}

	public String getOddzial() {
		return oddzial;
	}

	public void setOddzial(String oddzial) {
		this.oddzial = oddzial;
	}

	public int getNumerWDzienniku() {
		return numerWDzienniku;
	}

	public void setNumerWDzienniku(int numerWDzienniku) {
		this.numerWDzienniku = numerWDzienniku;
	}

	public static List<Uczen> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Uczen> ekstensja) {
		Uczen.ekstensja = ekstensja;
	}

	public long getPesel() {
		return pesel;
	}

	public void setPesel(long pesel) {
		this.pesel = pesel;
	}

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

}
