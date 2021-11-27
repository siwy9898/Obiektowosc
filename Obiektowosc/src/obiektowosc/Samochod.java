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
	
	public static List <Samochod> najstarszeZMarki (List <Samochod> lista, String marka){
		List <Samochod> listaSamochodow = new ArrayList<>();
		
		if (lista == null) {
			throw new IllegalArgumentException("lista nie moze byc nullem.");
		}
		
		for (Samochod s : lista) {
			if (s.marka.equals(marka)) {
				listaSamochodow.add(s);
			}
		}return listaSamochodow;
	}
	
	// napisz metode ktora znajduje auto o najnizszym przebiegu
	
	// napisz metode ktora znajduje wszystkie auta o kolorze niebieskim starsze niz 15 lat
	
	// napisz metode ktora znajduje najdrozsze auto ale z aut z przebiegiem mniejszym nzi 30k
	
	// znajdz najtansze auto marki bmw
	
	// znajdz najdrozsze auto ktorego marka ma dlugosc wieksza niz 4
	

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
