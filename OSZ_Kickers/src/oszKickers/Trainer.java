package oszKickers;

public class Trainer extends Mitglied {

	// Attribute

	private char lizenzKlasse;
	private double monatlicheAufwandsEntschaedigung;

	// Konstruktor

	public Trainer(String name, int telefonnr, double jahresBeitrag, char lizenzKlasse,
			double monatlichAufwandEntschaedigung) {
		super(name, telefonnr, jahresBeitrag);
		this.lizenzKlasse = lizenzKlasse;
		this.monatlicheAufwandsEntschaedigung = monatlichAufwandEntschaedigung;
	}

	// Verwaltungsmethoden
	
	public char getLizenzKlasse() {
		return lizenzKlasse;
	}

	public void setLizenzKlasse(char lizenzKlasse) {
		this.lizenzKlasse = lizenzKlasse;
	}

	public double getMonatlicheAufwandsEntschaedigung() {
		return monatlicheAufwandsEntschaedigung;
	}

	public void setMonatlicheAufwandsEntschaedigung(double monatlicheAufwandsEntschaedigung) {
		this.monatlicheAufwandsEntschaedigung = monatlicheAufwandsEntschaedigung;
	}

}
