package jUTest;

import static org.junit.Assert.*;
import jU.Cashier;
import jU.Envelope;
import jU.NegativeBalanceException;
import junit.framework.Assert;

import org.junit.Test;

public class TestCashier {

	@Test
	public void testMakeChange() {
		Cashier cashier = new Cashier();
		Envelope envelope = new Envelope();
		envelope.setDollars(5);
		Envelope expected = new Envelope();
		Envelope actual = new Envelope();
		
		expected.setDollars(3);
		expected.setQuarters(2);
		actual = cashier.makeChange(envelope, 1, 50);
		Assert.assertEquals(expected.getDollars(), actual.getDollars());
		Assert.assertEquals(expected.getQuarters(), actual.getQuarters());
		
		expected.setDollars(2);
		expected.setQuarters(1);
		expected.setDimes(1);
		expected.setPennies(3);
		actual = cashier.makeChange(envelope, 2, 62);
		Assert.assertEquals(expected.getDollars(), actual.getDollars());
		Assert.assertEquals(expected.getQuarters(), actual.getQuarters());
		Assert.assertEquals(expected.getDimes(), actual.getDimes());
		Assert.assertEquals(expected.getPennies(), actual.getPennies());
		
		expected.setDollars(1);
		expected.setQuarters(1);
		expected.setDimes(1);
		expected.setNickels(1);
		expected.setPennies(1);
		actual = cashier.makeChange(envelope, 3, 59);
		Assert.assertEquals(expected.getDollars(), actual.getDollars());
		Assert.assertEquals(expected.getQuarters(), actual.getQuarters());
		Assert.assertEquals(expected.getDimes(), actual.getDimes());
		Assert.assertEquals(expected.getNickels(), actual.getNickels());
		Assert.assertEquals(expected.getPennies(), actual.getPennies());
	}
	
	@Test
	public void testException(){
		Cashier cashier = new Cashier();
		Envelope envelope = new Envelope();
		envelope.setDollars(5);
		
		cashier.makeChange(envelope, 5, 43);
		Assert.assertEquals(envelope.getDollars(), 5);
	}

}