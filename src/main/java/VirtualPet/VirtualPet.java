package VirtualPet;

public class VirtualPet {

	private int hunger;
	private int thirst;
	private int play;
	
	public VirtualPet(int hunger, int thirst, int play) {
	 this.hunger = hunger;	
	 this.thirst = thirst;
	 this.play = play;
	 
	}

	public int getHunger() {
		
		return hunger;
	}

	public void feed(int feed) {
	
		hunger -=15;
			
		}

	public void PlayTime(int playTime) {
		hunger += 25;
	}

	public int getThirst() {
		
		return thirst;
	}

	public void drink(int drink) {
		thirst-=drink;
		
	}

	public int getPlay() {
		
		return play;
	}

	public void swim(int swim) {
		
		play -= swim;
		
		
		
		
	}

	public void tick() {
		hunger += 15;
		thirst += 5;
		play += 50;
		
		
				
		
	}

	
	}
		
	


