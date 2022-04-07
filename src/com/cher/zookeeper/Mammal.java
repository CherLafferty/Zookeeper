package com.cher.zookeeper;

public class Mammal {
//Create a Mammal class that has an energyLevel member 
	
	//MEMBER VARIABLES
	private int energyLevel;
	
	//CONSTRUCTORS
	public Mammal() {
		this.energyLevel = 50;
	}
	
	public Mammal(int energy) {
		this.energyLevel = energy;
	}

	
	//METHODS
	// The displayEnergy() method should show the animal's energy level as well as return it
	public int displayEnergy() {
		System.out.println(energyLevel);
		return energyLevel;
	}
	
	
	//GETTERS & SETTERS
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

}
