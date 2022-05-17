
public class Deduction extends Front
	{
		private boolean substantiated;
		
	public Deduction(String t, String k, int v, boolean s)
		{
			super(t, k, v);
			substantiated = s;
			// TODO Auto-generated constructor stub
		}

	public boolean isSubstantiated()
		{
			return substantiated;
		}

	public void setSubstantiated(boolean substantiated)
		{
			this.substantiated = substantiated;
		}

	@Override
	public void play(Player p)
		{
			// TODO Auto-generated method stub
			if(p.getTotal() + value < p.getSalary())
				{
				p.setTotal(p.getTotal() + value);	
				}
			
			else
				{
				System.out.println("You can't deduct more than your salary!");
				}
		}

	}
