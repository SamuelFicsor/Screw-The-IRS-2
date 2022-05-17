import java.util.ArrayList;

public class Player
	{
		private String name;
		private int total;
		private int salary;
		private ArrayList<Card> hand;
		private ArrayList<Card> front;
		
		public Player(String n, int t, int s, ArrayList<Card> h, ArrayList<Card> f)
		{
			name = n;
			total = t;
			hand = h;
			front = f;
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
				hand.add(c);
			}
		
		public void discard(int i)
			{
				hand.remove(i);
			}
		
		public void displayHand(ArrayList<Card> hand)
			{
				for(Card c : hand)
					{
						c.display();
					}
			}
	}
