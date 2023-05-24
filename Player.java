import java.util.Scanner;

public class Player
{

	public int p1 = 0;
	public int p2 = 0;
	public int p3 = 0;
	public int p4 = 0;
	private boolean finished = false;

	public boolean winner(int p1, int p2, int p3, int p4)
	{
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		if (p1 > 128)
		{
			finished = true;
		}
		else if (p2 > 128)
		{
			finished = true;
		}
		else if (p3 > 128)
		{
			finished = true;
		}
		else if (p4 > 128)
		{
			finished = true;
		}
		else
		{
			finished = false;
		}
		return finished;
	}

	public String winner()
	{
		String playerWon = "";
		if (p1 >= 128)
		{
			playerWon = "Player One Wins!";
		}
		else if (p2 >= 128)
		{
			playerWon = "Player Two Wins!";
		}
		else if (p3 >= 128)
		{
			playerWon = "Player Three Wins!";
		}
		else if (p4 >= 128)
		{
			playerWon = "Player Four Wins!";
		}
		return playerWon;
	}

	public void setGame()
	{
		Move move = new Move();

		Scanner scan = new Scanner(System.in);

		System.out.println("\t\t\tCANDYLAND\n");
		System.out.print("How many players will there be (2-4): ");
		int iPlayers = scan.nextInt();
		while(iPlayers < 2 || iPlayers > 4)
		{
			System.out.println("\n\tYou need to enter a valid amount of players");
			System.out.print("\nHow many players will there be (2-4): ");
			iPlayers = scan.nextInt();
		}

		while(winner(p1,p2,p3,p4) != true)
		{
			System.out.print("\nPlayer 1's turn. Press any leter key to spin. ");
			if(scan.next() != null && winner(p1,p2,p3,p4) != true)
			{
				move.setTurn(p1);
				System.out.println("You landed on " + move.getSpin() + ".");
				System.out.println(move.getSpecial());
				System.out.println("You moved "+ (move.getTurn() - p1) +" spaces. You are at space "+ move.getTurn() +".\n");
				p1 = move.getTurn();

				if (winner(p1,p2,p3,p4) != true)
				{
					System.out.print("\nPlayer 2's turn. Press any letter key to spin. ");
				}
			}

			if(scan.next() != null && winner(p1,p2,p3,p4) != true)
			{
				move.setTurn(p2);
				System.out.println("You landed on " + move.getSpin() + ".");
				System.out.println(move.getSpecial());
				System.out.println("You moved "+ (move.getTurn() - p2) +" spaces. You are at space "+ move.getTurn() +".\n");
				p2 = move.getTurn();
			}

			if(iPlayers >= 3  && winner(p1,p2,p3,p4) != true)
			{
				System.out.print("\nPlayer 3's turn. Press any letter key to spin. ");
				if(scan.next() != null)
				{
					move.setTurn(p3);
					System.out.println("You landed on " + move.getSpin() + ".");
					System.out.println(move.getSpecial());
					System.out.println("You moved "+ (move.getTurn() - p3) +" spaces. You are at space "+ move.getTurn() +".\n");
					p3 = move.getTurn();
				}
			}

			if(iPlayers == 4  && winner(p1,p2,p3,p4) != true)
			{
				System.out.print("\nPlayer 4's turn. Press any letter key to spin. ");
				if(scan.next() != null)
				{
					move.setTurn(p4);
					System.out.println("You landed on " + move.getSpin() + ".");
					System.out.println(move.getSpecial());
					System.out.println("You moved "+ (move.getTurn() - p4) +" spaces. You are at space "+ move.getTurn() +".\n");
					p4 = move.getTurn();
				}
			}
		}
	}
}

