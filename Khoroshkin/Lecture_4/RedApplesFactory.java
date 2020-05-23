package Lecture_4;

import java.util.Random;

public class RedApplesFactory extends AbstractFabric{
	public Fruit makeFruit() {
		return new Apple(new Random().nextInt(100)+100, "red");
	}
	
	@Override
	public String toString() {
		return "Red apple fabric";
	}
}
