package jU;

public class NegativeBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int balance;

	public NegativeBalanceException(int balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Insufficient Funds, you need " + balance + " more cents.";
	}
}
