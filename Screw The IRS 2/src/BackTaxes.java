
public class BackTaxes extends Card
	{
		public BackTaxes(String t)
		{
			super(t);
		}

		@Override
		public void play(Player p)
			{
				// TODO Auto-generated method stub
				for(Card c: p.getFront())
					{
					if(c.getType().equals("Audit") || (c.getType().equals("Deduction") && !((Deduction) c).isSubstantiated()))
						{
							p.discardBottom(c);
							break;
						}
					}

				p.setAudited(false);
			}
		
		@Override
		public String display()
			{
				return type;
			}

	}
