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
		Samochod s3 = new Samochod("Fiat", "Stilo", "niebieski", 2002, 210000, 11000);
		Samochod s4 = new Samochod("Skoda", "Fabia", "zielony", 1984, 56000, 9000);

		System.out.println(Samochod.getEkstensja());

		Samochod s5 = new Samochod("Skoda", "Fabia", "zielony", 2006, 56000, 9000);
		System.out.println(Samochod.getEkstensja());

		//metoda obiektow3a, na obiekcie
		System.out.println(s1.obliczWiek());
		System.out.println(s3.obliczWiek());
		
		// metoda statyczna, klasowa
		System.out.println(Samochod.znajdzNajstarszeAuto(Samochod.getEkstensja()));
	}

}
