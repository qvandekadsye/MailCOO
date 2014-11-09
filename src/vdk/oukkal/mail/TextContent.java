package vdk.oukkal.mail;

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
		return "this is a text";
	}

}
