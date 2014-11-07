package vdk.oukkal.mail;


/**
 * The letter class represents the letter that will be sent
 * @param <T> Type of the letter
 */
public abstract class Letter<T extends Content> {

	//Attribut
	
	/** Sender of letter*/
	protected Inhabitant sender;
	
	/** Receiver of letter*/
	protected Inhabitant receiver;
	
	/** Content of letter */
	protected T content;
	
	
	
	
	//Constructeur
	
	public Letter( Inhabitant sender, Inhabitant receiver, T content){
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	
	
	
	
	//Getter
	
	/**
	 * Sender of letter
	 * @return Sender of letter
	 */
	public Inhabitant getSender(){
		return this.sender;
	}
	
	/**
	 * Receiver of letter
	 * @return receiver of letter
	 */
	public Inhabitant getReceiver(){
		return this.receiver;
	}
	
	/**
	 * Content of letter
	 * @return content of letter
	 */
	public T getContent(){
		return this.content;
	}
	
	/*
	 * Cost of letter
	 * @return cost of letter
	 */
	public abstract float getCost();
	
	
	
	
	//Methode
	
	/*
	 * DO one or more actions according to the type of letter
	 */
	public abstract void action();
	

}
