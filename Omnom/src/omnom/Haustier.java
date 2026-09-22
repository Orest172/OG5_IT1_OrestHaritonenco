package omnom;

public class Haustier {

	private int hunger = 100;
	private int muede = 100;
	private int zufrieden = 100;
	private int gesund = 100;
	private String name;

	public Haustier() {

	}

	public Haustier(String name) {
		this.name = name;
	}

	public int getHunger() {
		return this.hunger;
	}

	public void setHunger(int hunger) {
		if (hunger <= 100 && hunger >= 0) {
			this.hunger = hunger;
			if (hunger >= 100) {
				this.hunger = 100;
			}
		}
	}

	public int getMuede() {
		return this.muede;
	}

	public void setMuede(int muede) {
		if (muede >= 0) {
			this.muede = muede;
			if (muede >= 100) {
				this.muede = 100;
			}
		}
	}

	public int getZufrieden() {
		return zufrieden;
	}

	public void setZufrieden(int zufrieden) {
		if (zufrieden >= 0) {
			this.zufrieden = zufrieden;
			if (zufrieden >= 100) {
				this.zufrieden = 100;
			}
		}
	}

	public int getGesund() {
		return gesund;
	}

	public void setGesund(int gesund) {
		if (gesund >= 0) {
			this.gesund = gesund;
			if (gesund >= 100) {
				this.gesund = 100;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fuettern(int anzahl) {

		if (this.hunger <= 100 && this.hunger >= 0) {
			setHunger(this.hunger + anzahl);
		} else {
			System.out.println("Hunger ist schon voll");
		}
	}

	public void schlafen(int dauer) {
		this.muede = dauer;
	}

	public void spielen(int dauer) {

		if (this.zufrieden <= 100 && this.zufrieden >= 0) {
			setZufrieden(this.zufrieden + dauer);
		} else {
			System.out.println("Haustier ist schon Glücklich!");
		}
	}

	public void heilen() {
		if (this.gesund < 100) {
			setGesund(this.gesund + 40);
		}
	}
}
