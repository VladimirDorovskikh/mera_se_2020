package Lecture_4;
import java.util.Random;


public class Fruit {
	Random rand = new Random();	
	protected int weight;
	

    public Fruit(int weight) {
		super();
		this.weight = weight;
	}

    
	@Override
	public String toString() {
		return "Fruit: weight " +weight;
	}
	
	
	public static Fruit getRandomFruit() {
	    int randomFruit = new Random().nextInt(3);
		Fruit fruit;
		if (randomFruit == 0) {
			String[] color= new String[] {"Red", "Green", "Yellow"};
            fruit = new Apple(new Random().nextInt(100)+100, color[new Random().nextInt(2)]);
        }
        else if (randomFruit == 1) {
            fruit = new Orange(new Random().nextInt(100)+100, new Random().nextInt(20));
        }
        else {        	
            fruit = new Pineapple(new Random().nextInt(100)+100, new Random().nextInt(15)+5);
        }

        return fruit;
	}


	public static void main(String[] args) {
		Fruit [] Array = new Fruit[40];
		for (int i = 0; i < 40; i++) {
			Array[i] = getRandomFruit();
			System.out.println(Array[i]);
		}
	}



	
	
	
	
}