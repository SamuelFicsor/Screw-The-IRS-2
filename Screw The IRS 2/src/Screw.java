
public class Screw extends Card
	{

	public Screw(String t)
		{
			super(t);
			// TODO Auto-generated constructor stub
		}

	@Override
	public void play(Player p)
		{
			// TODO Auto-generated method stub
			System.out.println(p.getName() + " won the game!");
			System.exit(0);
		}
	
	@Override
	public String display()
		{
			return type;
		}


	}
