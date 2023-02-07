import java.io.IOException;
import java.util.Scanner;

public class monopolyRunner
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static Player p1 = new Player("", 1500, 0, 0, false);

		public static void main(String[] args) throws IOException
			{
				System.out.println("Welcome to Monopoly! What is your name?");
				p1.setName(userStringInput.nextLine());
				System.out.println("Good to see you, "+p1.getName()+"!");
				Board.pickBoard();
				gameplayLoop();
			}
		
		public static void gameplayLoop() {
			String pause;
			int playerChoice;
			boolean stillPlaying=true;
			while(stillPlaying==true&&p1.inJail==false) {
				p1.setDiceRoll(Player.rollDie());
				p1.setLocation(p1.getLocation()+p1.getDiceRoll());
				if(p1.getLocation()>39) {
					p1.setLocation((p1.getLocation()+p1.getDiceRoll())-41);
					System.out.println("You pass Go and collect $200M.");
					p1.setMoney(p1.getMoney()+200);
					pause = userStringInput.nextLine();
				}				
				System.out.println("You move "+p1.getDiceRoll()+" spaces and land on "+Board.board.get(p1.getLocation()).getName()+".");
				pause = userStringInput.nextLine();
				if(Board.board.get(p1.location).getType().equals("property")) {
					System.out.println("This property costs $"+Board.board.get(p1.getLocation()).getCost()+"M. Would you like to buy it?");
					System.out.println("(1) Yes     (2) No");
					playerChoice = userIntInput.nextInt();
					if(playerChoice==1) {
						if(p1.getMoney()>Board.board.get(p1.location).getCost()) {
							p1.setMoney(p1.getMoney()-Board.board.get(p1.getLocation()).getCost());
							System.out.println("You have purchased "+Board.board.get(p1.getLocation()).getName()+" for $"+Board.board.get(p1.getLocation()).getCost()+"M.");
							pause = userStringInput.nextLine();
							System.out.println("You have $"+p1.getMoney()+"M left.");
						} else {
							System.out.println("You don't have the money for this!");
							pause = userStringInput.nextLine();
						}
					}
				} else if (Board.board.get(p1.location).getType().equals("misc")) {
					if(Board.board.get(p1.getLocation()).getName().equals("Go")) {
						System.out.println("You admire the $200M you just acquired.");
						pause = userStringInput.nextLine();
					} else if (Board.board.get(p1.getLocation()).getName().equals("GotoJail")) {
						System.out.println("Uh oh! You're going to jail!");
						p1.setInJail(true);
						pause = userStringInput.nextLine();
					} else if (Board.board.get(p1.getLocation()).getName().equals("FreeParking")) {
						System.out.println("You take a breather at the free parking.");
						pause = userStringInput.nextLine();
					} else if (Board.board.get(p1.getLocation()).getName().equals("Jail")) {
						System.out.println("You are not currently in prison, so you are just visiting.");
						pause = userStringInput.nextLine();
					} else {
						System.out.println("The tax recquires you pay $"+Board.board.get(p1.getLocation()).getCost()+"M.");
						pause = userStringInput.nextLine();
						if(p1.getMoney()<Board.board.get(p1.getLocation()).getCost()) {
							System.out.println("Oh no! You don't have enough to pay!");
							pause = userStringInput.nextLine();
							System.out.println("This is technically tax evasion, so you go to jail.");
							pause = userStringInput.nextLine();
						} else {
							p1.setMoney(p1.getMoney()-Board.board.get(p1.getLocation()).getCost());
						}
					}
				}
			}
		}

	}
