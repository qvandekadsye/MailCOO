package vdk.oukkal.mail;


/**
 * The letter class represents the letter that will be sent
 * @param <T> Type of the letter
 */
public abstract class Letter<T extends Content> implements Content{

	//Attribut
	
	/** Sender of letter*/
	protected Inhabitant sender;
	
	/** Receiver of letter*/
	protected Inhabitant receiver;
	
	/** Content of letter */
	protected T content;
	
	
	
	
	//Constructeur
	
	/**
	 * @param sender The <code>Inhabitant</code> who has sent the letter.
	 * @param receiver The <code>Inhabitant</code> who will receive the letter.
	 * @param content The letter's content.
	 */
	public Letter( Inhabitant sender, Inhabitant receiver, T content){
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	
	
	
	//Getter
	
	/**
	 * 
	 * @return Sender of letter
	 */
	public Inhabitant getSender(){
		return this.sender;
	}
	
	/**
	 * 
	 * @return receiver of letter
	 */
	public Inhabitant getReceiver(){
		return this.receiver;
	}
	
	/**
	 * 
	 * @return content of letter
	 */
	public T getContent(){
		return this.content;
	}
	
	/**
	 * 
	 * @return The letter's cost.
	 */
	public abstract float getCost();
	
	
	
	
	//Methode
	
	/**
	 * Do one action or more according to the letter's type.
	 */
	public abstract void action();
	

}
