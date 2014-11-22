package vdk.oukkal.mail;

/**
 * Simulate a context for this project.
 *
 */
public class Simulator {
	private int numberOfDays;
	private int numberOfInhabitant;
	private float defaultSum;

	
	public Simulator()
	{
		this.numberOfDays=6;
		this.numberOfInhabitant=100;
		this.defaultSum=5000;
	}

	/**
	 * Constructor
	 * @param numberDays Number of day for the simulation.
	 * @param numberInhabitant Number of inhabitant in the city.
	 * @param defsum Default sum for each Inhabitant's bank account.
	 */
	public Simulator(String numberDays,String numberInhabitant, String defsum)
	{
		this.numberOfDays=Integer.parseInt(numberDays);
		this.numberOfInhabitant=Integer.parseInt(numberInhabitant);
		this.defaultSum=Float.parseFloat(defsum);
	}

	/**
	 * Generate letter for the simulation.
	 * @param sender The sender of the letter.
	 * @param receiver The receiver.
	 * @param i Type of letter : 0=simple, 1=promissory, 2=regesitred, 3=Urgent
	 * @return
	 */
	public Letter<?> createLetter(Inhabitant sender, Inhabitant receiver, int i){
		if(i == 0){
			return new SimpleLetter(sender, receiver, new TextContent("bla bla"));
		}
		else if (i == 1){
			int sum = 1 + (int)(Math.random() * ((sender.getBankAccount().getAmount() - 1) + 1));
			return new PromissoryNote(sender, receiver, new Money(sum));
		}
		else if( i == 2){
			int j = (int)(Math.random() * ((4 - 1) + 1));
			return new RegisteredLetter(sender, receiver, createLetter(sender, receiver,j));
		}

		int j = (int)(Math.random() * ((4 - 1) + 1));
		return new UrgentLetter(sender, receiver, createLetter(sender, receiver,j));



	}

	/**
	 * Launch the simulator.
	 */
	public void launchSimulator()
	{
		City city = new City("Lille");
		System.out.println("Creating "+city.getName()+" city"); 

		int nbI = this.numberOfInhabitant ; 

		for(int i = 0 ; i < nbI ; i++){
			String name = "Inhabitant-"+i;
			city.addInhabitant(new Inhabitant(city, name, new BankAccount("bc"+i,this.defaultSum)));
		}

		System.out.println("Creating "+nbI+" inhabitants");



		System.out.println("Mailing letters for "+this.numberOfDays+" days");

		for(int j = 0 ; j < this.numberOfDays; j++){

			System.out.println("************************************************************");
			System.out.println("Day "+j);
			if(j!=0)
				city.distributeLetters();
			for(int n = 0 ; n < 2 ;n++){
				int aleaSender = (int)(Math.random() * ((nbI - 1) + 1));
				int aleaReceiver = (int)(Math.random() * ((nbI - 1) + 1));
				int typeLetter = (int)(Math.random() * ((4 - 1) + 1));
				Letter<?> l = createLetter(city.getInhabitants().get(aleaSender), city.getInhabitants().get(aleaReceiver), typeLetter);
				city.sendLetter(l);
			}
		}
	}
}


