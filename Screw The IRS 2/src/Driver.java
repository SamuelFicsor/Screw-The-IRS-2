import java.util.ArrayList;
import java.util.Scanner;

public class Driver
	{
		static ArrayList<Player> players = new ArrayList<Player>();
		static Scanner inputScanner = new Scanner(System.in);
		
		public static void main(String[] args)
			{
				int input;
				String strInput;
				
				System.out.println("Hello, welcome to Screw the IRS!\nHow many players are playing?");
				
				input = inputScanner.nextInt();
				
				for(int i = 0; i < input; i++)
					{
						System.out.println("Hello player " + input + ", what is your name?");
						strInput = inputScanner.next();
						
						players.add(new Player(strInput, 0, 0, false, new ArrayList<Card>(), new ArrayList<Card>()));
					}
				
				System.out.println("These are the players:");
				
				int counter = 1;
				for(Player p : players)
					{
						System.out.println("Player " + counter + ": " + p.getName());
					}
			}

	}
