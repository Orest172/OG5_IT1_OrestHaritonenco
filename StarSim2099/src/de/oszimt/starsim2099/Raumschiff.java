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
	
	public void setTyp(String t) {
		this.typ = t;
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
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}

}
