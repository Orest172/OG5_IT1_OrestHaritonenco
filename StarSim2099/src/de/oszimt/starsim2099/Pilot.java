package de.oszimt.starsim2099;

/**
 * Write a description of class Pilot here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pilot {

	// Attribute
	
	private String name;
	private String grad;
	private double posX;
	private double posY;
	
	// Methoden
	
	public Pilot() {
		
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setGrad(String g) {
		this.grad = g;
	}
	
	public String getGrad() {
		return this.grad;
	}
	
	public void setPosX(double p) {
		this.posX = p;
	}
	
	public double getPosX() {
		return this.posX;
	}
	
	public void setPosY(double p) {
		this.posY = p;
	}
	
	public double getPosY() {
		return this.posY;
	}
}
