package vdk.oukkal.test;

import static org.junit.Assert.*;

import org.junit.Test;

import vdk.oukkal.mail.BankAccount;
import vdk.oukkal.mail.City;
import vdk.oukkal.mail.Inhabitant;
import vdk.oukkal.mail.SimpleLetter;
import vdk.oukkal.mail.TextContent;
import vdk.oukkal.mail.UrgentLetter;

public class UrgentLetterTest {
	City city=new City("City");
	Inhabitant ina1=new Inhabitant(city,"1", new BankAccount("3333",2000));
	Inhabitant ina2=new Inhabitant(city,"2", new BankAccount("3334",2000));

	@Test
	public void getCostTest() {
		UrgentLetter Ul1=new UrgentLetter(ina1, ina1, new SimpleLetter(ina1,ina2, new TextContent("Hi!")));
		
	}

}
