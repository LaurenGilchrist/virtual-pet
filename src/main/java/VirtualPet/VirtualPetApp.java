package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		VirtualPet myVirtualPet = new VirtualPet(100,10,100);
	
		String choice;
		
		System.out.println("Welcome, my name is Penelope the Penguin." + " Let's play a game.");
		System.out.println("Choose an option.");
		System.out.println("Press 1 feed options");
		System.out.println("Press 2 drink options");
		System.out.println("Press 3 to play");
		System.out.println("Press 4 to exit " + "thanks for playing.");
	    choice = input.nextLine();
		
	    if (choice.equals ("1")) {
	    	System.out.println("How much food are you giving me?");
	    	int hunger = input.nextInt();
	    	System.out.println("You choose to feed me " + hunger + " fish" );
	    	myVirtualPet.feed(hunger);
	    	input.nextLine();
	    	
	    }else if (choice.equals ("2")) {
	    	System.out.println("How much water would you like to give me?");
	    	int thirst = input.nextInt();
	    	System.out.println("You choose to give me " + thirst + "of water");
	    	myVirtualPet.drink(thirst);
	    	input.nextLine();
	    	
	    }
		}
		
	}
	
	    	

	    	
	    
	    	
	    
		
	


		
		
		

		
		
		
		
			
		
	


