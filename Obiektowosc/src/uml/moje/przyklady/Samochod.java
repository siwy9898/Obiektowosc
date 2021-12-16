package uml.moje.przyklady;

import java.util.*;

public class Samochod {

	private String marka;
	private List<Kierowca> kierowcy = new ArrayList<>();
	private Parking parking;

	public Samochod(String marka) {
		super();
		this.marka = marka;
	}

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public List<Kierowca> getKierowcy() {
		return kierowcy;
	}

	public void dodajKierowce(Kierowca k) {
		kierowcy.add(k);
		k.getSamochody().add(this);
	}

	public Parking getParking() {
		return parking;
	}

	public void setParking(Parking parking) {
		this.parking = parking;
	}

}
