package vdk.oukkal.mail;

public class Inhabitant {
	private City theCity;
	private String name;
	private BankAccount theBankAccount;
	
	/**
	 * @param aCity the city of the inhabitant.
	 * @param aName the name of the inhabitant.
	 * @param aBankAccount the Bank account of the inhabitant.
	 */
	public Inhabitant(City aCity, String aName, BankAccount aBankAccount)
	{
		this.theCity=aCity;
		this.name=aName;
		this.theBankAccount=aBankAccount;
	}
	
	/**
	 * @param theLetter The letter that the inhabitant will receive.
	 */
	public void receiveLetter(Letter<?> theLetter)
	{
		System.out.println("<-"+this.getName()+" receives "+theLetter.getDescription()+" from "+theLetter.getSender().getName());
		theLetter.action();
	}
	
	/**
	 * @return The current city.
	 */
	public City getCity()
	{
		return this.theCity;
	}
	
	/**
	 * @return The name of the inhabitant.
	 */
	public String getName()
	{
		return this.name;
	}
	
	public BankAccount getBankAccount()
	{
		return this.theBankAccount;
	}

}
