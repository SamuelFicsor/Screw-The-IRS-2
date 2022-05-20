import java.util.ArrayList;
import java.util.Scanner;

public class Driver
	{
		static ArrayList<Player> players = new ArrayList<Player>();
		static Scanner inputScanner = new Scanner(System.in);
		static boolean stillPlaying = true;
		
		public static void main(String[] args)
			{
				Deck.fillDeck();
				Deck.shuffle();
				Deck.deal();
				
				int input;
				String strInput;
				
				System.out.println("Hello, welcome to Screw the IRS!\nHow many players are playing?");
				
				input = inputScanner.nextInt();
				
				for(int i = 0; i < input; i++)
					{
						System.out.println("Hello player " + (i+1) + ", what is your name?");
						strInput = inputScanner.next();
						
						players.add(new Player(strInput, 0, 0, false, new ArrayList<Card>(), new ArrayList<Card>()));
					}
				
				System.out.println("These are the players:");
				
				int counter = 1;
				for(Player p : players)
					{
						System.out.println("Player " + counter + ": " + p.getName());
						counter++;
					}
				
				while(stillPlaying)
					{
						for(Player p : players)
							{
								p.turn(p);
							}
					}
				
				System.exit(0);
			}

	}
