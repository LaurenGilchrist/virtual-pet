package VirtualPet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int play;
	
	private int happiness;
	
	public VirtualPet(int hunger, int thirst, int play, int happiness) {
	 this.hunger = hunger;	
	 this.thirst = thirst;
	 this.play = play;
	 this.happiness = happiness;
	}

	public int getHunger() {
		
		return hunger;
	}

	public void feed(int feed) {
	
		hunger -=15;
		happiness +=25;
			
		}

	public void PlayTime(int playTime) {
		hunger += 25;
		thirst += 5;
		happiness +=50;
		
	}

	public int getThirst() {
		
		return thirst;
	}

	public void drink(int drink) {
		thirst-=drink;
		happiness +=15;
	}

	public int getPlay() {
		
		return play;
	}

	public void swim(int swim) {
		
		play -= swim;
		happiness +=50;
		
		
		
	}

	public void tick() {
		hunger += 15;
		thirst += 5;
		play += 50;
		
		
		
				
		
	}

	public int getHappiness() {
		
		return happiness;
	}

	
	}
		
	


