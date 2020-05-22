package Lecture_4;

import java.util.Arrays;
import java.util.Random;


public abstract class AbstractFabric {
	
	public abstract Fruit makeFruit();
	
	public static AbstractFabric getRandomFabric() {
		
			AbstractFabric randomFabric;
			
			int random = new Random().nextInt(4);
			
		    if (random == 0) {
		    	randomFabric = new ThinOrangeFactory();
	        }
	        else if (random == 1) {
	        	randomFabric = new RedApplesFactory();
	        }
	        else if (random == 2){        	
	        	randomFabric = new GreenApplesFactory();
	        }
	        else {        	
	        	randomFabric = new LongPineapplesFactory();
	        }

		    return randomFabric;
		}
	    
	    
	public static void main(String[] args) {
		
		AbstractFabric [] randomFabric = new AbstractFabric[10];
		
        for (int i = 0; i < randomFabric.length; i++) {
        	randomFabric[i] = getRandomFabric();
        }
		
        Fruit[] fruitArray = new Fruit[20];
        
        for (int i = 0; i < fruitArray.length; ) {
            for (AbstractFabric Fabric : randomFabric) {
                for (int j = 0; j < 2; j++, i++) {
                	fruitArray[i] = Fabric.makeFruit();
                }
                System.out.println(Arrays.toString(fruitArray));
            }
        }

        
        
	    
}
}

