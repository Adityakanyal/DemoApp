package GusserGame;

import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number in range of 1 to 10");
		guessNum=scan.nextInt();
		//guess again
		if(guessNum>10 || guessNum<1)
			{System.out.println("Gusser guess again cause number out of range");
			guessNum();}
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number in range of 1 to 10");
		guessNum=scan.nextInt();
		if(guessNum>10 || guessNum<1)
			System.out.println("Player Disqualified for number out of range");
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				// Restarting the game
				System.out.println("All players guessed! Restarting the game");
				collectNumFromGuesser();
				collectNumFromPlayers();
				compare();
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
				
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	//Play again method
	void playAgain()
	{	System.out.println("To Play Again press 0 else press any key to stop");
		Scanner sc=new Scanner(System.in);
		int flag=sc.nextInt();
	
		if(flag==0)
		{
			collectNumFromGuesser();
			collectNumFromPlayers();
			compare();
		}
		else
		{System.out.println("Game Ends");}
	}
	
}


public class LaunchGame {

	public static void main(String[] args) {
		
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();
			//Play Again
			u.playAgain();
	}

}
