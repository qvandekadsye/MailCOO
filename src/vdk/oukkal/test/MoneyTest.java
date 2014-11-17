package vdk.oukkal.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vdk.oukkal.mail.Money;

public class MoneyTest {

	@Test
	public void testGetMoney(){
		Money money = new Money(7);
		float s = 7;
		assertTrue(money.getMoney() == s);
	}

}
