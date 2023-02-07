
public class Utility extends Square
	{
		public int numOfUtilities;
		public Utility(String t, String n, int l, int c, int ut)
			{
				type = t;
				name = n;
				location = l;
				cost = c;
				numOfUtilities = ut;
			}
		public int utilityRent(int diceRoll) {
			int rent=0;
			if(numOfUtilities==1) {
				rent = diceRoll*4;
			} else if (numOfUtilities==2) {
				rent = diceRoll*10;
			}
			return rent;
		}
	}
