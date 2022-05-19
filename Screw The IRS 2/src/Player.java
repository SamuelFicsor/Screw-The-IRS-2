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
		
		public static void displayOptions(Player p)
			{
				Option viewHand = new Option(true, "View your hand");
				Option handSalary = new Option(false, "Play a salary card");
				Option hasAudit = new Option(false, "Play an audit card");
				Option canDeduct = new Option(false, "Play a deduction card");
				Option backTaxes = new Option(false, "Play a back taxes card");
				Option screwCard = new Option(false, "End the game!");

						if(p.getSalary() != 0)
							{
								if(p.getTotal() < p.getSalary() && !p.isAudited()) {
									canDeduct.setParameter(true);
								}
								else if(p.getTotal() == p.getSalary() && !p.isAudited()) {
									screwCard.setParameter(true);
								}
							}						

				else
					{
						for(Card c: p.getHand())
							if(c.getType().equals("Salary"))
								handSalary.setParameter(true);
					}
				
				if(p.isAudited()) {
					for(Card c: p.getHand())
						if(c.getType().equals("Back Taxes"))
							backTaxes.setParameter(true);
				}
				
				for(Card c: p.getHand())
						if(c.getType().equals("Audit"))
							hasAudit.setParameter(true);

				Option[] optionArr = {viewHand, handSalary, hasAudit, canDeduct, backTaxes, screwCard};
				ArrayList<Option> optionList = new ArrayList<Option>();
				
				for(Option o : optionArr)
					if(o.isParameter())
						optionList.add(o);
				
				int counter = 1;
				
				for(Option o : optionList)
					{
						System.out.println(o.getDescription());
						counter++;
					}
						
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
				
				displayOptions(p);
				
			}
	}
