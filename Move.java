import java.util.Scanner;
public class Move
{

	Scanner scan = new Scanner(System.in);
	Spinner spinner = new Spinner();
	Candyland board = new Candyland();

	public String special;
	public String spin;

	public int player;

	public void setTurn(int p)
	{
		player = p;

		spinner.setSpin();
		board.setSpaces();

		special = "";

		boolean loseTurn = false;
		boolean find = true;
		boolean isDouble = false;

		//While loop breaks once the correct spot is found
		while(find)
		{
			spin = spinner.getSpin();

			if(spin.equals("Candy Castle"))
			{
				player = 35;
				find = false;
				break;
				}

			if(spin.equals("Ice Cream Floats"))
			{
				player = 49;
				find = false;
				break;
				}

			if(spin.equals("Lollipop Woods"))
			{
				player = 78;
				find = false;
				break;
				}

			if(spin.equals("Peppermint Forest"))
			{
				player = 111;
				find = false;
				break;
				}

			//finds if the color is a double color in the Spinner, and returns true if it is
			if(spin.contains("Double"))
			{
				spin = spin.substring(7);
				isDouble = true;
				player += 6;
			}

			//Player position
			for(int i=player+1; i <= player +8; i++){
				//Checks if the board space is equal to the spin
				if((board.getSpace(i).equals(spin)) && (player <= 128))
				{
					player = i;
					if (player == 9)
					{
						special = "You found the Chocolate Bar Road! Skip ahead 36 spaces.";
						player=44;
						break;
					}
					else if(player == 20)
					{
						special = "You found the Gum Drop Lane! Skip ahead 14 spaces.";
						player = 34;
						break;
					}

					else
					{
						break;
					}
				}
				else
				{
					find = true;
				}
			}
			find = false;
		}
		if (isDouble)
			spin = "Double " + spin;
	}

	//Accessor methods
	public int getTurn()
	{
		return player;
	}
	public String getSpecial()
	{
		return special;
	}
	public String getSpin()
	{
		return spin;
	}

}

