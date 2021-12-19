package uml.przyklady;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Szkola sz1 = new Szkola("Liceum nr 1", 1990, 5);

		sz1.dodajProfil("Human");
		sz1.dodajProfil("Mat-Fiz");
		sz1.dodajProfil("Geo");
		sz1.usunProfil("Human");

		Szkola sz2 = new Szkola("LO2", 1980, 15, "szkola z klasa");

		System.out.println(Szkola.getMinimalnaLiczbaUczniow());

		Szkola.setMinimalnaLiczbaUczniow(200);

		System.out.println(Szkola.getMinimalnaLiczbaUczniow());

		Uczen u1 = new Uczen("Jan", "Kowalski", "M", 2000, "", 1, 00032432121);
		Uczen u2 = new Uczen("Adam", "Rechnio", "M", 2001, "", 2, 01032432121);
		Uczen u3 = new Uczen("Adam2", "Rechnio2", "M", 2001, "", 2, 01032432121);

		System.out.println(u1.getImie());
		System.out.println(u2.getPesel()); // jak przechowywac pesel, ktory moze zaczynac sie na "0"?
		
		u1.getImie();
		u1.obliczDochod();
		
		sz1.dodajUcznia(u1);
		sz1.dodajUcznia(u2);
		sz1.dodajUcznia(u3);
		
		System.out.println(sz1.getUczniowie());
		System.out.println(u1.getSzkola());
		
	//	sz2.dodajUcznia(u1);
		
		//swoj przyklad asocjacji z atrybutem
		
		
		/*
		 * Klient kupuje produkty. Klient ma imie nazwisko i rozmiar penisa. Pordukt ma nazwe, cene i jesli jest to kondom to wymiar.
		 *  Klient moze miec wiele produktow, produkt moze miec jednego klienta.
		 *   
		 *  1) Napisz mrtode ktota znajduje klienta ktory wydal najwiecej.
		 *  
		 *   2) napisz metode ktora zwroci liste klientow ktorzy kupili durexa 
		 *   
		 *   3) napisz metode ktora zwroci liste klientow ktorzy kupili durexy ale nie na swoj rozmiar :D 
		 *   
		 *   4) znajdz najdrozszy produkt
		 */

		/*
		 * Stwórz klasê Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko, ulubiony produkt). Klient kupuje produkty (nazwa, cena).
			Pracownik uzywa samochod (model, marka)
			
			1) Znajdz klienta który wydal najwiecej
			
			2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony produkt to ma byc atrybut wyliczalny na podstawie zakupow)
			
			3) Wyswietl 3 top pracownikow z najwieksza pensja (compartor + sortowanie) DODATKOWE
			
			4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta
		 */
	}

}
