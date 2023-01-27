
public class Property extends Square
	{
		public String color;
		public int rent;
		public int numberOfHouses;
		public int housePrice;
		public int houseRent;
		public boolean hotel;
		public int hotelPrice;
		public int hotelRent;
		public Property(String c, int r, int noh, int hsp, int hsr, boolean htl, int htp, int htr) {
			c = color;
			r = rent;
			noh = numberOfHouses;
			hsp = housePrice;
			hsr = houseRent;
			htl = hotel;
			htp = hotelPrice;
			htr = hotelRent;
		}
		public String getColor()
			{
				return color;
			}
		public void setColor(String color)
			{
				this.color = color;
			}
		public int getRent()
			{
				return rent;
			}
		public void setRent(int rent)
			{
				this.rent = rent;
			}
		public int getNumberOfHouses()
			{
				return numberOfHouses;
			}
		public void setNumberOfHouses(int numberOfHouses)
			{
				this.numberOfHouses = numberOfHouses;
			}
		public int getHousePrice()
			{
				return housePrice;
			}
		public void setHousePrice(int housePrice)
			{
				this.housePrice = housePrice;
			}
		public int getHouseRent()
			{
				return houseRent;
			}
		public void setHouseRent(int houseRent)
			{
				this.houseRent = houseRent;
			}
		public boolean isHotel()
			{
				return hotel;
			}
		public void setHotel(boolean hotel)
			{
				this.hotel = hotel;
			}
		public int getHotelPrice()
			{
				return hotelPrice;
			}
		public void setHotelPrice(int hotelPrice)
			{
				this.hotelPrice = hotelPrice;
			}
		public int getHotelRent()
			{
				return hotelRent;
			}
		public void setHotelRent(int hotelRent)
			{
				this.hotelRent = hotelRent;
			}
		
	}
