package pracownik.produkt.samochod;

public class Main {

	public static void main(String[] args) {

//		 * Stwórz klasê Pracownik (imie,nazwisko, adres, pensja i Klient (imie,nazwisko,
//		 * ulubiony produkt). Klient kupuje produkty (nazwa, cena). Pracownik uzywa
//		 * samochod (model, marka)
//		 * 
//		 * 1) Znajdz klienta który wydal najwiecej -> bylo w poprzednim zadaniu
//		 * 
//		 * 2) Wyswietl dla kazdego klienta jego ulubiony produkt (of cuz ulubiony
//		 * produkt to ma byc atrybut wyliczalny na podstawie zakupow)
//		 * 
//		 * 3) Wyswietl 3 top pracownikow z najwieksza pensja (compartor + sortowanie)
//		 * DODATKOWE
//		 * 
//		 * 4) Pracownicy auta moga uzywac wielkorotnie, chcemy przechowywac informacje
//		 * (i moc ja wyswietlic) ile jaki pracownik uzywal jakiego auta

		Produkt p1 = new Produkt("milka", 4);
		Produkt p2 = new Produkt("milka", 4);
		Produkt p3 = new Produkt("milka", 4);
		Produkt p4 = new Produkt("milka", 4);

		Klient k1 = new Klient("Jan", "Kowalski");
		Klient k2 = new Klient("Adam", "Wsad");
		Klient k3 = new Klient("Jan", "Ssak");
		
		k1.kupProdukt(p1);
		k1.kupProdukt(p1);
		
		System.out.println(k1.getProdukty());
		
	}

}
