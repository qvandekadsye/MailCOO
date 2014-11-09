package vdk.oukkal.mail;

public class RegisteredLetter extends Letter<Letter> {

	public RegisteredLetter(Inhabitant sender, Inhabitant receiver,
			Letter content) {
		super(sender, receiver, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "This is a RegisteredLetter";
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

}
