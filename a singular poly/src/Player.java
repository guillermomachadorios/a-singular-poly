import java.util.ArrayList;
public class Player
	{
		public String name;
		public int money;
		public int location;
		public int diceRoll;
		public boolean inJail;
		public ArrayList inventory;
		public Player(String n, int m, int l, int dr, boolean ij, ArrayList in) {
			name = n;
			money = m;
			location = l;
			diceRoll = dr;
			inJail = ij;
			inventory = in;
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public int getMoney()
			{
				return money;
			}
		public void setMoney(int money)
			{
				this.money = money;
			}
		public int getDiceRoll()
			{
				return diceRoll;
			}
		public void setDiceRoll(int diceRoll)
			{
				this.diceRoll = diceRoll;
			}
		public boolean isInJail()
			{
				return inJail;
			}
		public void setInJail(boolean inJail)
			{
				this.inJail = inJail;
			}
		public int getLocation()
			{
				return location;
			}
		public void setLocation(int location)
			{
				this.location = location;
			}
		public ArrayList getInventory() 
			{
				return inventory;
			}
		public void setInventory(ArrayList inventory) 
			{
				this.inventory = inventory;
			}
		public static int rollDie() {
			int x=0;
			boolean snakeEyes;
			int rand = (int)(Math.random() * 6) + 1;
			int rand2 = (int)(Math.random() * 6) + 1;
			if(rand==rand2) {
				snakeEyes=true;
			} else {
				snakeEyes=false;
			}
			return x = rand+rand2;
		}
	}
