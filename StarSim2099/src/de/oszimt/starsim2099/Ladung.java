package de.oszimt.starsim2099;

import de.oszimt.starsim2099.Unterklasse.Typ;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung extends Typ{

	// Attribute

	private int masse;
	
	// Methoden

	public Ladung() {
		
	}
	
	public void setMasse(int m) {
		this.masse = m;
	}
	public int getMasse() {
		return this.masse;
	}
	
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}