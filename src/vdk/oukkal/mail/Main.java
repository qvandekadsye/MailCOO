package vdk.oukkal.mail;

/**
 * The class who will run the program.
 *
 */
public class Main {

	private int nbI;
	private int nbDay;


	public Main(int nbI, int nbDay){
		this.nbI = nbI;
		this.nbDay = nbDay;
	}


	public Main(){
		this.nbI = 100;
		this.nbDay = 6;
	}


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
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length == 1)
			Main main = new Main();
		else if (args.length = 3)
			Main main = new Main(args[1],args[2]);
			City city = new City("Lille");
			System.out.println("Creating "+city.getName()+" city"); 

			int nbI = Integer.parseInt(args[0]) ; 

			for(int i = 0 ; i < nbI ; i++){
				String name = "Inhabitant-"+i;
				city.addInhabitant(new Inhabitant(city, name , new BankAccount("bc"+i,10)));
			}

			System.out.println("Creating "+nbI+" inhabitants");


			int k = Integer.parseInt(args[1]) ; 

			System.out.println("Mailing letters for "+k+" days");

			for(int j = 0 ; j < k; j++){

				System.out.println("************************************************************");
				System.out.println("Day "+j);
				if(j!=0)
					city.distributeLetters();
				for(int n = 0 ; n < 2 ;n++){
					int aleaSender = (int)(Math.random() * ((99 - 1) + 1));
					int aleaReceiver = (int)(Math.random() * ((99 - 1) + 1));
					int typeLetter = (int)(Math.random() * ((4 - 1) + 1));
					Letter<?> l = main.createLetter(city.getInhabitants().get(aleaSender), city.getInhabitants().get(aleaReceiver), typeLetter);
					city.sendLetter(l);
				}


			}
		}



	}

}
