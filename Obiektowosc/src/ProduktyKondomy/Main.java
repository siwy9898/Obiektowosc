package ProduktyKondomy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Klient k1 = new Klient("Jan", "Siurek", 11);
		Klient k2 = new Klient("Tomasz", "B¹k", 12);
		Klient k3 = new Klient("Adam", "Bok", 13);
		Klient k4 = new Klient("Jerzy", "Pies", 14);

		Produkt p1 = new Kondom("durex", 30, 11);
		Produkt p2 = new Kondom("chleb", 5, 10);
		Produkt p3 = new Kondom("rower", 20000, 10);
		Produkt p4 = new Kondom("komputer", 3000, 10);
		Produkt p5 = new Kondom("durex", 30, 11);
		Produkt p6 = new Kondom("durex", 30, 14);
		Produkt p7 = new Kondom("durex", 20, 11);

		k1.kupProdukt(p1);
		k1.kupProdukt(p2);
		k2.kupProdukt(p4);
		k4.kupProdukt(p6);
		k3.kupProdukt(p7);
		// System.out.println(k4.czytoKupil("durex"));
		System.out.println(Produkt.najdrozszy(Produkt.getEkstensja()));
		System.out.println(Klient.klienciZKondomem(Klient.getEkstensja()));
		System.out.println(Klient.zlyRozmiarGumy(Klient.getEkstensja()));
		
		// System.out.println(Klient.klienciZProduktem(Klient.getEkstensja(), "durex"));
		// System.out.println(p1.getKlient() + " " + p2.getKlient());
		System.out.println(k1.getListaProduktow());
		System.out.println(k2.getListaProduktow());
		// System.out.println(p1.getCena() + p2.getCena());
		System.out.println(k1.ileWydal());
		System.out.println(k2.getNazwisko() + " " + k2.ileWydal());
		System.out.println(Klient.ktoWydalNajwiecej(Klient.getEkstensja()));
		// System.out.println(Klient.getEkstensja());
		// System.out.println(Produkt.getEkstensja());

		/*
		 * Klient kupuje produkty. Klient ma imie nazwisko i rozmiar penisa. Pordukt ma
		 * nazwe, cene i jesli jest to kondom to wymiar. Klient moze miec wiele
		 * produktow, produkt moze miec jednego klienta.
		 * 
		 * 1) Napisz mrtode ktota znajduje klienta ktory wydal najwiecej.
		 * 
		 * 2) napisz metode ktora zwroci liste klientow ktorzy kupili durexa
		 * 
		 * 3) napisz metode ktora zwroci liste klientow ktorzy kupili durexy ale nie na
		 * swoj rozmiar :D
		 * 
		 * 
		 */

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

	}

}
