package obiektowosc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Samochod {

	// pole klasy
	private final String marka;
	private final String model;
	private String kolor;
	private final int rokProdukcji;
	private int przebieg;
	private double cena;

	private static List<Samochod> ekstensja = new ArrayList<>();

	// alt shift + s - generowanie

	// Samochod("Opel", "Corsa", "bialy", 1990, 199000, 6700.98);
	// konstruktor wymusza odpowiednia budowe obiektu
	public Samochod(String marka, String model, String kolor, int rokProdukcji, int przebieg, double cena) {

		// this wskazuje nam na poloe klasy
		this.marka = marka;
		this.model = model;
		this.kolor = kolor;
		this.rokProdukcji = rokProdukcji;
		this.przebieg = przebieg;
		this.cena = cena;

		// w miejsce this wchodzi obiekt na ktorym wywolujemy konstruktor
		ekstensja.add(this);
	}

	// metoda obiektowa (niestatyczna) - wywo³ujemy ja na obiekcie
	public int obliczWiek() {
		return LocalDate.now().getYear() - rokProdukcji;
	}

	// metoda klasowa (statyczna) dziala na ekstensji klasy, na calej klasie, nie
	// potrzeubjemy obiektu
	// nie dzia³amy na ekstensji w tego typu metodach
	public static Samochod znajdzNajstarszeAuto(List<Samochod> lista) {

		if (lista == null || lista.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze byc pusta");
		}
		Samochod najstarszy = lista.get(0);

		for (Samochod s : lista) {
			if (s.obliczWiek() > najstarszy.obliczWiek()) {
				najstarszy = s;
			}
		}
		return najstarszy;
	}

	// napisz metode ktora znajduje wszystkie auta marki bmw

	public static List<Samochod> samochodyZMarki(List<Samochod> lista, String marka) {

		if (lista == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem.");
		}

		List<Samochod> listaSamochodow = new ArrayList<>();

		for (Samochod s : lista) {
			if (s.getMarka().equals(marka)) {
				listaSamochodow.add(s);
			}
		}
		return listaSamochodow;

	}

	// napisz metode ktora znajduje auto o najnizszym przebiegu

	public static Samochod znajdzAutoONajniszymPrzebiegu(List<Samochod> lista) {

		if (lista == null || lista.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze byc nullem.");
		}

		Samochod najmniejZajechany = lista.get(0);

		for (Samochod s : lista) {
			if (s.getPrzebieg() < najmniejZajechany.getPrzebieg()) {
				najmniejZajechany = s;
			}

		}
		return najmniejZajechany;
	}

	// napisz metode ktora znajduje wszystkie auta o kolorze niebieskim starsze niz
	// 15 lat

	public static List<Samochod> znajdzAutoODanymKolorzeiWieku(List<Samochod> lista, String kolor, int wiek) {

		if (lista == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem.");
		}

		List<Samochod> listaSamochodow = new ArrayList<>();

		for (Samochod s : lista) {
			if (s.getKolor().equals(kolor) && s.obliczWiek() > wiek) {
				listaSamochodow.add(s);

			}
		}
		return listaSamochodow;

	}

	// napisz metode ktora znajduje najdrozsze auto ale z aut z przebiegiem
	// mniejszym nzi 30k

	public static List<Samochod> autaZPrzebiegiem(List<Samochod> lista, int przebieg) {

		if (lista == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem.");
		}

		List<Samochod> listaAutZPrzebiegiem = new ArrayList<>();

		for (Samochod s : lista) {
			if (s.przebieg < przebieg) {
				listaAutZPrzebiegiem.add(s);
			}
		}
		return listaAutZPrzebiegiem;

	}

	public static Samochod najdrozszyWsrodAutZPrzebiegiem(List<Samochod> lista, int przebieg) {

		List<Samochod> autaZPrzebiegiem = new ArrayList<>(autaZPrzebiegiem(lista, przebieg));

		if (autaZPrzebiegiem.isEmpty()) {
			throw new IllegalArgumentException("lista nie moze byc pusta.");
		}

		Samochod samochod = autaZPrzebiegiem.get(0);

		for (Samochod s : autaZPrzebiegiem) {
			if (s.getCena() > samochod.cena) {
				samochod = s;
			}
		}
		return samochod;
	}

	// znajdz najtansze auto marki bmw

	public static Samochod najtanszeZMarki(List<Samochod> lista, String marka) {

		if (lista == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem.");
		}

		List<Samochod> listaAutZMarki = new ArrayList<>();

		for (Samochod s : lista) {
			if (s.marka.equals(marka)) {
				listaAutZMarki.add(s);
			}

		}

		Samochod samochod = listaAutZMarki.get(0);

		for (Samochod s : listaAutZMarki) {
			if (s.cena < samochod.cena) {
				samochod = s;
			}

		}
		return samochod;

	}

	// znajdz najdrozsze auto ktorego marka ma dlugosc wieksza niz 4

	public static Samochod najdrozszeMarkiIlesLiterek(List<Samochod> lista, int dlugosc) {

		if (lista == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem.");
		}

		List<Samochod> listaAut = new ArrayList<>();

		for (Samochod s : lista) {
			if (s.marka.length() > dlugosc) {
				listaAut.add(s);
			}

		}

		Samochod samochod = listaAut.get(0);

		for (Samochod s : listaAut) {
			if (s.cena > samochod.cena) {
				samochod = s;
			}

		}
		return samochod;

	}

	public String getKolor() {
		return kolor;
	}

	public void setKolor(String kolor) {
		this.kolor = kolor;
	}

	public int getPrzebieg() {
		return przebieg;
	}

	public void setPrzebieg(int przebieg) {
		this.przebieg = przebieg;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public String getMarka() {
		return marka;
	}

	public String getModel() {
		return model;
	}

	public int getRokProdukcji() {
		return rokProdukcji;
	}

	public static List<Samochod> getEkstensja() {
		return ekstensja;
	}

	public String toString() {
		return marka + " " + model;
	}

}
