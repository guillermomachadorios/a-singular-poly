
public abstract class Board
	{
		public String name;
		public int location;
		public int cost;
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getLocation()
			{
				return location;
			}
		public void setLocation(int location)
			{
				this.location = location;
			}
		public int getCost()
			{
				return cost;
			}
		public void setCost(int cost)
			{
				this.cost = cost;
			}
	}
