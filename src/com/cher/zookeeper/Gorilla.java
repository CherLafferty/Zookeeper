package com.cher.zookeeper;

public class Gorilla extends Mammal {
//Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
	
	//CONSTRUCTOR
	public Gorilla() {
		super();
	}
	
	//METHODS
	public void throwSomething() {
		// print out a message indicating that the gorilla has thrown something
		System.out.println("The gorilla has thrown something.");
		//as well as decrease the energy level by 5
		this.setEnergyLevel(getEnergyLevel() -5);
	}
	
	public void eatBananas() {
		//print out a message indicating the gorilla's satisfaction
		System.out.println("The gorilla is rubbing the tummy with a smile.");
		// increase its energy by 10
		this.setEnergyLevel(getEnergyLevel() + 10);
	}
	
	public void climb() {
		// print out a message indicating the gorilla has climbed a tree
		System.out.println("The gorilla has climbed a tree.");
		// decrease its energy by 10
		this.setEnergyLevel(getEnergyLevel() - 10);
	}
	
}
