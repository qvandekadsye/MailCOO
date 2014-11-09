package vdk.oukkal.mail;

public class Money implements Content {
	private float sum;
	
	/**
	 * @param quantity Quantity of money.
	 */
	public Money(float quantity)
	{
		this.sum=quantity;
	}
	
	public float getMoney()
	{
		return sum;
	}

	@Override
	public String getDescription() {
		return "This is money";
	}

}
