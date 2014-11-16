package vdk.oukkal.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vdk.oukkal.mail.BankAccount;
import vdk.oukkal.mail.City;
import vdk.oukkal.mail.Inhabitant;
import vdk.oukkal.mail.Money;
import vdk.oukkal.mail.PromissoryNote;
import vdk.oukkal.mail.RegisteredLetter;
import vdk.oukkal.mail.SimpleLetter;
import vdk.oukkal.mail.TextContent;

public class RegisteredLetterTest {
	City city=new City("City");
	Inhabitant ina1=new Inhabitant(city,"1", new BankAccount("3333",2000));
	Inhabitant ina2=new Inhabitant(city,"2", new BankAccount("3334",2000));

	@Test
	public void testGetCost() {
		RegisteredLetter rL=new RegisteredLetter(ina1,ina2, new SimpleLetter(ina1,ina2,new TextContent("Hi")));
		assertEquals(16,rL.getCost(),0.0f);
		RegisteredLetter rL2=new RegisteredLetter(ina1,ina2, new PromissoryNote(ina1,ina2,new Money(20)));
		assertEquals(16.2,rL2.getCost(),0.1f);
		RegisteredLetter rL3=new RegisteredLetter(ina1,ina2, new RegisteredLetter(ina1,ina2,new SimpleLetter(ina1,ina2,new TextContent("hi hi"))));
		assertEquals(31,rL3.getCost(),0.0f);
	}

}
