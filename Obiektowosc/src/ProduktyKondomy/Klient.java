package ProduktyKondomy;

import java.util.*;

public class Klient {

	private String imie;
	private String nazwisko;
	private int rozmiarPenisa;

	private static List<Klient> ekstensja = new ArrayList<>();
	private List<Produkt> listaProduktow = new ArrayList<>();

	public Klient(String imie, String nazwisko, int rozmiarPenisa) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.rozmiarPenisa = rozmiarPenisa;

		ekstensja.add(this);

	}

	public void kupProdukt(Produkt produkt) {
		if (produkt.getKlient() != null) {
			throw new IllegalArgumentException("Produkt nabyty");
		}
		listaProduktow.add(produkt);
		produkt.setKlient(this);

	}

//	 * Klient kupuje produkty. Klient ma imie nazwisko i rozmiar penisa. Pordukt ma
//	 * nazwe, cene i jesli jest to kondom to wymiar. Klient moze miec wiele
//	 * produktow, produkt moze miec jednego klienta.

	public int ileWydal() {
		int razem = 0;
		List<Produkt> produkty = listaProduktow;
		for (Produkt p : produkty) {
			razem += p.getCena();
		}
		return razem;
	}

//	 * 1) Napisz mrtode ktota znajduje klienta ktory wydal najwiecej.

	public static Klient ktoWydalNajwiecej(List<Klient> lista) {

		// obslugujemy nulle i lista pusta
		Klient najwiecej = lista.get(0);

		for (Klient k : lista) {
			if (k.ileWydal() > najwiecej.ileWydal()) {
				najwiecej = k;
			}

		}
		return najwiecej;

	}

	// 2) napisz metode ktora zwroci liste klientow ktorzy kupili durexa

	public boolean czyKupilKondoma() {

		for (Produkt p : listaProduktow) {
			if (p instanceof Kondom) {
				return true;
			}

		}
		return false;
	}

	// * 2) napisz metode ktora zwroci liste klientow ktorzy kupili durexa

	public static List<Klient> klienciZKondomem(List<Klient> lista) {

		if (lista.isEmpty() || lista == null) {
			throw new IllegalArgumentException("Lista jest pusta lub null");
		}

		List<Klient> listaNabywcow = new ArrayList<>();

		for (Klient k : lista) {
			if (k.czyKupilKondoma()) {
				listaNabywcow.add(k);
			}

		}
		return listaNabywcow;
	}

	// 3) napisz metode ktora zwroci liste klientow ktorzy kupili durexy ale nie na
	// swoj rozmiar :D

	public static List<Klient> zlyRozmiarGumy(List<Klient> lista) {

		List<Klient> kliencizGuma = new ArrayList<>(klienciZKondomem(lista)); // <- cos tu nie chce banglac, jak zrobilem taka kretynska powtorke to dziala, wytlumacz grzegorzu
		List<Klient> klienciZeZlaGuma = new ArrayList<>(kliencizGuma);	
		for (Klient k : kliencizGuma) {
			for (Produkt p : k.getListaProduktow()) {
				if (p instanceof Kondom) {
					if (((Kondom) p).getRozmiar() == k.getRozmiarPenisa()) {
						klienciZeZlaGuma.remove(k);		
					}
				}
			}

		}
		return klienciZeZlaGuma;
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

	public int getRozmiarPenisa() {
		return rozmiarPenisa;
	}

	public void setRozmiarPenisa(int rozmiarPenisa) {
		this.rozmiarPenisa = rozmiarPenisa;
	}

	public List<Produkt> getListaProduktow() {
		return listaProduktow;
	}

	public void setListaProduktow(List<Produkt> listaProduktow) {
		this.listaProduktow = listaProduktow;
	}

	public static List<Klient> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Klient> ekstensja) {
		Klient.ekstensja = ekstensja;
	}

	public String toString() {
		return imie + " " + nazwisko;
	}

}
/*
 * Stwórz klasê Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko,
 * ulubiony produkt). Klient kupuje produkty (nazwa, cena). Pracownik uzywa
 * samochod (model, marka)
 * 
 * 1) Znajdz klienta który wydal najwiecej
 * 
 * 2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony
 * produkt to ma byc atrybut wyliczalny na podstawie zakupow)
 * 
 * 3) Wyswietl 3 top pracownikow z najwieksza pensja (compartor + sortowanie)
 * DODATKOWE
 * 
 * 4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje
 * (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta
 */
