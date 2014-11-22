package vdk.oukkal.mail;

/**
 * The class who will run the program.
 *
 */
public class Main {
public static Simulator simulator;



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length==0)
		{
			simulator=new Simulator();
			simulator.launchSimulator();
		}
		else if(args.length==3)
		{
			simulator=new Simulator(args[0],args[1],args[2]);
			simulator.launchSimulator();
		}
		else
		{
			System.out.println("Args error");
		}
			






	}

}
