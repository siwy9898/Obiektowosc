package uml.asocjacja.z.atrybutem;


import java.util.ArrayList;
import java.util.List;

public class Pracownik {
	private String imie;
	private String nazwisko;
	private String plec;
	private int rokUrodzenia;
	private Firma firma;

	private static List<Pracownik> ekstensja = new ArrayList<>();
	private List <Zatrudnienie> zatrudnienie = new ArrayList<>();

	public Pracownik(String imie, String nazwisko, String plec, int rokUrodzenia, Firma firma) {
		super();
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.plec = plec;
		this.rokUrodzenia = rokUrodzenia;
		this.firma = firma;
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

	public String getPlec() {
		return plec;
	}

	public void setPlec(String plec) {
		this.plec = plec;
	}

	public int getRokUrodzenia() {
		return rokUrodzenia;
	}

	public void setRokUrodzenia(int rokUrodzenia) {
		this.rokUrodzenia = rokUrodzenia;
	}

	public Firma getFirma() {
		return firma;
	}

	public void setFirma(Firma firma) {
		this.firma = firma;
	}

	public static List<Pracownik> getEkstensja() {
		return ekstensja;
	}

	public static void setEkstensja(List<Pracownik> ekstensja) {
		Pracownik.ekstensja = ekstensja;
	}

	public List<Zatrudnienie> getZatrudnienie() {
		return zatrudnienie;
	}

	
}