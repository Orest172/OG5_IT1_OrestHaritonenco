package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attribute

	private String typ;
	private String antrieb;
	private int winkel;
	private int maxKapazitaet;
	private double posX;
	private double posY;

	// Methoden

	public Raumschiff() {

	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setAntrieb(String a) {
		this.antrieb = a;
	}

	public String getAntrieb() {
		return this.antrieb;
	}

	public void setWinkel(int w) {
		this.winkel = w;
	}

	public int getWinkel() {
		return this.winkel;
	}

	public void setMaxLadekapazitaet(int mLk) {
		this.maxKapazitaet = mLk;
	}

	public int getMaxLadekapazitaet() {
		return this.maxKapazitaet;
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
		char[][] raumschiffShape = { { '\0', '\0', '_', '\0', '\0' }, { '\0', '/', 'X', '\\', '\0' },
				{ '\0', '{', 'X', '}', '\0' }, { '\0', '{', 'X', '}', '\0' }, { '/', '_', '_', '_', '\\' }, };
		return raumschiffShape;
	}

}
