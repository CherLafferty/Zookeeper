package com.cher.zookeeper;

public class GorillaTest {
//Create a GorillaTest class to instantiate a gorilla 
	public static void main(String[] args) {
//		System.out.println("Test Print");
		Mammal mammal = new Mammal();
		mammal.displayEnergy();
		
		Gorilla koko = new Gorilla();
		koko.displayEnergy();
		koko.throwSomething();
		koko.eatBananas();
		koko.climb();
		koko.climb();
		koko.displayEnergy();
		
		Bat rabbidRandy = new Bat();
		System.out.println("*****************");
		rabbidRandy.displayEnergy();
		rabbidRandy.attachTown();
		rabbidRandy.fly();
		rabbidRandy.eatHumans();
		rabbidRandy.eatHumans();
		rabbidRandy.displayEnergy();

	}

}
