package BlackJack;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;


public class Cigarettes implements Chips {
private deck playerdeck, housedeck;

	//Attributes
		/*
		 * (non-Javadoc)
		 * @see club.westcs.BlackJack.Chips#getPlayerChips()
		 * Object 
		 * 		Scanner
		 * int
		 * 		PlayerCurrency
		 * 		pot
		 * 		bet
		 * 		
		 */
	
	
	public int playerCigarettes = 50;
	public int pot = 0;
	public int cigbet;
	Scanner scan = new Scanner(System.in);	
	
	
	@Override
	public int getPlayerCigs() {
		System.out.println("YOUR CIGARETTES = " + playerCigarettes);
		if(playerCigarettes < 50) {
			this.playerCigarettes = 50;
		}
		return playerCigarettes;
		
	}

	@Override
	public void lose() {
		// TODO Auto-generated method stub
		System.err.println("House Wins.");
		getPlayerCigs();
		this.playerCigarettes -= this.pot;
	}

	@Override
	public void win() {
		// TODO Auto-generated method stub
		System.err.println("Lucky you! House Loses.");
		System.out.println(this.pot + " cigarettes earned.");
		this.playerCigarettes += this.pot;
		
	}

	@Override
	public void tie() {
		// TODO Auto-generated method stub
		System.out.println("Draw. No winner.");
		getPlayerCigs();

		reset();

	}

	@Override
	public void bet() {
		// TODO Auto-generated method stub
		System.out.println("Time for you to bet your cigarettes. You must place a bet to play.");
		System.out.println("How many cigs?");
		cigbet = scan.nextInt();
		if(cigbet < 1 || cigbet > this.playerCigarettes) {
			System.err.println("can't bet less than one cig. PRESS ANY KEY TO RETRY");
			scan.nextLine();
			bet();
		}
		this.playerCigarettes -= cigbet;
		System.out.println("Pot raised by " + cigbet + " Cigarettes");
		this.pot += cigbet;
		int total = this.pot;
		System.out.println("The pot is now: " + total);
		
	}
	public void reset() {
		this.pot = 0;
		
		System.out.println("New pack of cigs. cigs reset");
	}
}
