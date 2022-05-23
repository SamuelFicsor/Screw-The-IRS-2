
public class Audit extends Card
	{

	public Audit(String t)
		{
			super(t);
		}

	public void play(Player p1, Player p2)
		{
			// TODO Auto-generated method stub
			boolean firstAudit = false;
			int counter = 0;
			
			while(!firstAudit)
				{
					Card c = p1.getHand().get(counter);
					
					if(c.getType().equals("Audit"))
						{
							p2.addFront(c);
							p1.getFront().remove(counter);
							firstAudit = true;
						}
				}
			
			p2.setAudited(true);
			
			Player.displayOptionsAudit(p2);
		}
	
	@Override
	public String display()
		{
			return type;
		}

	@Override
	public void play(Player p)
		{
			// TODO Auto-generated method stub
			
		}

		
	}
