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
	private List<Letter<?>> sacocheFacteur;

	


	//Constructor

	public City(String name){
		this.name = name;
		this.inhabitants = new ArrayList<Inhabitant>();
		this.mailBox = new ArrayList<Letter<?>>();
		this.sacocheFacteur = new ArrayList<Letter<?>>();
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



	//Setter

	/**
	 * Add one inhabitant in the city
	 * @param inhabitant for add in the city
	 */
	public void addInhabitant(Inhabitant inhabitant){
		this.inhabitants.add(inhabitant);
	}



	//Methode
	/**
	 * Add one letter in the mail box of city
	 * @param letter 
	 */
	public void sendLetter(Letter<?> letter){
		this.mailBox.add(letter);
		System.out.println("-> "+letter.getSender().getName()+" mails "+letter.getDescription()+" whose content is "+letter.content.getDescription()+" to "+ letter.getReceiver().getName()+" for a cost of "+letter.getCost()+" euro(s).");
		letter.getSender().getBankAccount().debit(letter.getCost());
		System.out.println(letter.getSender().getName()+" account whose balance is now "+letter.getSender().getBankAccount().getAmount());
	}


	/**
	 * Simule le fait que le facteur recupere les lettres de la boite au lettre
	 */
	private void viderLaBoiteAuLetterDansLaSacoche(){
		for(Letter<?> l : this.mailBox)
			this.sacocheFacteur.add(l);
		this.mailBox.clear();
	}


	/**
	 * Distribute letters from mail box to inhabitant of city
	 */
	public void distributeLetters(){
		this.viderLaBoiteAuLetterDansLaSacoche();
		for( Letter<?> l : this.sacocheFacteur)
			l.getReceiver().receiveLetter(l);
		this.sacocheFacteur.clear();
	}

}
