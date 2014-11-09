package vdk.oukkal.mail;

public class BankAccount {
	private String code;
	private float amount;
	
	/**
	 * Constructor
	 * @param aCode The account's code.
	 * @param anAmount The amount to credit to start.
	 */
	public BankAccount(String aCode,float anAmount)
	{
		this.code=aCode;
		this.amount=anAmount;
	}
	
	/**
	 * Constructor
	 * @param aCode The account's code.
	 * Thanks to this constructor, the amount is Zero.
	 */
	public BankAccount(String aCode)
	{
			this(aCode,0);
	}
	
	/**
	 * @return The account's code.
	 */
	public String GetCode()
	{
		return this.code;
	}
	
	/**
	 * @return The amount in the account.
	 */
	public float getAmount()
	{
		return this.amount;
	}
	
	/**
	 * @param moneyToCredit The amount of money add in the account.
	 */
	public void credit(float moneyToCredit)
	{
		this.amount+=moneyToCredit;
	}
	
	/**
	 * @param moneyToDebit The amount of money suppress in the account.
	 */
	public void debit(float moneyToDebit)
	{
		this.amount-=moneyToDebit;
	}
	
	

}
