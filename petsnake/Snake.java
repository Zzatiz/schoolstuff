package club.westcs.petproject;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Snake {
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	private Dice rattleDice, biteDice, hissDice, slitherDice, shedDice;
	private String petname;
	private String mastername;
	private boolean alive,  dead;
	private int hunger = 100;
	private int health = 100;
	public int length = rand.nextInt(10);
	public int teeth = rand.nextInt(10);
	public int statboost = length + teeth;
	public int subtractor = rand.nextInt(25) + 10;
	private Stopwatch Deathwatch;
	
	private String[] snakethings = {"1. Shed ", "2. Slither ", "3. Hiss ", "4. Bite ", "5. Rattle "};
 
	public Snake() { 
		 rand = new Random();
		 scan = new Scanner(System.in);
		 shedDice = new Dice();
		 Deathwatch = new Stopwatch();
		 Deathwatch.start();
		setPetname();
		setmasterNames();
		length();
		teeth();
		statroll();
		Gamestart();
	}
	
	public void displaystats() {
	
	hunger = getHunger();
	System.out.println("	Snake hunger level :	" + hunger);
	System.out.println();

	health = getHealth();
	System.out.println("	Snake health level :	" + health);
	System.out.println();
	
	isAlive();
	
	}
	

	public void setPetname() {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Welcome to the snake pet creator");
		System.out.println("Please pick a name for your snake");
		 this.petname = scan.nextLine(); 
	}
	public String getPetname() {
		return petname;
	}

	public void setmasterNames() {
		System.out.println("What will " + petname + "'s master be named?");
		mastername = scan.nextLine();
		System.out.println(mastername + "'s pet snake named " + petname);
		System.out.println("Stats will give you extra time before death, the higher stats you have the longer you can win.");
		System.out.println("Time for stats:");
			}
		public void length() {
			System.out.println(petname + " is " + length + " out of 10 inches long.");
		}
	
		public void teeth() {
				System.out.println(petname + " has " + teeth + " out of 10 teeth.");
			}
			
	
	public void statroll() {
		System.out.println("Roll again? press 1 for yes press 2 for No");
		int answertostat = scan.nextInt();
		if(answertostat == 1) {
			length();
			teeth();
			statroll();
		} 
		
		else 
			System.out.println("Okay time to start fighting the world as a snake.");
		System.out.println("Now that your snake is created, what will " + petname + " do today?");

		
	}
	
	public void Gamestart() {
		displaystats();

		System.out.println("STOPWATCH STARTED");
		System.out.println("Take a chance at doing any of these snake things to survive longer, if failed you loose health.");
		
		System.out.println(snakethings[0]);
		System.out.println(snakethings[1]);
		System.out.println(snakethings[2]);
		System.out.println(snakethings[3]);
		System.out.println(snakethings[4]);
		
		int answeraction = scan.nextInt();
		if(answeraction > 5) {
			System.out.println("Sorry numbers 1-5 only please.");
			System.out.println("PLEASE PRESS TO TRY AGAIN");
			scan.next();
			Gamestart();
		}
		if(answeraction == 1) {
			shedDice.roll(); 
				if(shedDice.roll()) {
					System.out.println(petname + " has shed. Congrats you survive to the next round.");
					Gamestart();
				}
				else {
					System.out.println(petname + "did not shed and had a " + shedDice.getChance() + " chance to, now " + petname + " will loose health and food");
					setHunger(hunger);
					setHealth(health);
					
					displaystats();
					//timeDecay();
					System.out.println("Continue?");
					scan.next();
					Gamestart();
			}
			
		}
		
		if(answeraction == 2) {
			shedDice.roll(); 
				if(shedDice.roll()) {
					System.out.println(petname + " has slithered. Congrats you survive to the next round.");
					Gamestart();
				}
				else {
					System.out.println(petname + "did not slther right and had a " + shedDice.getChance() + " chance to, now " + petname + " will loose health and food");
					setHunger(hunger);
					setHealth(health);
					
					displaystats();
					//timeDecay();
					System.out.println("Continue?");
					scan.next();
					Gamestart();
			}
		}
		
		if(answeraction == 3) {
			shedDice.roll(); 
				if(shedDice.roll()) {
					System.out.println(petname + " has hissed. Congrats you survive to the next round.");
					Gamestart();
				}
				else {
					System.out.println(petname + "did not hiss right and had a " + shedDice.getChance() + " chance to, now " + petname + " will loose health and food");
					setHunger(hunger);
					setHealth(health);
					
					displaystats();
					//timeDecay();
					System.out.println("Continue?");
					scan.next();
					Gamestart();
			}
		}
		if(answeraction == 4) {
			shedDice.roll(); 
				if(shedDice.roll()) {
					System.out.println(petname + " has bit its prey. Congrats you survive to the next round.");
					Gamestart();
				}
				else {
					System.out.println(petname + "did not bite its prey and had a " + shedDice.getChance() + " chance to, now " + petname + " will loose health and food");
					setHunger(hunger);
					setHealth(health);
					
					displaystats();
					//timeDecay();
					System.out.println("Continue?");
					scan.next();
					Gamestart();
			}
		}
		if(answeraction == 5) {
			shedDice.roll(); 
				if(shedDice.roll()) {
					System.out.println(petname + " has rattled. Congrats you survive to the next round.");
					Gamestart();
				}
				else {
					System.out.println(petname + "did not rattle and had a " + shedDice.getChance() + " chance to, now " + petname + " will loose health and food");
					setHunger(hunger);
					setHealth(health);
					
					displaystats();
					//timeDecay();
					System.out.println("Continue?");
					scan.next();
					Gamestart();
			}
		}
	}

	public void isAlive() {
			if((this.hunger <= 0 || this.health <= 0) && this.alive) {
				this.alive = false;
				setLife(false);
				die();
				System.out.flush();
				relive();
				}
				else {
					live();
					setLife(true);
				}
		}

		public void setLife(boolean alive) {
			if(this.alive = true) {
				live();
			}
			else {
				die();
				
				System.out.flush();
				relive();
			}
		}

		public int getHunger() {
			return hunger;
		}

			public void setHunger(int hunger) {
				if(this.alive == true) {
				int subtractor = rand.nextInt(25) + 10;
				int sum = subtractor - statboost;
				this.hunger -= sum;
				System.err.println(subtractor + " POINTS OF HUNGER TAKEN");
				if(statboost > 1) {
					System.out.println("Congrats your stats combined to have saved you " + statboost + " points of hunger.");
					}
				}
			}

		public int getHealth() {
			return health;
		}

			public void setHealth(int health) {
				if(this.alive == true) {
			int subtractor = rand.nextInt(25) + 10;
			int sum = subtractor - statboost;
			this.health -= sum;
			System.err.println(subtractor + " POINTS OF HEALTH TAKEN");
			if(statboost > 1) {
				System.out.println("Congrats your stats have combined to saved you " + statboost + " points of health damage.");
			
				if(this.hunger <= 30) {
				this.health -= rand.nextInt(11);
				System.out.println(this.petname + " is dying.");
				}
			}
		}
			}
		
		public void live() {
			while(this.alive) {
				System.out.println("		" + petname + " is still alive");
				break;
			}
			
		}
		
		public void die() {
			this.alive = false;
			setLife(false);
			System.err.println(this.petname + " is dead");
			System.err.println("GAME OVER");
			//Deathwatch.stop();
			long DeathTime = Deathwatch.getElapsedTime();
			System.out.println(petname + " lived for " + DeathTime + " seconds.");
		}

		public String getMastername() {
			return mastername;
		}

			public void setMastername(String mastername) {
			this.mastername = mastername;
		}
		public void relive() {
			System.out.println("Would you like a new snake? (yes/no");
			if(scan.nextLine().toLowerCase().contains("yes")) {
				new Snake();
				
			}
		}
}