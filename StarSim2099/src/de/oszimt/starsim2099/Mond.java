package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mond extends Himmelskoerper {

	// Attribute

	private String erzart;

	// Methoden

	public Mond() {

	}

	public void setErzart(String erz) {
		this.erzart = erz;
	}

	public String getErzart() {
		return this.erzart;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
