import java.util.Scanner;

public class Madlibs {
    public static void main(String[] args) {
       	Scanner scan = new Scanner(System.in);
    	
       	System.out.println("Hello please fill in the following madlibs blank spaces in numbered order");
       	System.out.println("PRESS ANY KEY TO START");
       	scan.nextLine();
       	
    	System.out.println("Today I went to the zoo. I saw a(n) \r\n" + 
    			"1.(adjective)\r\n" + 
    			"2.(Noun) jumping up and down in its tree. \r\n" + 
    			"He 3.(verb, past tense) 4.(adverb) \r\n" + 
    			"through the large tunnel that led to its 5.(adjective) \r\n" + 
    			"6.(noun). I got some peanuts and passed \r\n" + 
    			"them through the cage to a gigantic gray __7._(noun)\r\n" + 
    			"towering above my head. Feeding that animal made \r\n" + 
    			"me hungry. I went to get a 8.(adjective) scoop \r\n" + 
    			"of ice cream. It filled my stomach. Afterwards I had to \r\n" + 
    			"9.(verb) 10. (adverb) to catch our bus. \r\n" + 
    			"When I got home I 11.(verb, past tense) my \r\n" + 
    			"mom for a 12. (adjective) day at the zoo.");
    	
    	System.out.println("1. ");
    	String one = scan.nextLine();
    	
    	System.out.println("2. ");
    	String two = scan.nextLine();
    	
    	System.out.println("3. ");
    	String three = scan.nextLine();
    	
    	System.out.println("4. ");
    	String four = scan.nextLine();
    	
    	System.out.println("5. ");
    	String five = scan.nextLine();
    	
    	System.out.println("6. ");
    	String six = scan.nextLine();
    	
    	System.out.println("7. ");
    	String seven = scan.nextLine();
    	
    	System.out.println("8. ");
    	String eight = scan.nextLine();
    	
    	System.out.println("9. ");
    	String nine = scan.nextLine();
    	
    	System.out.println("10. ");
    	String ten = scan.nextLine();
    	
    	System.out.println("11. ");
    	String eleven = scan.nextLine();
    	
    	System.out.println("12. ");
    	String twelve = scan.nextLine();
    	
    	System.out.println("Today I went to the zoo. I saw a(n) \r\n" + 
    			"_"+ one +"_(adjective)\r\n" + 
    			"__"+ two +"__(Noun) jumping up and down in its tree. \r\n" + 
    			"He _"+ three +"_(verb, past tense) _"+ four +"__(adverb) \r\n" + 
    			"through the large tunnel that led to its __"+ five +"_(adjective) \r\n" + 
    			"_"+ six +"__(noun). I got some peanuts and passed \r\n" + 
    			"them through the cage to a gigantic gray _"+ seven +"_(noun)\r\n" + 
    			"towering above my head. Feeding that animal made \r\n" + 
    			"me hungry. I went to get a __"+ eight +"_(adjective) scoop \r\n" + 
    			"of ice cream. It filled my stomach. Afterwards I had to \r\n" + 
    			"_"+ nine +"__(verb) _"+ ten +"_ (adverb) to catch our bus. \r\n" + 
    			"When I got home I _"+ eleven +"__(verb, past tense) my \r\n" + 
    			"mom for a __"+ twelve +"__(adjective) day at the zoo.");
    	System.out.println("THANK YOU CLOSE ME");

    }
    }