package Lecture_4;

import Lecture_4.Fruit;

public class Apple extends Fruit {
	
	    private String color;
	
	
		Apple(int weight, String color) {
	    	super(weight);
		    this.color = color;
	}


    	@Override
		public String toString() {
			return "Apple: weight" + " " + super.weight + " " + this.color;
		}


}
