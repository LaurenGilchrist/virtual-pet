package VirtualPet;

import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPet Penelope = new VirtualPet(50, 10, 100, 50);
		System.out.println("Welcome, my name is Penelope the Penguin." + " Let's play a game.");
System.out.println("	        a8888b.   ");
System.out.println("           d888888b.  ");
System.out.println("           8P YP Y88   ");
System.out.println("           8|o||o|88    ");
System.out.println("           8'    .88     ");
System.out.println("           8`._.' Y8. 	");
System.out.println("          d/      `8b.  ");
System.out.println("         dP   .    Y8b. ");
System.out.println("        d8:'     `::88b ");
System.out.println("       d8"         'Y88b  "); 
System.out.println("      :8P    '      :888 ");
System.out.println("       8a.   :     _a88P ");
System.out.println("     ._/"Yaa_:   .| 88P| ");
System.out.println("jgs  \    YP"    `| 8P  `. ");
System.out.println("a:f  /     \.___.d|    .'    ");
System.out.println("     `--..__)8888P`._.'     ");

		while (Penelope.getHappiness() <=200) {

			Penelope.tick += 1;

			System.out.println("My hunger is at " + Penelope.getHunger() + ", my thirst level is " + Penelope.getThirst()
					+ ", my playfulness is " + Penelope.getPlay() + ".");
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
				input.nextLine();

			} else if (choice.equals("2")) {
				System.out.println("How much water would you like to give me?");
				int thirst = input.nextInt();
				System.out.println("You choose to give me " + thirst + " cups of water.");
				Penelope.drink(thirst);
				input.nextLine();

			} else if (choice.equals("3")) {
				System.out.println("Let's play a game, how far can you throw the toy");
				int play = input.nextInt();
				System.out.println("You threw that " + play + " Feet! Wow, that was fun");
				Penelope.swim(play);
				input.nextLine();

			} else if (choice.equals("4")) {
				System.out.println("Thanks for playing!");
				System.exit(0);

			} else {
				System.out.println("I don't understand your selection. Try again");

			}
		} while (!choice.equals("4"));

	}
	}
}
