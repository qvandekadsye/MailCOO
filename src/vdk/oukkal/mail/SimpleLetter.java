package vdk.oukkal.mail;

/**
 * The Simple letter is a letter containing a text.
 */
public class SimpleLetter extends Letter<TextContent> {

	
	/** Cost of simple letter */
	public final static float COST =  1; 
		
	//Constructor
	
	public SimpleLetter( Inhabitant sender, Inhabitant receiver, TextContent content){ 
		super(sender,receiver,content);
	}
	
	/**
	 * Cost of simple letter
	 * @return cost of simple letter
	 */
	public float getCost(){
		return COST;
	}
	
	/**
	 * When the receiver open the letter, he read the text.
	 */
	public void action(){
	}

	@Override
	public String getDescription() {
		return "a simple letter whose content is a text content ("+this.content.getContent()+")";
	}
}
