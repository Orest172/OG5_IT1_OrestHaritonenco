package de.oszimt.starsim2099;

/**
 * Write a description of class Ladung here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ladung {

	// Attribute

	private String typ;
	private int masse;
	private double posX;
	private double posY;

	// Methoden

	public Ladung() {

	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setMasse(int m) {
		this.masse = m;
	}

	public int getMasse() {
		return this.masse;
	}

	public double getPosX() {
		return posX;
	}

	public void setPosX(double pX) {
		this.posX = pX;
	}

	public double getPosY() {
		return posY;
	}

	public void setPosY(double pY) {
		this.posY = pY;
	}

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] ladungShape = { { '/', 'X', '\\' }, { '|', 'X', '|' }, { '\\', 'X', '/' } };
		return ladungShape;
	}
}