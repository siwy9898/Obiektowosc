package uml.asocjacja.z.atrybutem;

import java.util.ArrayList;
import java.util.List;

public class Firma {
	private String nazwa;
	private int rokZalozenia;
	private int nip;
	private String branza;
	
	private List <Pracownik> pracownicy = new ArrayList<>();
	private List <Zatrudnienie> zatrudnienie = new ArrayList<>();

	public Firma(String nazwa, int rokZalozenia, int nip, String branza) {
		super();
		this.nazwa = nazwa;
		this.rokZalozenia = rokZalozenia;
		this.nip = nip;
		this.branza = branza;
		
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public int getRokZalozenia() {
		return rokZalozenia;
	}

	public void setRokZalozenia(int rokZalozenia) {
		this.rokZalozenia = rokZalozenia;
	}

	public int getNip() {
		return nip;
	}

	public void setNip(int nip) {
		this.nip = nip;
	}

	public String getBranza() {
		return branza;
	}

	public void setBranza(String branza) {
		this.branza = branza;
	}

	public List<Pracownik> getPracownicy() {
		return pracownicy;
	}

	public void setPracownicy(List<Pracownik> pracownicy) {
		this.pracownicy = pracownicy;
	}

	public List<Zatrudnienie> getZatrudnienie() {
		return zatrudnienie;
	}
	
	
	
	

}
