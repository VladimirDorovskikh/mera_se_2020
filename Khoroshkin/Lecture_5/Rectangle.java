package Lecture_5;

import java.util.Random;

public class Rectangle extends Figure{
	double width;
	double height;

	public Rectangle() {
		height = new Random().nextInt(19)+1;
		width = new Random().nextInt(19)+1;
	}

	@Override
	public double square() {
		return height * width;
	}

	public String toString(){
		return "Rectangle - square =" + " " + square();
	}
}
