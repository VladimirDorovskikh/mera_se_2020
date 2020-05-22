package Lecture_4;

import Lecture_4.Fruit;

public class Orange extends Fruit {
	
	private int thickness;
	

	public Orange(int weight, int thickness) {
		super(weight);
		this.thickness = thickness;
	}


	@Override
	public String toString() {
		return "Orange: weight" + " " + super.weight + " " + this.thickness;
	}

}
