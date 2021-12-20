package ProduktyKondomy;

import java.util.ArrayList;
import java.util.List;

public class Produkt {
	private String nazwa;
	private int cena;
	private Klient klient;

	private static List<Produkt> ekstensja = new ArrayList<>();

	public Produkt(String nazwa, int cena) {
		this.nazwa = nazwa;
		this.cena = cena;

		ekstensja.add(this);
	}

	public Klient getKlient() {
		return klient;
	}

	public void setKlient(Klient klient) {
		this.klient = klient;
	}

	public static List<Produkt> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Produkt> ekstensja) {
		Produkt.ekstensja = ekstensja;
	}
	
	//4) znajdz najdrozszy produkt

	public static Produkt najdrozszy(List<Produkt> lista) {
		Produkt najdrozszy = lista.get(0);

		for (Produkt p : lista) {
			if (p.getCena() > najdrozszy.getCena()) {
				najdrozszy = p;
			}

		}
		return najdrozszy;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getCena() {
		return cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public String toString() {
		return nazwa + " " + cena;
	}

}
