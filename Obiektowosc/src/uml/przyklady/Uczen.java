package uml.przyklady;

import java.util.*;

public class Uczen extends Osoba {

	private String oddzial;
	private int numerWDzienniku;
	private long pesel;

	private static List<Uczen> ekstensja = new ArrayList<>();
	private List<Ocena> oceny = new ArrayList<>();

	// dla licznosci asocjacji 1
	private Szkola szkola;

	public Uczen(String imie, String nazwisko, String plec, int rokUrodzenia, String oddzial, int numerWDzienniku,
			long pesel) {
		super(imie, nazwisko, plec, rokUrodzenia);
		this.oddzial = oddzial;
		this.numerWDzienniku = numerWDzienniku;
		this.pesel = pesel;
	}

	@Override
	public double obliczDochod() {
		return 350;
	}

	public void sprawdzPesel(long pesel) {

		for (Uczen s : ekstensja) {
			if (s.getPesel() == pesel) {
				throw new IllegalArgumentException("Uczen o takim peselu istnieje");
			}

		}
		this.pesel = pesel;
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

	public Szkola getSzkola() {
		return szkola;
	}

	public void setSzkola(Szkola szkola) {
		this.szkola = szkola;
	}

	public List<Ocena> getOceny() {
		return oceny;
	}

}
