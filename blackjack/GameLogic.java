package BlackJack;
import java.util.Scanner;
import java.util.ArrayList;

public class GameLogic implements GameLogicMaster {
	private Cigarettes Cigs;
	private deck deck;
	private Scanner scan;
	private ArrayList<card> playerCards, dealerCards;
	private int answer; 
	public GameLogic() {
	Cigs = new Cigarettes();
	deck = new deck();
	scan = new Scanner(System.in);
	playerCards = new ArrayList<>();
	dealerCards = new ArrayList<card>();
	int answer = 0;
	}
	@Override
	public void setName() {
		// TODO Auto-generated method stub
		System.out.println("What will your player name be?");
		String playerName = scan.nextLine();
		System.out.println("Awesome, Welcome to the table " + playerName);
		Cigs.playerCigarettes = 50;
		Cigs.getPlayerCigs();
		Cigs.reset();
		resetGame();
		
	}

	@Override
	public void runGame() {
		// TODO Auto-generated method stub
		while(Cigs.playerCigarettes > 1) {
			
			System.out.println("Welcome to the blackjack table.");
			Cigs.getPlayerCigs();
			Cigs.reset();
			dealerTurn();
			dealCard(playerCards);
			dealerTurn();
			dealCard(playerCards);
			
			
			Cigs.bet();
			hitStay();
//			int dtot = totalHand(dealerCards);
//			int ptot = totalHand(playerCards);
//			if(totalHand(playerCards) == 21 && totalHand(dealerCards) > 16) {
//				Cigs.win();
//				determineWinner();
//			}
//			if(totalHand(dealerCards) == 21) {
//				Cigs.lose();
//				determineWinner();
//				
//			}
//			if(dtot == ptot) {
//				Cigs.tie();
//				determineWinner();
//			}
//			if(totalHand(playerCards) > 21) {
//				Cigs.lose();
//				determineWinner();
//			}
//			if(totalHand(dealerCards) > 21) {
//				Cigs.win();
//				determineWinner();
//			}
//			if(Cigs.playerCigarettes < 1) {
//				System.err.println("Out of Smokes. House Wins.");
//				determineWinner();
//			}
//			
		}
		determineWinner();
		
	}


	@Override
	public void dealCard(ArrayList<card> hand) {
		hand.add(deck.deal());
		System.out.println("Cards are being delt...");
		System.out.println("Player:");
		if(hand.size() > 1) {
			System.out.println("You just got: ");
			System.out.println(playerCards.get(playerCards.size() - 1).toString());
		}
		System.out.println("----");
		printHand(playerCards, true);
		if(hand.isEmpty()) {
			hand.add(deck.deal());
		}
		System.out.println("----");
		
	}
	public void dealCardDealer(ArrayList<card> hand) {
		hand.add(deck.deal());
		System.out.println("The dealer just got ");
		//printHand(dealerCards, true);

		if(hand.isEmpty()) {
			hand.add(deck.deal());
		}
		
	}
	@Override
	public void printHand(ArrayList<card> hand, boolean firstCard) {
		
		for(card q : hand) {
			if(firstCard)
				System.out.println(q.toString());
			else {
				System.out.println("Mystery Card for dealer");
				firstCard = true;
			}
		}
		// TODO Auto-generated method stub
//		playerCards.get(playerCards.size()).toString();
//		while(firstCard = true) {
//			System.out.println(dealerCards.get(dealerCards.size()).toString());
//			System.out.println(playerCards.get(playerCards.size()).toString());
//		}
//		while(firstCard = false) {
//			System.out.println("Mystery Card for dealer");
//			System.out.println(playerCards.get(playerCards.size()).toString());
//		}
	}

	public int totalHand(ArrayList<card> hand) {
		int totalCard = 0; 
		//boolean set to false
		for(card q : hand) {
			 totalCard += q.getNumValue();
			 //if num value is 1
			 	//set to true
		}
		//if boolean is true and total < 12
			//add ten to the total
		return totalCard;
		
	}

