
public class Front extends Card
	{
		private String kind;
		private int value;
		
		public Front(String t, String k, int v)
			{
				super(t);
				kind = k;
				value = v;
			}

		public String getKind()
			{
				return kind;
			}

		public void setKind(String kind)
			{
				this.kind = kind;
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
				if(type.equals("Deduction"))
					{
						if(p.getTotal() + value < p.getSalary())
						p.setTotal(p.getTotal() + value);
						
						else
							{
								System.out.println("You can't deduct more than your salary!");
							}
					}
				
			}

		@Override
		public void display()
			{
				System.out.println(type + " " + kind + " " + value);

			}

	}
