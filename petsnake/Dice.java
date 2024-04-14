package club.westcs.petproject;
import java.util.Random;

public class Dice<Method> {
	
	private Random rand;
	private double chance;
	
	String survived = "survived";
	String damaged = "damaged";

	public Dice() {
		rand = new Random();
		chance = 1.0;
	}
	
	
	public boolean roll() {
		int val = rand.nextInt(6) + 1;
		if(this.chance >= val) {
			if(this.chance > 6 ) {
				this.chance++;
			}
			return true;
		}
		return false;
	}
	
	
	public String getChance() { 
		int num = (int) ((this.chance/ 6.0)*100);
		return num + "%";
	}
}
