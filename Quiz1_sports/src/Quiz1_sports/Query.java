package Quiz1_sports;

import java.util.*;

public class Query extends Main{
	public static int ask_for_stuff(String request){
		@SuppressWarnings("resource")
		Scanner user_input = new Scanner(System.in);
		
		System.out.print(request);
		int value = user_input.nextInt();
		return value;
	}

}
