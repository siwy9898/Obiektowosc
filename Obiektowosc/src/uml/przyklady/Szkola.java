package uml.przyklady;

import java.util.ArrayList;
import java.util.List;

public class Szkola {

	private String nazwa;
	private final int rokWybudowania;
	private String wyroznienie;
	private int numer;
	private static int minimalnaLiczbaUczniow = 150;

	private List<String> profile = new ArrayList<>();
	private static List<Szkola> ekstensja = new ArrayList<>();
	private List <Sala> sale = new ArrayList<>();

	// dla licznosci * (asocjacja)
	private List<Uczen> uczniowie = new ArrayList<>();

	public Szkola(String nazwa, int rokWybudowania, int numer) {
		this.nazwa = nazwa;
		this.rokWybudowania = rokWybudowania;
		setNumer(numer);

		ekstensja.add(this);
	}

	public Szkola(String nazwa, int rokWybudowania, int numer, String wyroznienie) {
		this.nazwa = nazwa;
		this.rokWybudowania = rokWybudowania;
		this.wyroznienie = wyroznienie;
		setNumer(numer);

		ekstensja.add(this);
	}

	// szkola X
	// uczen y
	
	// szkolax.dodaj(uczen y)
	public void dodajUcznia(Uczen uczen) {
		//sprawdzeni eczy uczen nie jest juz w jakiejs szkole
		if(uczen.getSzkola() != null) {
			throw new IllegalArgumentException("Uczen ma juz szkole");
		}
		uczniowie.add(uczen);
		// BARDZO WAZNE
		// informacja zwrotna
		uczen.setSzkola(this);
	}

	public void usunUcznia(Uczen uczen) {
		uczniowie.remove(uczen);
	}

	public void dodajProfil(String profil) {
		profile.add(profil);
	}

	public void usunProfil(String profil) {
		profile.remove(profil);
	}

	public int getNumer() {
		return numer;
	}

	public void setNumer(int numer) {

		for (Szkola s : ekstensja) {
			if (s.getNumer() == numer) {
				throw new IllegalArgumentException("Szkola o takim numerze istnieje");
			}

		}
		this.numer = numer;
	}

	public static List<Szkola> getEkstensja() {
		return ekstensja;
	}

	public String getWyroznienie() {
		return wyroznienie;
	}

	public void setWyroznienie(String wyroznienie) {
		this.wyroznienie = wyroznienie;
	}

	public List<String> getProfile() {
		return profile;
	}

	public void setProfile(List<String> profile) {
		this.profile = profile;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getRokWybudowania() {
		return rokWybudowania;
	}

	public String toString() {
		return nazwa;
	}

	public static int getMinimalnaLiczbaUczniow() {
		return minimalnaLiczbaUczniow;
	}

	public static void setMinimalnaLiczbaUczniow(int minimalnaLiczbaUczniow) {
		Szkola.minimalnaLiczbaUczniow = minimalnaLiczbaUczniow;
	}

	public List<Uczen> getUczniowie() {
		return uczniowie;
	}

	public List<Sala> getSale() {
		return sale;
	}

	public void setSale(List<Sala> sale) {
		this.sale = sale;
	}

	public static void setEkstensja(List<Szkola> ekstensja) {
		Szkola.ekstensja = ekstensja;
	}

	public void setUczniowie(List<Uczen> uczniowie) {
		this.uczniowie = uczniowie;
	}

}
