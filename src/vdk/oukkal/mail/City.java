package vdk.oukkal.mail;

import java.util.*;

/**
 * The City class represents the city where the letters will be sent. 
 */
public class City {

	//Attribut

	/**Name of city*/
	private String name;

	/** Inhabitants of city*/
	private List<Inhabitant> inhabitants;

	/** Mail box of city */
	private List<Letter<?>> mailBox;

	/** Lettre qui va etre distribuer par le facteur*/
	private List<Letter<?>> mailmansBag;

	


	

	/**
	 * @param name The city's name.
	 */
	public City(String name){
		this.name = name;
		this.inhabitants = new ArrayList<Inhabitant>();
		this.mailBox = new ArrayList<Letter<?>>();
		this.mailmansBag = new ArrayList<Letter<?>>();
	}



	
	//Getter

	/**
	 * Inhabitants of city
	 * @return inhabitants of city
	 */
	public List<Inhabitant> getInhabitants(){
		return this.inhabitants;
	}

	/**
	 * Name of city
	 * @return name of city
	 */
	public String getName(){
		return this.name;
	}
	
	/**
	 * @return The city's MailBox.
	 */
	public List<Letter<?>> getMailBox()
	{
		return this.mailBox;
	}
	
	/**
	 * @return The Mailman's Bag.
	 */
	public List<Letter<?>>getMailMansBag()
	{
		return this.mailmansBag;
	}



	//Setter

	/**
	 * Add one inhabitant in the city
	 * @param inhabitant for add in the city.
	 */
	public void addInhabitant(Inhabitant inhabitant){
		this.inhabitants.add(inhabitant);
	}



	//Methode
	/**
	 * Add one letter in the mail box of city
	 * @param letter The letter whose will go in the mailbox.
	 */
	public void sendLetter(Letter<?> letter){
		this.mailBox.add(letter);
		System.out.print("-> "+letter.getSender().getName()+" mails "+letter.getDescription()+" to "+letter.getReceiver().getName()+" for a cost of "+letter.getCost());
		if(letter.getCost() == 1)
			System.out.println(" euro");
		else
			System.out.println(" euros");
		letter.getSender().getBankAccount().debit(letter.getCost());
		System.out.println(letter.getSender().getName()+" account whose balance is now "+letter.getSender().getBankAccount().getAmount());
	}


	
	/**
	 * All the letters in the mailbox will go in the mailman's bag.
	 */
	private void cleanMailBox(){
		for(Letter<?> l : this.mailBox)
			this.mailmansBag.add(l);
		this.mailBox.clear();
	}


	/**
	 * Distribute letters from mail box to inhabitant of city.
	 */
	public void distributeLetters(){
		this.cleanMailBox();
		for( Letter<?> l : this.mailmansBag)
			l.getReceiver().receiveLetter(l);
		this.mailmansBag.clear();
	}

}
