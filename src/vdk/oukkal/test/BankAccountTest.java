package vdk.oukkal.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vdk.oukkal.mail.BankAccount;

public class BankAccountTest {

	@Test
	public void creditTest() {
		BankAccount bA=new BankAccount("ba1",1000);
		assertEquals(1000,bA.getAmount(),0.0f);
		bA.credit(1300);
		assertEquals(2300,bA.getAmount(),0.0f);
		
	}
	
	@Test
	public void debitTest()
	{
		BankAccount bA=new BankAccount("ba2",1000);
		assertEquals(1000,bA.getAmount(),0.0f);
		bA.debit(300);
		assertEquals(700,bA.getAmount(),0.0f);
	}

}
