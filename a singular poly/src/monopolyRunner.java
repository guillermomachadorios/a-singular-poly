import java.util.Scanner;

public class monopolyRunner
	{
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static Player p1 = new Player("", 1500, 0);

		public static void main(String[] args)
			{
				
				System.out.println("Welcome to Monopoly! What version would you like to play?");
				System.out.println("(doesnt work rn)");
				System.out.println("What is your name?");
				p1.setName(userStringInput.nextLine());
				System.out.println("Good to see you, "+p1.getName()+"!");
				gameplayLoop();
			}
		
		public static void gameplayLoop() {
			p1.setDiceRoll(Player.rollDie());
			System.out.println("You move "+p1.getDiceRoll()+" spaces and land on (placeholder). It costs (placeholder). Would you like to buy it?");
		}

	}
