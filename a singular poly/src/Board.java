import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Board
	{
		static ArrayList<Square> board = new ArrayList<Square>();
		
		public static void pickBoard() throws IOException{
			Scanner userIntInput = new Scanner(System.in);
			Scanner boardFile = null;
			System.out.println("What version of Monopoly would you like to play?");
			System.out.println("(1) Classic Monopoly (2) ???????");
			int x = userIntInput.nextInt();
			if(x==1) {
				boardFile = new Scanner(new File("classicboard.txt"));
			}
//			} else if() {
//				
//			}
			while(boardFile.hasNext()) {
				String type = boardFile.next();
				if(type.equals("property")) {
					String t = "property";
					String n = boardFile.next();
					int l = boardFile.nextInt();
					int c = boardFile.nextInt();
					String co = boardFile.next();
					int r = boardFile.nextInt();
					int noh = boardFile.nextInt();
					int hsp = boardFile.nextInt();
					int hsr = boardFile.nextInt();
					boolean htl = boardFile.nextBoolean();
					int htp = boardFile.nextInt();
					int htr = boardFile.nextInt();
					board.add( new Property(t, n, l, c, co, r, noh, hsp, hsr, htl, htp, htr));
				} else if (type.equals("misc")) {
					String t = "misc";
					String n = boardFile.next();
					int l = boardFile.nextInt();
					int c = boardFile.nextInt();
					board.add( new Miscellaneous(t, n, l, c));
				} else if (type.equals("card")) {
					String t = "card";
					String n = boardFile.next();
					int l = boardFile.nextInt();
					int c = boardFile.nextInt();
					boolean ic = boardFile.nextBoolean();
					board.add( new Card(t, n, l, c, ic));
				} else if (type.equals("railroad")) {
					String t = "railroad";
					String n = boardFile.next();
					int l = boardFile.nextInt();
					int c = boardFile.nextInt();
					int rr = boardFile.nextInt();
					board.add( new Railroad(t, n, l, c, rr));
				} else if (type.equals("utility")) {
					String t = "utility";
					String n = boardFile.next();
					int l = boardFile.nextInt();
					int c = boardFile.nextInt();
					int ut = boardFile.nextInt();
					board.add( new Railroad(t, n, l, c, ut));
				}
			}
		}
	}
