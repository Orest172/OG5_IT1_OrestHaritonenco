package oszKickers;

public class Spieler extends Mitglied{
	
	// Attribute
	
	private int trikotnummer;
	private char spielPosition;
	
	// Konstruktor
	
	public Spieler(String name, int telefonnr, int trikotnr, char position) {
		super(name, telefonnr);
		this.trikotnummer = trikotnr;
		this.spielPosition = position;
	}

	// Verwaltungsmethoden
	
	public int getTrikotnummer() {
		return this.trikotnummer;
	}

	public void setTrikotnummer(int trikotnummer) {
		this.trikotnummer = trikotnummer;
	}

	public char getSpielPosition() {
		return this.spielPosition;
	}

	public void setSpielPosition(char spielPosition) {
		this.spielPosition = spielPosition;
	}
}
