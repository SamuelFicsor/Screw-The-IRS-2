
public class Option
	{
		private boolean parameter;
		private String description;
		private int idNum;
		
		public Option(boolean p, String d, int i)
		{
			parameter = p;
			description = d;
			idNum = i;
		}

		public int getIdNum()
			{
				return idNum;
			}

		public void setIdNum(int idNum)
			{
				this.idNum = idNum;
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
