package Quiz1_sports;

public class Main {
	private static int touch = 19;//Query.ask_for_stuff("Enter the number of touchdowns(TD): ");
	private static int yard = 3725;//Query.ask_for_stuff("Enter the yards run(YDS): ");
	private static int steal = 14;//Query.ask_for_stuff("Number of interseptions(INT): ");
	private static int comp = 346;//Query.ask_for_stuff("Number of compleations(COMP): ");
	private static int attempts = 532;//Query.ask_for_stuff("Total number of attempts(ATT): ");
	protected static double qb_rate = Calculation.rating();
	
	public static void main(String[] args) {
		System.out.print("Passer rating is:" + qb_rate);
	}

	public static int getTouch() {
		return touch;
	}
	
	public static int getYards(){
		return yard;
	}
	
	public static int getSteal(){
		return steal;
	}
	
	public static int getComp(){
		return comp;
	}
	
	public static int getAttempts(){
		return attempts;
	}
	}