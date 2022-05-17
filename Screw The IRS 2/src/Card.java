
public abstract class Card
	{
		protected String type;
		
		public Card(String t)
		{
			type = t;
		}

		public String getType()
			{
				return type;
			}

		public void setType(String type)
			{
				this.type = type;
			}
		
		public abstract void play(Player p);
		
		public abstract void display();
	}
