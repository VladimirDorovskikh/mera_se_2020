package Lecture_5;

import java.util.Random;

public class Circle extends Figure{

	double radius;

	public Circle() {
		radius = new Random().nextInt(9)+1;
	}


	@Override
	public double square() {
		return 3.14*radius*radius;
	}

	public String toString(){
		return "Circle - square =" + " " +square();
	}

}
