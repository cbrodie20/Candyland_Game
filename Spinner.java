import java.util.Random;
public class Spinner
{

Random randomGenerator = new Random();
String color = "";

//This method picks a random number from the spinner and sets it as our spinner number.
	public void setSpin()
	{
		int iSpin = randomGenerator.nextInt(40);
		if(iSpin == 1 || iSpin == 2 || iSpin == 3 || iSpin == 4)
		{
			color = "Green";
		}
		else if(iSpin == 5 || iSpin == 6 || iSpin == 7 || iSpin == 8)
		{
			color ="Purple";
		}
		else if(iSpin == 9 || iSpin == 10 || iSpin == 11 || iSpin == 12)
		{
			color ="Yellow";
		}
		else if(iSpin == 13 || iSpin == 14 || iSpin == 15 || iSpin == 16)
		{
			color ="Blue";
		}
		else if(iSpin == 17 || iSpin == 18 || iSpin == 19 || iSpin == 20)
		{
			color ="Red";
		}
		else if(iSpin == 21 || iSpin == 22 || iSpin == 23 || iSpin == 24)
		{
			color ="Orange";
		}
		//Double colors
		else if(iSpin == 25 || iSpin == 26)
		{
			color ="Double Green";
		}
		else if(iSpin == 27 || iSpin == 28)
		{
			color ="Double Purple";
		}
		else if(iSpin == 29 || iSpin == 30)
		{
			color ="Double Yellow";
		}
		else if(iSpin == 31 || iSpin == 32)
		{
			color ="Double Blue";
		}
		else if(iSpin == 33 || iSpin == 34)
		{
			color ="Double Red";
		}
		else if(iSpin == 35 || iSpin == 36)
		{
			color ="Double Orange";
		}
		//Special Spots
		else if(iSpin == 37)
		{
			color = "Candy Castle";
		}
		else if(iSpin == 38)
		{
			color = "Ice Cream Floats";
		}
		else if(iSpin == 39)
		{
			color = "Peppermint Forest";
		}
		else if(iSpin == 40)
		{
			color = "Lollipop Woods";
		}
	}

	//This method prints out the space that the player rolled.
	public String getSpin()
	{
		return color;
	}
}

