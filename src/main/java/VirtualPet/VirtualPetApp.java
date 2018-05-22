package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet Penelope = new VirtualPet(50, 10, 100, 50);
		System.out.println("Welcome, my name is Penelope the Penguin." + " Let's play a game.");

			System.out.println("My hunger is at " + Penelope.getHunger());
			System.out.println("My thirst level is " + Penelope.getThirst());
			System.out.println("My playfulness is " + Penelope.getPlay());
			System.out.println("My happiness is " + Penelope.getHappiness() + " . Let's see how happy you can make me today." + " Are you ready to have some fun?"); 
			
		
		String choice;
		do {
			System.out.println("What should we do today?");
			System.out.println("Press 1 to feed");
			System.out.println("Press 2 to give water");
			System.out.println("Press 3 to play");
			System.out.println("Press 4 to exit ");
			choice = input.nextLine();

			if (choice.equals("1")) {
				System.out.println("How much food are you giving me?");
				int hunger = input.nextInt();
				System.out.println("You choose to feed me " + hunger + " fish");
				Penelope.feed(hunger);
				System.out.println("I'm so stuffed! " + Penelope.getHappiness() + " I can't wait to eat again!!");
				input.nextLine();

			} else if (choice.equals("2")) {
				System.out.println("How much water would you like to give me?");
				int thirst = input.nextInt();
				System.out.println("You choose to give me " + thirst + " cups of water.");
				Penelope.drink(thirst);
				System.out.println("I love to stay hydrated! " + Penelope.getHappiness() + " I love water!");
				input.nextLine();

			} else if (choice.equals("3")) {
				System.out.println("Let's play a game, how far can you throw the toy");
				int play = input.nextInt();
				System.out.println("You threw that " + play + " Feet! Wow, that was fun");
				Penelope.swim(play);
				System.out.println("Playtime is my favorite!! " + Penelope.getHappiness() + " I need a nap now.");
				input.nextLine();

			} else if (choice.equals("4")) {
				System.out.println(Penelope.getHappiness()+ " Wow, I am such a happy penguin!");
				System.out.println("Thanks for playing!");
				System.exit(0);

			} else {
				System.out.println("I don't understand your selection. Try again");

			}
			
			Penelope.tick +=1;
			Penelope.tick();		
				

		} while (!choice.equals("4"));
		
			input.close();
			
	}
	}

