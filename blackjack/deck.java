package BlackJack;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class deck {
	Scanner scan = new Scanner(System.in);
	
	private ArrayList<card> deck;
	private Random rand;
	private String[] faceCards = {"J" , "Q" , "K" , "A" };
	private String[] suits = {"Spades" , "Hearts" , "Diamonds" , "Clubs"};
	
	public deck() {
		rand = new Random();
		deck = new ArrayList<>();
		makeDeck();
	}
	
	public void makeDeck() {
		//deck.add(new Card(2, "2", "Spades"));
		for(int i = 0 ; i < this.suits.length; i++) {
			for(int q = 2, count = 0; q < 15; q++) {
				if(q < 11) {
					deck.add(new card(q, (q + ""), this.suits[i]));
				}
				else if(q < 14) {
					deck.add(new card(10 , faceCards[count], this.suits[i]));
					count ++;
				}
				else if(q == 11 || q == 1) {
					System.out.println("Ace detected. You want it to be a one or an eleven? (input '1' or '11'");
					int acedetect = scan.nextInt();
					if(acedetect == 11) {
						deck.add(new card(11 , faceCards[3], this.suits[i]));
					}
					if(acedetect == 1) {
						deck.add(new card(1 , faceCards[3], this.suits[i]));
					}
					
					
				}
			}
		}
	}
	public void resetDeck() {
		deck.clear();
		makeDeck();
	}
	
	public void playerDeck() {
		System.out.println("New game. Cards are being shuffled...");
		makeDeck();
		System.out.println(deck);
	}
	public card deal() {
		card draw = deck.get(rand.nextInt(deck.size()));
		deck.remove(draw);
		return draw;
	}
}
