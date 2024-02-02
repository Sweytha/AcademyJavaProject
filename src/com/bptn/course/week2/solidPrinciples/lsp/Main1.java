package com.bptn.course.week2.solidPrinciples.lsp;

interface BirdInterface {
    void eat();
}

interface FlyingBirdInterface {
    void fly();
}

class Sparrow implements BirdInterface, FlyingBirdInterface {
    public void eat() {
        System.out.println("Sparrow is eating");
    }

    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

class PenguinClass implements BirdInterface {
    public void eat() {
        System.out.println("Penguin is eating");
    }
}

public class Main1 {

	public static void main(String[] args) {
		

	}

}
/*In this revised design, both Sparrow and Penguin are birds, so they 
both implement the Bird interface, which includes behaviors common to all birds, 
such as eating. However, only birds that can fly, like the Sparrow, implement the FlyingBird interface. 
This design allows objects of Sparrow to be substituted for Bird without any issues, 
adhering to the Liskov Substitution Principle.*/