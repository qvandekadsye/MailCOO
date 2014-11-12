package vdk.oukkal.mail;

/**
 * The promissory note is a letter containing money.
 */
public class PromissoryNote extends Letter<Money> {

	
	/** Cost of basic promissory note */
	public final static float BASE = 1 ;
	
	//Constructor
	public PromissoryNote( Inhabitant sender, Inhabitant receiver, Money content){ 
		super(sender,receiver,content);
	}	
	
	
	//Getter

	/**
	 * Cost of promissory note, the cost is equal to 1% of the amount sent more the basique cost. 
	 * @return cost of promissory
	 */
	public float getCost(){
		return BASE + (this.content.getMoney()/100);
	}
	
	//Methode
	/**
	 * When the receiver open the letter his account is credited.
	 * For think him, the receiver send letter for the sender.
	 * A message appears in the Standard output representing this action.	 
	 */
	public void action(){
		this.receiver.getBankAccount().credit(this.getContent().getMoney());
		System.out.println(this.receiver.getName()+" has received "+this.content.getMoney()+" his balance is now "+this.receiver.getBankAccount().getAmount());
		this.receiver.getCity().sendLetter(new SimpleLetter(this.receiver,this.sender,new TextContent("Think for "+this.content.getMoney()+"$")));
		System.out.println("And sending a simple letter to "+this.sender.getName()+" to thank him ");
	}


	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "a promissory note" ;
	}
	
	
}
