package vdk.oukkal.mail;

public class RegisteredLetter extends Letter<Letter<?>> {
	public static final float REGISTEREDCOST=15;

	public RegisteredLetter(Inhabitant sender, Inhabitant receiver,
			Letter<?> content) {
		super(sender, receiver, content);
	}

	
	public String getDescription() {
		return "This is a RegisteredLetter";
	}

	
	public float getCost() {
		return REGISTEREDCOST+content.getCost();
	}

	
	public void action() {
		this.content.action();
		this.receiver.getCity().sendLetter(new SimpleLetter(this.receiver,this.sender,new TextContent("Acknowledgment of receipt")));

	}

}
