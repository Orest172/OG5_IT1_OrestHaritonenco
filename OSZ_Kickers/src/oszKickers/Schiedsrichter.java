package oszKickers;

public class Schiedsrichter extends Mitglied{
	
	// Attribute
	
	private int anzahlGepfifeneSpiele;
	
	
	// Konstruktor
	
	public Schiedsrichter(String name, int telefonnr, double jahresBeitrag, int anzahlGepfifeneSpiele) {
		super(name, telefonnr, jahresBeitrag);
		this.anzahlGepfifeneSpiele = anzahlGepfifeneSpiele;
	}


	public int getAnzahlGepfifeneSpiele() {
		return this.anzahlGepfifeneSpiele;
	}


	public void setAnzahlGepfifeneSpiele(int anzahlGepfifeneSpiele) {
		this.anzahlGepfifeneSpiele = anzahlGepfifeneSpiele;
	}
	
	
}
