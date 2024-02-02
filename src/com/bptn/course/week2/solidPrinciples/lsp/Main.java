package com.bptn.course.week2.solidPrinciples.lsp;


class Bird {
    void fly() {
        System.out.println("This bird can fly");
    }
}

class Penguin extends Bird {
    void fly() {
        System.out.println("Penguins can't fly");
    }
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*In this design, substituting a Bird object with a Penguin object would lead to runtime errors 
 * if the fly method is called, which violates LSP. A penguin is a bird, but it cannot fly, 
 * which breaks our program's correctness when substituting Bird with Penguin.
 */