package vdk.oukkal.mail;

/**
 * Money to put in the <code>letter</code>.
 *
 */
public class Money implements Content {
	private float sum;
	
	/**
	 * @param quantity Quantity of money.
	 */
	public Money(float quantity)
	{
		this.sum=quantity;
	}
	
	/**
	 * @return The amount of money in <Code>sum</code>
	 */
	public float getMoney()
	{
		return sum;
	}

	@Override
	public String getDescription() {
		return " a money content ("+this.getMoney()+")";
	}

}
