package uml.przyklady;

import java.time.LocalDate;

public class Ocena {

	private final int wartosc;
	private final LocalDate data;
	private final Uczen uczen;
	private final Sprawdzian sprawdzian;

	public Ocena(int wartosc, LocalDate data, Uczen uczen, Sprawdzian sprawdzian) {

		if (uczen == null || sprawdzian == null) {
			throw new IllegalArgumentException("Uczen lub sprawdizan nie moga byc nullami");
		}

		this.wartosc = wartosc;
		this.data = data;
		this.uczen = uczen;
		this.sprawdzian = sprawdzian;

		// info zwrotne
		uczen.getOceny().add(this);
		sprawdzian.getOceny().add(this);
	}

	public int getWartosc() {
		return wartosc;
	}

	public LocalDate getData() {
		return data;
	}

}
