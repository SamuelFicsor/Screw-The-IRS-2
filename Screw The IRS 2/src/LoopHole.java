
public class LoopHole extends Card
	{

	public LoopHole(String t)
		{
			super(t);
			// TODO Auto-generated constructor stub
		}

	@Override
	public void play(Player p)
		{
			// TODO Auto-generated method stub
			for(Card c: p.getFront())
				{
				if(c.getType().equals("Audit")) {
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
