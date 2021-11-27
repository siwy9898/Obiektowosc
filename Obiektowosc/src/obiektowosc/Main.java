package obiektowosc;

import java.util.ArrayList;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		/*
		 * Obiekt - wystapienie (instancja) klasy, konkretny byt, np ten konretny pies
		 * jamnij o imieniu reksio
		 * 
		 * Klasa - naturalny opis obiektu, zawiera zestaw cech (atrybutow) oraz funkcji
		 * (metod) np klasa Pies
		 * 
		 * Ekstensja klasy - zbior wszystkich obiektów danej klasy
		 * 
		 * 
		 */

		Samochod s1 = new Samochod("Opel", "Corsa", "bialy", 1990, 199000, 6700.98);

		System.out.println(s1.getKolor());
		s1.setKolor("czerwony");
		System.out.println(s1.getKolor());

		System.out.println(s1);

		Samochod s2 = new Samochod("Fiat", "Punto", "zolty", 1999, 200000, 10000);
		Samochod s3 = new Samochod("Fiat", "Stilo", "niebieski", 2002, 2100, 9900);
		Samochod s4 = new Samochod("Skoda", "Fabia", "zielony", 1984, 56000, 9000);
		Samochod s5 = new Samochod("BMW", "535", "czarny", 2020, 56000, 181000);

		System.out.println(Samochod.getEkstensja());

		Samochod s6 = new Samochod("Skoda", "Fabia", "zielony", 2006, 5600, 90000);
		System.out.println(Samochod.getEkstensja());

		// metoda obiektow3a, na obiekcie
		System.out.println(s1.obliczWiek());
		System.out.println(s3.obliczWiek());

		// metoda statyczna, klasowa
		System.out.println(Samochod.znajdzNajstarszeAuto(Samochod.getEkstensja()));
		System.out.println(Samochod.znajdzAutoONajniszymPrzebiegu(Samochod.getEkstensja()));
		System.out.println(Samochod.znajdzAutoODanymKolorzeiWieku(Samochod.getEkstensja(), "niebieski", 10));
		System.out.println(Samochod.najdrozszyWsrodAutZPrzebiegiem(Samochod.getEkstensja(), 10000));
		System.out.println(Samochod.najtanszeZMarki(Samochod.getEkstensja(), "Fiat"));
		System.out.println(Samochod.najdrozszeMarkiIlesLiterek(Samochod.getEkstensja(), 2));
	}

}
