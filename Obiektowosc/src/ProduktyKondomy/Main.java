package ProduktyKondomy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Klient k1 = new Klient("Jan", "Siurek", 11);
		Klient k2 = new Klient("Tomasz", "B�k", 12);
		Klient k3 = new Klient("Adam", "Bok", 13);
		Klient k4 = new Klient("Jerzy", "Pies", 14);

		Produkt p1 = new Produkt("durex", 30);
		Produkt p2 = new Produkt("chleb", 5);
		Produkt p3 = new Produkt("rower", 20000);
		Produkt p4 = new Produkt("komputer", 3000);
		Produkt p5 = new Produkt("durex", 30);
		Produkt p6 = new Produkt("durex", 30);

		k1.kupProdukt(p1);
		k1.kupProdukt(p2);
		k2.kupProdukt(p4);
		k4.kupProdukt(p6);

		System.out.println(k4.czytoKupil(p5));
		System.out.println(Produkt.najdrozszy(Produkt.getEkstensja()));
		;
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
		 * 4) znajdz najdrozszy produkt
		 */

		/*
		 * Stw�rz klas� Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko,
		 * ulubiony produkt). Klient kupuje produkty (nazwa, cena). Pracownik uzywa
		 * samochod (model, marka)
		 * 
		 * 1) Znajdz klienta kt�ry wydal najwiecej
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
