import java.util.ArrayList;
import java.util.Scanner;

public class Player
	{
		private String name;
		private int total;
		private int salary;
		private boolean audited;
		private ArrayList<Card> hand;
		private ArrayList<Card> front;
		
		public Player(String n, int t, int s, boolean a, ArrayList<Card> h, ArrayList<Card> f)
		{
			name = n;
			total = t;
			salary = s;
			audited = a;
			hand = h;
			front = f;
		}

		public boolean isAudited()
			{
				return audited;
			}

		public void setAudited(boolean audited)
			{
				this.audited = audited;
			}

		public int getSalary()
			{
				return salary;
			}

		public void setSalary(int salary)
			{
				this.salary = salary;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getTotal()
			{
				return total;
			}

		public void setTotal(int total)
			{
				this.total = total;
			}

		public ArrayList<Card> getHand()
			{
				return hand;
			}

		public void setHand(ArrayList<Card> hand)
			{
				this.hand = hand;
			}
		
		public void draw(Card c)
			{
				hand.add(c);
			}
		
		public void draw(ArrayList<Card> a)
			{
				hand.add(a.get(a.size()-1));
				System.out.println("You drew: " + a.get(a.size()-1).display());
				a.remove(a.size()-1);
			}

		public ArrayList<Card> getFront()
			{
				return front;
			}

		public void setFront(ArrayList<Card> front)
			{
				this.front = front;
			}
		
		public void addFront(Card c)
			{
				front.add(c);
			}
		
		public void discard(int i)
			{
				hand.remove(i);
			}
		
		public void displayHand(ArrayList<Card> hand)
			{
				int counter = 1;
				
				for(Card c : hand)
					{
						System.out.println(counter + c.display());
						counter++;
					}
			}
		
		public void discard(Card c)
			{
				Deck.discard.add(c);
			}
		
		public void discardBottom(Card c)
			{
				Deck.discard.add(0,c);
			}
		
		public boolean[] displayOptions(Player p)
			{
				boolean frontSalary = false;
				boolean handSalary = false;
				boolean audit = p.isAudited();
				
				
				boolean[] options = {};
				return options;
			}
		
		public static void turn(Player p)
			{
				Scanner inputScanner = new Scanner(System.in);
				int input;
				
				System.out.println("Welcome " + p.getName() + "! It's your turn!\n1) Draw from the deck\n2) Draw from the discard pile - " 
				+ Deck.discard.get(Deck.discard.size()-1).display());
				
				input = inputScanner.nextInt();
				
				if(input == 1)
					{
						p.draw(Deck.deck);
					}
				else if(input == 2)
					{
						p.draw(Deck.discard);
					}
				else
					{
						System.out.println("You can't do that! You broke the game! I don't want to code this right now so I'll fix it later.");
					}
				
				if(p.getSalary() == 0)
					{
						System.out.println("1) Display your hand\n2) Play salary\n3)");
					}
			}
	}
