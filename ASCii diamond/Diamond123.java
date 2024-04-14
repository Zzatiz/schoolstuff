package diamond;
import java.util.Scanner;

public class Diamond123 {
	public static void main(String[] args) {
		System.out.println("welcome to the diamond creator no moissanites allowed.");
	 	Scanner scan = new Scanner(System.in);
	 	System.out.println("PRESS ANY KEY TO START");
       	scan.nextLine();
       	System.out.println("Please choose the size of your diamond (1-5)");
       	int diamondsize = scan.nextInt();
	
	
       	    for(int i = 0; i < diamondsize; i++)  {
       	        System.out.print(" ");
       	}
   	    System.out.println("^");
   	    
   	    for(int i = 0; i < diamondsize; i ++) {
   	    	
   	    	for(int x = i; x < diamondsize; x++ ) {
   	    	System.out.print("-");
   	    	}
   	    	System.out.print("/-");
   	    	
   	    	for(int x = diamondsize - i; x <diamondsize; x++ ) {
   	    		System.out.print("--");
   	    	}
   	    	System.out.println("\\");
   	    }
       	
   	    for(int i = 0; i < diamondsize; i++ ) {
   	    	System.out.print("-");
   	    }
   	    System.out.print("\\-");
   	    for(int x = diamondsize; x < diamondsize; x++ ) {
   	    	System.out.print("--");
   	    }
   	 System.out.println("/");
	
		for(int i = 0; i < diamondsize + 1; i++ ) {
		System.out.print(" ");
		}
	System.out.println("v");
}
}
