package Lecture_4;

import java.util.Random;

public class ThinOrangeFactory extends AbstractFabric {	
	public Fruit makeFruit() {
		return new Orange(new Random().nextInt(100)+100, new Random().nextInt(4)+1);
	}

	@Override
	public String toString() {
		return "Orange fabric";
	}

}
