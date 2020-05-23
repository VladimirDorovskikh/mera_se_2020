package Lecture_4;

import java.util.Random;

public class LongPineapplesFactory extends AbstractFabric{
	public Fruit makeFruit() {
		return new Pineapple(new Random().nextInt(100)+100, new Random().nextInt(50)+10);
	}
	
	@Override
	public String toString() {
		return "Longtail Pineapple fabric";
	}	

}
