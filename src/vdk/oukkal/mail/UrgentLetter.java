package vdk.oukkal.mail;

public class UrgentLetter extends Letter<Letter<?>> {

	public UrgentLetter(Inhabitant sender, Inhabitant receiver,
			Letter<?> content) {
		super(sender, receiver, content);
	}

	@Override
	public String getDescription() {
		return "an urgent letter whose content is "+this.content.getDescription();
	}

	@Override
	public float getCost() {
		return 2*this.content.getCost();
	}

	@Override
	public void action() {
		this.content.action();

	}

}
