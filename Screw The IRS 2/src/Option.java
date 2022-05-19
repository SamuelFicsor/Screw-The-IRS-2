
public class Option
	{
		private boolean parameter;
		private String description;
		
		public Option(boolean p, String d)
		{
			parameter = p;
			description = d;
		}

		public boolean isParameter()
			{
				return parameter;
			}

		public void setParameter(boolean parameter)
			{
				this.parameter = parameter;
			}

		public String getDescription()
			{
				return description;
			}

		public void setDescription(String description)
			{
				this.description = description;
			}
	}
