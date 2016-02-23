package Quiz1_sports;

public class Calculation extends Main{
	private static double a = (((getComp()/getAttempts()) - .3)*5);
	private static double b = (((getYards()/getAttempts()) - 3)*25);
	private static int c = ((getTouch()/getAttempts())*20);
	private static double d = (2.375 - ((getSteal()/getAttempts())*25));
	
	public static double rating(){
			return (((a+b+c+d)/6)*100);
			}

	
}
