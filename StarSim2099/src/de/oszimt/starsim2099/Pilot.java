package de.oszimt.starsim2099;

import de.oszimt.starsim2099.Unterklasse.Name;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot extends Name{

	// Attribute
	
	private String grad;
	
	// Methoden
	
	public Pilot() {
		
	}
	
	public void setGrad(String g) {
		this.grad = g;
	}
	
	public String getGrad() {
		return this.grad;
	}
	
	
}
