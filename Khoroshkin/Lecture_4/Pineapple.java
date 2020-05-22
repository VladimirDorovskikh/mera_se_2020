package Lecture_4;

import Lecture_4.Fruit;

public class Pineapple extends Fruit {

	private int height;
	

	public Pineapple(int weight, int height) {
		super(weight);
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "Pineapple: weight" + " " + super.weight + " " + this.height;
	}
	
}
