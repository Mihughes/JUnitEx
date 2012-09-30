/*
 * git@github.com:Mihughes/JUnitEx.git
  104  cd workspace
  105  cd JUnit_Ex
  106  ls
  107  cd src
  108  ls
  109  cd jU
  110  ls
  111  git init
  112  git add *.java
  113  git commit -m "initial java code"
  114  git remote add ju git@github.com:Mihughes/JUnitEx.git
  115  git pull ju master
  116  git push ju master
 */

package jU;

public class Cashier {
	
	public Envelope makeChange(Envelope oneEnv, int dollars, int cents) {
		Envelope change = new Envelope();
		
		// how much to return = how much in oneEnv - charge
		double changeValue =  computeEnvValue(oneEnv) - (dollars + ((double)cents / 100)); //cents must be received as xx
		
		// load up change Envelope
		change.setDollars((int)changeValue );  // this should whack the cents
		changeValue = changeValue - (int)changeValue;
		
		change.setQuarters((int)(changeValue / .25)); 
		changeValue = changeValue - (((int)(changeValue / .25) * .25));
		
		change.setDimes((int)(changeValue / .10));
		changeValue = changeValue - (((int)(changeValue / .10) * .10));
		
		
		change.setNickels((int)(changeValue / .05));
		changeValue = changeValue - (((int)(changeValue / .05) * .05));
		
		change.setPennies((int)(Math.round(changeValue / .01))); 
		
		return change;
	} //end public Envelope makeChange
	
	private double computeEnvValue(Envelope oneEnv) {
		double envValue = 0;
		// remember, quarters represents the number of quarters
		 envValue = envValue + oneEnv.getDollars() *   1.0;
		 envValue = envValue + oneEnv.getQuarters() * 0.25;
		 envValue = envValue + oneEnv.getDimes() *    0.10;
		 envValue = envValue + oneEnv.getNickels() *  0.05;
		 envValue = envValue + oneEnv.getPennies() *  0.01;
		
		return envValue;
	} //end private double computeEnvValue(

	public static void main(String[] args) {

		Envelope envelope = new Envelope();
		envelope.setDollars(5);
		Cashier cashier = new Cashier();
		envelope = cashier.makeChange(envelope,  1,  32);
		
		System.out.println("Dollars: " + envelope.getDollars() + ", Quarters: " + envelope.getQuarters() + ", dimes: " + envelope.getDimes() + ", nickels: " + envelope.getNickels() + ", pennies: " + envelope.getPennies() );
	}
	
	
} //end public class Cashier


