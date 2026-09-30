package oszKickers;

public abstract class Mitglied {
	
	
	// Attribute
	private String name;
	private int telefonnummer;
	private boolean jahresBeitragBezahlt;
	
	// Konstruktor
	
	public Mitglied(String name, int telefonnummer) {
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

	public boolean isJahresBeitragBezahlt() {
		return this.jahresBeitragBezahlt;
	}

	public void setJahresBeitragBezahlt(boolean jahresBeitragBezahlt) {
		this.jahresBeitragBezahlt = jahresBeitragBezahlt;
	}
	
	
}
