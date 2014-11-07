package vdk.oukkal.mail;

/**
 * The Simple letter is a letter containing a text.
 */
public class SimpleLetter extends Letter<Text> {

	
	/** Cost of simple letter */
	public final static float COST =  1; 
		
	//Constructor
	
	public SimpleLetter( Inhabitant sender, Inhabitant receiver, Text content){ 
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
	 * A message appears in the Standard output representing this action.	 
	 */
	public void action(){
		System.out.println(this.receiver.getName()+" read : \" "+this.content.getContent()+" \"");
	}
}
