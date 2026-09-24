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

}
