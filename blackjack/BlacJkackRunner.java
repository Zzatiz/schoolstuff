package BlackJack;


public class BlacJkackRunner {
	
	
	public static void main(String[] args) {
	//GameLogic game = new GameLogic();
	deck deckkk;
	deckkk = new deck();
	GameLogic Game;
	Game = new GameLogic();
	//game.runGame();
	deckkk.playerDeck();
	Game.setName();
	Game.runGame();
	
	}
}
