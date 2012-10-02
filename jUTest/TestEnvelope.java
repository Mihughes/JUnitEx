/*
 * http://www.vogella.com/articles/JUnit/article.html
 */

package jUTest;

//import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

import jU.Cashier;
import jU.Envelope;

public class TestEnvelope {

	@Test
	public void testGetTotalCents() {
		

		Envelope envelope = new Envelope();
		envelope.setDollars(5);
		//Cashier cashier = new Cashier(); // this line is not needed for the first tests.
		double expected = 0.0;
		double actual = 0.0;
		
		//just activate 1 of the test sections. 
		//expectation: Pass
		expected = 500;
		actual = envelope.getTotalCents();
		Assert.assertEquals(expected, actual);			
		
		//expectation: Fail,
//		expected = 400;
//		actual = envelope.getTotalCents();
//		Assert.assertEquals(expected, actual);	
		
// activate the cashier line for the rest of the tests. But, that is beyond the focus.		
		// expectation: JUnit pass with "Insufficient Funds, you need 100 more cents" message.
//		expected = -100;  
//		envelope = cashier.makeChange(envelope, 6, 0);
//		actual = envelope.getTotalCents();
//		Assert.assertEquals(expected, actual);	
		
		// expectation: pass
//		expected = 68.0;
//		envelope = cashier.makeChange(envelope,  4,  32);
//		actual = envelope.getTotalCents();
//		Assert.assertEquals(expected, actual);
		
		//expectation: pass
//		expected = 495;  
//		envelope = cashier.makeChange(envelope, 0, 5);
//		actual = envelope.getTotalCents();
//		Assert.assertEquals(expected, actual);
		
		//expectation: Fail
//		expected = 295;  
//		envelope = cashier.makeChange(envelope, 0, 5);
//		actual = envelope.getTotalCents();
//		Assert.assertEquals(expected, actual);		


		
	}

}
