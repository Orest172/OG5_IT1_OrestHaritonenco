package oszKickers;

public class Mannschaftsleiter extends Spieler {

	// Attribute

	private String nameMannschaft;
	private double anzahlEngagement;

	public Mannschaftsleiter(String name, int telefonnr,double jahresBeitrag, int trikotnr, char position, String mannschaftsName) {
		super(name, telefonnr, jahresBeitrag, trikotnr, position);
		this.nameMannschaft = mannschaftsName;
	}

	public String getNameMannschaft() {
		return this.nameMannschaft;
	}

	public void setNameMannschaft(String nameMannschaft) {
		this.nameMannschaft = nameMannschaft;
	}

	public double getAnzahlEngagement() {
		return this.anzahlEngagement;
	}

	public void setAnzahlEngagement(double anzahlEngagement) {
		this.anzahlEngagement = anzahlEngagement;
	}
	
	public void rabattBekommen() {}
}
