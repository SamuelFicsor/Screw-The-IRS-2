
public abstract class Front extends Card
	{
		private String kind;
		protected int value;
		
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

		
		public abstract void play(Player p);
		
		@Override
		public String display()
			{
				return type + " " + kind + " " + value;

			}

	}
