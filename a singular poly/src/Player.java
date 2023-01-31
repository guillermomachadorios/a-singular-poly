
public class Player
	{
		public String name;
		public int money;
		public int diceRoll;
		public boolean inJail;
		public Player(String n, int m, int dr, boolean ij) {
			name = n;
			money = m;
			diceRoll = dr;
			inJail = ij;
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
