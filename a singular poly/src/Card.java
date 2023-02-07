
public class Card extends Square
	{
		public boolean isChance;
		public Card(String t, String n, int l, int c, boolean ic)
			{
				type = t;
				name = n;
				location = l;
				cost = c;
				isChance = ic;
			}
		public void drawCard() {
			if(isChance==true) {
				
			} else if(isChance==false) {
				
			}
		}
	}
