package VirtualPetTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import VirtualPet.VirtualPet;

public class VirtualPetTest {

	@Test
	public void shouldHaveADefaultHungerOf50() {
		VirtualPet underTest = new VirtualPet(50, 0, 0,0);
		int check = underTest.getHunger();
		assertEquals(50, check);

	}

	@Test
	public void shouldHaveADefaultHungerOf100() {
		VirtualPet underTest = new VirtualPet(100, 0, 0,0);
		int check = underTest.getHunger();
		assertEquals(100, check);

	}
	
	@Test
	public void shouldHaveHungerOf35AfterFeedOf15() {
		VirtualPet underTest = new VirtualPet(50, 0, 0,0);
		underTest.feed(15);
		int check = underTest.getHunger();
		assertEquals(35, check);
		
	}
	@Test
	public void shouldHaveHungerof65AfterTick() {
		VirtualPet underTest = new VirtualPet(50,0,0,0);
		underTest.tick();
		int check = underTest.getHunger();
		assertEquals(65, check);
		
	}
	@Test
	public void shouldHaveHungerOf75AfterPlayTime() {
		VirtualPet underTest = new VirtualPet(50, 0, 0,0);
		underTest.PlayTime(75);
		int check = underTest.getHunger();
		assertEquals(75, check);
		
	}
	
	@Test 
	public void shouldHaveADefaultThirstOf10() {
		VirtualPet underTest = new VirtualPet(0, 10, 0,0);
		int check = underTest.getThirst();
		assertEquals(10, check);
	}
	
	@Test
	public void shouldHaveThirstof5AfterDrinkOf5() {
		VirtualPet underTest = new VirtualPet(0,10,0,0);
		underTest.drink(5);
		int check = underTest.getThirst();
		assertEquals(5, check);
		
	}
	@Test
	public void shouldHaveThirstOf15AfterTick() {
		VirtualPet underTest = new VirtualPet(0,10,0,0);
		underTest.tick();
		int check = underTest.getThirst();
		assertEquals(15, check);
	}
	
	@Test
	public void shouldHaveDefaultPlayOf100() {
		VirtualPet underTest = new VirtualPet(0,0,100,0);
		int check = underTest.getPlay();
		assertEquals(100, check);
		
	}
	@Test
	public void shouldHavePlayof50AfterSwimOf50() {
		VirtualPet underTest = new VirtualPet(0,0,100,0);
		underTest.swim(50);
		int check = underTest.getPlay();
		assertEquals(50, check);
	}
	
	@Test
	public void shouldHavePlay150AfterTick() {
		VirtualPet underTest = new VirtualPet(0,0,100,0);
		underTest.tick();
		int check = underTest.getPlay();
		assertEquals(150, check);
	}
	
	@Test
	public void shouldHaveDefaultHappinessOf50() {
		VirtualPet underTest = new VirtualPet(0,0,0,50);
		int check = underTest.getHappiness();
		assertEquals(50, check);
	}
	
	@Test
	public void shouldHaveHappinessOf100AfterDrink() {
		VirtualPet underTest = new VirtualPet(0,0,0,100);
		int check = underTest.getHappiness();
		assertEquals(100, check);
		
	}
	@Test 
	public void shouldHaveHappinessOf150AfterSwim() {
		VirtualPet underTest = new VirtualPet(0,0,0,150);
		int check = underTest.getHappiness();
		assertEquals(150, check);
	}
	
	}


