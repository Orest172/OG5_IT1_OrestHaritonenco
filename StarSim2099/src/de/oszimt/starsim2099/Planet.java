package de.oszimt.starsim2099;

import de.oszimt.starsim2099.Unterklasse.Name;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet extends Name{

	// Attribute
	
	private int anzahlHafen;
	
	// Methoden

	public Planet() {
		
	}
	
	public void setAnzahlHafen(int a) {
		this.anzahlHafen = a;
	}
	public int getAnzahlHafen() {
		return this.anzahlHafen;
	}
	
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
