package vdk.oukkal.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import vdk.oukkal.mail.BankAccount;
import vdk.oukkal.mail.City;
import vdk.oukkal.mail.Inhabitant;

public class InhabitantTest {

	private static Inhabitant h1;
	private static City c1;
	private static City c2;
	private static BankAccount b1;

	

	
	@BeforeClass
	public static void setUpBeforeClass() {
			c1 = new City("tourcoing");
			b1 = new BankAccount("0");
			h1 = new Inhabitant(c1,"Inhabitant", b1);
			
			c2 = new City("tourcoing");

	}
	
	
	@Test
	public void testGetCity(){
		assertEquals(h1.getCity(),c1);
		assertNotSame(h1.getCity(), c2);
	}
	
	@Test
	public void testGetName(){
		assertEquals(h1.getName(),"Inhabitant");
	}
	
	@Test
	public void testGetBankAccount(){
		assertSame(h1.getBankAccount(), b1);
	}
	


}
