package oszKickers;

public abstract class Mitglied {
	
	
	// Attribute
	private String name;
	private int telefonnummer;
	private double jahresBeitrag;
	
	// Konstruktor
	
	public Mitglied(String name, int telefonnummer, double jahresBeitrag) {
		this.name = name;
		this.telefonnummer = telefonnummer;
	}
	
	// Verwaltungsmethoden
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTelefonnummer() {
		return this.telefonnummer;
	}

	public void setTelefonnummer(int telefonnummer) {
		this.telefonnummer = telefonnummer;
	}

	public double getJahresBeitrag() {
		return this.jahresBeitrag;
	}

	public void setJahresBeitrag(double jahresBeitragBezahlt) {
		this.jahresBeitrag = jahresBeitragBezahlt;
	}
	
	
}
