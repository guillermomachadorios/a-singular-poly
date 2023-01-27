
public class Utility extends Square
	{
		public int numOfUtilities;
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
