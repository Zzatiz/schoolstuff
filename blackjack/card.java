package BlackJack;

import java.util.ArrayList;

public class card {
	private int numValue;
	private String suit, value;
	
	public card(int num, String val, String theSuit) {
		this.numValue = num;
		this.value = val;
		this.suit = theSuit;
	}

	public int getNumValue() {
		return numValue;
	}

	public String getSuit() {
		return suit;
	}

	public String getValue() {
		return value;
	}
	
	public String toString() {
		return this.value + " of " + this.suit;
	}

	
}/**
 * This method prints the card toString values for every card in the hand parameter.<br>
 * If the firstCard parameter is true it should print the entire hand. <br>
 * If the firstCard parameter is false it should print "Mystery Card" for the first card.<br>
 * @param hand An ArrayList containing card objects to be printed
 * @param firstCard A boolean to decide if the first card should be printed. 
 */
