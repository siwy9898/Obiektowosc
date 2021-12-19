package uml.asocjacja.z.atrybutem;

import java.time.LocalDate;

public class Zatrudnienie {

	private LocalDate poczatekPracy;
	private LocalDate koniecPracy;
	private int pensja;
	private final Pracownik pracownik;
	private final Firma firma;

	public Zatrudnienie (LocalDate poczatekPracy, LocalDate koniecPracy, int pensja, Pracownik pracownik, Firma firma) {

		if (pracownik == null || firma == null) {
			throw new IllegalArgumentException("Pracownik ani firma nie moga byc nullami");
		}
		
		this.poczatekPracy = poczatekPracy;
		this.koniecPracy = koniecPracy;
		this.pensja = pensja;
		this.pracownik = pracownik;
		this.firma = firma;
		
		pracownik.getZatrudnienie().add(this);
		firma.getZatrudnienie().add(this);
		
	}

	public LocalDate getPoczatekPracy() {
		return poczatekPracy;
	}

	public void setPoczatekPracy(LocalDate poczatekPracy) {
		this.poczatekPracy = poczatekPracy;
	}

	public LocalDate getKoniecPracy() {
		return koniecPracy;
	}

	public void setKoniecPracy(LocalDate koniecPracy) {
		this.koniecPracy = koniecPracy;
	}

	public int getPensja() {
		return pensja;
	}

	public void setPensja(int pensja) {
		this.pensja = pensja;
	}

}
