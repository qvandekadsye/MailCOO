package vdk.oukkal.test;
import vdk.oukkal.mail.BankAccount;
import vdk.oukkal.mail.City;
import vdk.oukkal.mail.Inhabitant;
import vdk.oukkal.mail.SimpleLetter;
import vdk.oukkal.mail.TextContent;

import static org.junit.Assert.*;

import org.junit.Test;

public class CityTest {

	@Test
	public void addInhabitantTest() {
		City cityTest=new City("TestCity");
		assertEquals(0,cityTest.getInhabitants().size());
		cityTest.addInhabitant(new Inhabitant(cityTest, "h1",new BankAccount("11111")));
		assertEquals(1,cityTest.getInhabitants().size());
	}
	@Test
	public void sendLetterTest()
	{
		City cityTest=new City("TestCity");
		cityTest.addInhabitant(new Inhabitant(cityTest, "h1",new BankAccount("11111")));
		cityTest.addInhabitant(new Inhabitant(cityTest, "h2",new BankAccount("11112")));
		SimpleLetter aLetterForTest=new SimpleLetter(cityTest.getInhabitants().get(0),cityTest.getInhabitants().get(1),new TextContent("Hi!"));
		assertEquals(0,cityTest.getMailBox().size());
		cityTest.sendLetter(aLetterForTest);
		assertEquals(1,cityTest.getMailBox().size());
	}
	
	@Test
	public void distibuteLetterTest()
	{
		City cityTest=new City("TestCity");
		cityTest.addInhabitant(new Inhabitant(cityTest, "h1",new BankAccount("11111")));
		cityTest.addInhabitant(new Inhabitant(cityTest, "h2",new BankAccount("11112")));
		SimpleLetter aLetterForTest=new SimpleLetter(cityTest.getInhabitants().get(0),cityTest.getInhabitants().get(1),new TextContent("Hi!"));
		cityTest.sendLetter(aLetterForTest);
		assertEquals(1,cityTest.getMailBox().size());
		cityTest.distributeLetters();
		assertEquals(0,cityTest.getMailMansBag().size());
		assertEquals(0,cityTest.getMailBox().size());
	}

}
