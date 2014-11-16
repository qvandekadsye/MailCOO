package vdk.oukkal.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vdk.oukkal.mail.BankAccount;
import vdk.oukkal.mail.City;
import vdk.oukkal.mail.Inhabitant;
import vdk.oukkal.mail.Money;
import vdk.oukkal.mail.PromissoryNote;

public class PromissoryNoteTest {
	City city=new City("City");
	Inhabitant ina1=new Inhabitant(city,"1", new BankAccount("3333",2000));
	Inhabitant ina2=new Inhabitant(city,"2", new BankAccount("3334",2000));

	@Test
	public void testGetCost() {
		PromissoryNote note= new PromissoryNote(ina1,ina2,new Money(15));
		assertEquals(1.15, note.getCost(),0.1f);
	}

}
