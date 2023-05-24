/*Caitlyn Brodie
	5/17/2023
	Period 5
	My final project*/

import java.util.*;
public class Candyland
{
	public String[] board;

	public Candyland()
	{
		board = new String[135];
	}

	public void setSpaces()
	{

		board[0]= "Start";

		for (int i=1; i < 127; i+=6){
			board[i] = "Red";}
		for (int i=2; i < 127; i+=6)
			board[i] = "Purple";
		for (int i=3; i < 127; i+=6)
			board[i] = "Yellow";
		for (int i=4; i < 127; i+=6)
			board[i] = "Blue";
		for (int i=5; i < 127; i+=6)
			board[i] = "Orange";
		for (int i=6; i < 127; i+=6)
			board[i] = "Green";

		board[128] = "Finish";
	}

	public String getSpace(int i)
	{

		if (i > 126 )
		{
			return board[128];
		}

		return board[i];
	}
	public static void main(String[] args)
	{
		Player play = new Player();
		play.setGame();
		System.out.println(play.winner());
	}
}