	@Override
	public void hitStay() {
		// TODO Auto-generated method stub
		determineWinner();
		System.out.println("You have " + playerCards.size() + " cards. Hit or Stay? (H/S) ");
		System.out.println("You have a total value of " + totalHand(playerCards));
		while(totalHand(playerCards) < 21) {
			
		String ans = scan.nextLine();
		if(ans.contains("H")) {
			System.out.println("Hit!");
			dealCard(playerCards);
			hitStay();
		}
		if(ans.contains("S")) {
			System.out.println("Stay");
			System.out.println("Dealer turn");
			dealerTurn();
			hitStay();
		}
		}
			
		
//		
//		int dtot = totalHand(dealerCards);
//		int ptot = totalHand(playerCards);
//		if(totalHand(playerCards) == 21 && totalHand(dealerCards) > 16) {
//			Cigs.win();
//			determineWinner();
//		}
//		if(totalHand(dealerCards) == 21) {
//			Cigs.lose();
//			determineWinner();
//			
//		}
//		if(dtot == ptot) {
//			Cigs.tie();
//			determineWinner();
//		}
//		if(totalHand(playerCards) > 21) {
//			Cigs.lose();
//			determineWinner();
//		}
//		if(totalHand(dealerCards) > 21) {
//			Cigs.win();
//			determineWinner();
//		}
//		if(Cigs.playerCigarettes < 1) {
//			System.err.println("Out of Smokes. House Wins.");
//			determineWinner();
//		}
		
		
	}

	@Override
	public void dealerTurn() {
		// TODO Auto-generated method stub
		int dtot = totalHand(dealerCards);
		int ptot = totalHand(playerCards);
		if(totalHand(dealerCards) < 17) {
			dealCardDealer(dealerCards);
			System.out.println(dealerCards.get(dealerCards.size() - 1).toString());
			System.out.println("Dealer value: " + totalHand(dealerCards));
		}
		if(totalHand(dealerCards) > 16) {
			System.err.println("DEALER FULL");
		}
		if(totalHand(dealerCards) > 16 && ptot > dtot) {
			Cigs.win();
			resetGame();
		}
		
	}

	@Override
	public void determineWinner() {
		// TODO Auto-generated method stub
//		printHand(playerCards, true);
//		printHand(dealerCards, true);
		int dtot = totalHand(dealerCards);
		int ptot = totalHand(playerCards);
		if(totalHand(playerCards) == 21) {
			Cigs.win();
			resetGame();
		}else {
			
		}
		
		if(totalHand(dealerCards) == 21) {
			Cigs.lose();
			resetGame();
			
		}else {
			
		}
		
		if(dtot == ptot) {
			Cigs.tie();
			resetGame();
		}else {
			
		}
		
		if(totalHand(playerCards) > 21) {
			Cigs.lose();
			resetGame();
		}else {
			
		}
		
		if(totalHand(dealerCards) > 21) {
			Cigs.win();
			resetGame();
		}else {
			
		}
		
		
		
	}

	@Override
	public void resetHands() {
		playerCards.clear();
		dealerCards.clear();
		deck.resetDeck();
		System.out.println("Cards returned.");
		// TODO Auto-generated method stub
//		clear(playerCards);
//		clear(dealerCards);
	}

	private void clear(ArrayList<card> hand) {
		// TODO Auto-generated method stub
		hand.clear();
	}
	@Override
	public void resetGame() {
		// TODO Auto-generated method stub
//		Cigs.reset();
		resetHands();
		System.out.println("Leave the game? PRESS 1 for YES 2 for NO");
		
		String answered = scan.nextLine();
		try {
//			  Integer.parseInt(answered);
			  this.answer = Integer.parseInt(answered);
			}
			catch (NumberFormatException e) {
			  // do something that indicates to the user that an int was not given.
					System.err.println("PLEASE PRESS 1 or 2");
		}
			if(answer == 1) {
			System.exit(0);
		}
			if(answer != 1 && answer != 2) {
			System.err.println("PLEASE PRESS 1 or 2");
			resetGame();			
		}		
			if(answer == 2) {
			runGame();			
		}
			if (Cigs.playerCigarettes < 1) {
			System.err.println("Out of Smokes. House Wins.");
			setName();
		}
			
	}
	
}
