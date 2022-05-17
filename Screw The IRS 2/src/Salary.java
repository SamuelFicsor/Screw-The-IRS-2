
public class Salary extends Card
	{
		private int value;
		
		public Salary(String t, int v)
		{
			super(t);
			value = v;
		}

		public int getValue()
			{
				return value;
			}

		public void setValue(int value)
			{
				this.value = value;
			}

		@Override
		public void play(Player p)
			{
				// TODO Auto-generated method stub
				
			}
		@Override
		public String display()
			{
				return type + " " + value;

			}
	}
