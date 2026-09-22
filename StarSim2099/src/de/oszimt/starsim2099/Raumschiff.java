package de.oszimt.starsim2099;

import de.oszimt.starsim2099.Unterklasse.Typ;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff extends Typ{

	// Attribute
	
	private String antrieb;
	private int winkel;
	private int maxKapazitaet;
	
	// Methoden

	public Raumschiff() {
		
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
