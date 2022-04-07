package com.cher.zookeeper;

public class Bat extends Mammal {
//Create a Bat class that can fly(), eatHumans(), and attackTown()
	
	//CONSTRUCTOR
	public Bat() {
		// and has a default energy level of 300	
		super(300);
	}
	
	//METHODS
	//For the fly() method 
	public void fly() {
		//print the sound a bat taking off 	
		System.out.println("Whip-Whip-Swoosh");
		//and decrease its energy by 50		
		this.setEnergyLevel(getEnergyLevel() - 50);
	}
	
	//For the eatHumans() method
	public void eatHumans() {
		System.out.println("You look tasty");
		//increase its energy by 25
		this.setEnergyLevel(getEnergyLevel() + 25);
	}
	
	//For the attackTown() method
	public void attachTown() {
		// print the sound of a town on fire
		System.out.println("crackle-pop-sizzle");
		//decrease its energy by 100
		this.setEnergyLevel(getEnergyLevel() - 100);
	}
	
}
