import java.util.ArrayList;
import java.util.Scanner;

public class Player
	{
		private String name;
		private int total;
		private int salary;
		private boolean audited;
		private static ArrayList<Card> hand;
		private static ArrayList<Card> front;
		private static ArrayList<Option> optionList;
		private static Scanner inputScanner = new Scanner(System.in);
		private static int input;
		
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
		
		public static void displayCards(ArrayList<Card> cards)
			{
				int counter = 1;
				
				for(Card c : cards)
					{
						System.out.println(counter + c.display());
						counter++;
					}
			}
		
		public static void discard(Card c)
			{
				Deck.discard.add(c);
			}
		
		public void discardBottom(Card c)
			{
				Deck.discard.add(0,c);
			}
		
		public static void displayOptions(Player p)
			{
				Option viewHand = new Option(true, "View your hand", 1);
				Option viewFront = new Option(true, "View your front cards", 2);
				Option discard = new Option(true, "Discard", 3);
				Option handSalary = new Option(false, "Play a salary card", 4);
				Option hasAudit = new Option(false, "Play an audit card", 5);
				Option canDeduct = new Option(false, "Play a deduction card", 6);
				Option backTaxes = new Option(false, "Play a back taxes card", 7);
				Option screwCard = new Option(false, "End the game!", 8);
				

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

				Option[] optionArr = {viewHand, viewFront, handSalary, hasAudit, canDeduct, backTaxes, screwCard};
				optionList = new ArrayList<Option>();
				
				for(Option o : optionArr)
					if(o.isParameter())
						optionList.add(o);
				
				int counter = 1;
				
				for(Option o : optionList)
					{
						System.out.println(counter + ") " + o.getDescription());
						counter++;
					}
				
				input = inputScanner.nextInt();
				
				switch(optionList.get(input-1).getIdNum())
				{
					case 1: displayCards(hand);
					case 2: displayCards(front);
					case 3:
							{
								System.out.println("Which card would you like to discard?");
								p.displayCards(hand);
								input = inputScanner.nextInt();
								Deck.discard.add(hand.get(input-1));
								p.discard(input-1);
							}
					case 4:
							{
							for(Card c: p.getHand())
								if(c.getType().equals("Salary"))
								{
									c.play(p);
									discard(c);
								}		
							break;
							}
					case 5:
							{
							for(Card c: p.getHand())
								if(c.getType().equals("Audit"))
								{
									c.play(p);
									discard(c);
								}	
							break;
							}
					case 6:
							{
							for(Card c: p.getHand())
								if(c.getType().equals("Deduction"))
								{
									c.play(p);
									discard(c);
								}
							break;
							}
					case 7:
							{
							for(Card c: p.getHand())
								if(c.getType().equals("Back Taxes"))
								{
									c.play(p);
									discard(c);
								}
							break;
							}
					case 8:
							{
							for(Card c: p.getHand())
								if(c.getType().equals("Screw"))
								{
									c.play(p);
									discard(c);
								}
							break;
							}
					default:
							{
								System.out.println("Game broken :(");
							}
				}
			}
		
		public static void displayOptionsAudit(Player p)
			{
				Option substantiate = new Option(false, "Play your substantiation cards", 1);
				Option loopHole = new Option(false, "Play your loop hole card", 2);
				
				for(Card c : p.getHand())
					{
						if(c.getType().equals("Substantiation"))
							substantiate.setParameter(true);
						else if(c.getType().equals("Loop Hole"))
							loopHole.setParameter(true);
					}
				
				Option[] optionArr = {substantiate, loopHole};
				boolean isParam = false;
				
				int counter = 1;
				
				for(Option o : optionArr)
					{
						if(o.isParameter())
							{
								isParam = true;
								System.out.println(counter + o.getDescription());	
								counter++;
							}
					}
				
				if(!isParam)
					System.out.println("You have been audited and you can't fix it.\nSorry! Pay your taxes next time...\ncriminal scum");
			}
		
		public static void turn(Player p)
			{				
				System.out.println("Welcome " + p.getName() + "! It's your turn!\n1) Draw from the deck");
				
				if(Deck.discard.size() > 0)
					System.out.println("2) Draw from the discard pile - " + Deck.discard.get(Deck.discard.size()-1).display());
				
				input = inputScanner.nextInt();
				System.out.println();
				
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
