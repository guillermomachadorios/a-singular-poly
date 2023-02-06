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
				p1.setDiceRoll(Player.rollDie());
				p1.setLocation(p1.getLocation()+p1.getDiceRoll());
				System.out.println("You move "+p1.getDiceRoll()+" spaces and land on "+Board.board.get(p1.getLocation()).getName()+".");
				String weehaa = userStringInput.nextLine();
		}

	}
