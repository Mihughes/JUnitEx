package jU;

public class Envelope {
	private int dollars = 0;	// contains the number of each type of currency
	private int quarters = 0;	// not their sums
	private int dimes = 0;
	private int nickels = 0;
	private int pennies = 0;
	
	public Envelope() { //default contractor
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public Envelope(int dollars, int quarters, int dimes, int nickels, int pennies) { //constructor
		super();
		this.dollars = dollars;
		this.quarters = quarters;
		this.dimes = dimes;
		this.nickels = nickels;
		this.pennies = pennies;
	}

	public double getTotalCents() {
		double totalCents = 0.0;
		totalCents = (dollars * 100) + (quarters * 25) + (dimes* 10) + (nickels * 5) + pennies;
		return totalCents;
	}

	public int getDollars() {
		return dollars;
	}

	public void setDollars(int dollars) {
		this.dollars = dollars;
	}

	public int getQuarters() {
		return quarters;
	}

	public void setQuarters(int quarters) {
		this.quarters = quarters;
	}

	public int getDimes() {
		return dimes;
	}

	public void setDimes(int dimes) {
		this.dimes = dimes;
	}

	public int getNickels() {
		return nickels;
	}

	public void setNickels(int nickels) {
		this.nickels = nickels;
	}

	public int getPennies() {
		return pennies;
	}

	public void setPennies(int pennies) {
		this.pennies = pennies;
	}
	
	

}
