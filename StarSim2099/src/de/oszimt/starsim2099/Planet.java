package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	
	private String name;
	private int anzahlHafen;
	private double posX;
	private double posY;
	
	// Methoden

	public Planet() {
		
	}
	
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAnzahlHafen(int a) {
		this.anzahlHafen = a;
	}
	public int getAnzahlHafen() {
		return this.anzahlHafen;
	}
	
	public void setPosX(double pX) {
		this.posX = pX;
	}
	public double getPosX() {
		return this.posX;
	}
	
	public void setPosY(double pY) {
		this.posY = pY;
	}
	public double getPosY() {
		return this.posY;
	}
	
	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;

	}
}
