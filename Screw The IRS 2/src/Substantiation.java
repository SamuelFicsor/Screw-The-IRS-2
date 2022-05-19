
public class Substantiation extends Front
	{

	public Substantiation(String t, String k, int v)
		{
			super(t, k, v);
			// TODO Auto-generated constructor stub
		}

	@Override
	public void play(Player p)
		{
			// TODO Auto-generated method stub
			//I LOVE NOT USING BRACKETS AND MAKING IT SUPER HARD TO READ THE CODE
			for(Card c : p.getFront())
				if(c.getType().equals("Deduction"))
					if(((Deduction) c).getKind().equals(this.getKind()) && ((Deduction) c).getKind().equals(this.getValue()))
						((Deduction) c).setSubstantiated(true);
		}
	
	}
