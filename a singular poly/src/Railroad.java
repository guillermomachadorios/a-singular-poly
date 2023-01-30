
public class Railroad extends Square
	{
		public int numberOfRRs;
		public Railroad(String n, int l, int c, int rr)
			{
				name = n;
				location = l;
				cost = c;
				numberOfRRs = rr;
			}
		public int RRrent() {
			int rent=25;
			rent*=numberOfRRs;
			return rent;
		}
	}
