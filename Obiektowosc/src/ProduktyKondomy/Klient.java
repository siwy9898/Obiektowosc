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
		Klient najwiecej = lista.get(0);

		for (Klient k : lista) {
			if (k.ileWydal() > najwiecej.ileWydal()) {
				najwiecej = k;
			}

		}
		return najwiecej;

	}

	// 2) napisz metode ktora zwroci liste klientow ktorzy kupili durexa

	public Boolean czytoKupil(String nazwaProduktu) {
		List<Produkt> lista = listaProduktow;

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getNazwa().equals(nazwaProduktu)) {
				return true;
			}

		}
		return false;
	}

	// * 2) napisz metode ktora zwroci liste klientow ktorzy kupili durexa

	public static List<Klient> klienciZProduktem(List<Klient> lista, String nazwaProduktu) {
		Klient posiadacz = lista.get(0);
		List<Klient> listaNabywcow = new ArrayList<>();

		for (Klient k : lista) {
			if (k.czytoKupil(nazwaProduktu)) {
				listaNabywcow.add(k);
			}

		}
		return listaNabywcow;
	}

// 3) napisz metode ktora zwroci liste klientow ktorzy kupili durexy ale nie na swoj rozmiar :D

	public static List<Klient> czyDobryRozmiarGumy(List<Klient> lista) {
		List<Klient> kliencizGuma = Klient.klienciZProduktem(lista, "durex");
		
		for (Klient k : kliencizGuma) {
	
			for (int i = 0 ; i<k.getListaProduktow().size(); i++) {
				if (k.getListaProduktow().get(i).getRozmiar)
			}
		}
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
