package vdk.oukkal.mail;

/**
 * Simulation of a Text writing in a letter.
 *
 */
public class TextContent implements Content {
	private String content;
	
	/**
	 * @param aContent the content of the letter.
	 */
	public TextContent(String aContent)
	{
		this.content=aContent;
	}
	
	public String getContent()
	{
		return this.content;
	}
	

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "a text content ("+this.content+")";
	}

}
