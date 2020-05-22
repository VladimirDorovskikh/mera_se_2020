package Lecture_4;

import java.util.Random;

public class GreenApplesFactory extends AbstractFabric{
	public Fruit makeFruit() {
		return new Apple(new Random().nextInt(100)+100, "green");
	}
	
	@Override
	public String toString() {
		return "Green apple fabric";
	}	

}
