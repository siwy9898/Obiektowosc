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

		Uczen u1 = new Uczen("Jan", "Kowalski", "M", 2000, 00032432121);
		Uczen u2 = new Uczen("Adam", "Rechnio", "M", 2001, 01032432121);

		System.out.println(u1.getImie());
		System.out.println(u2.getPesel()); // jak przechowywac pesel, ktory moze zaczynac sie na "0"?

	}

}
