import java.util.Random;


public class Task1{
      
    public static void main(String[] args) {
    
        int n=4;    
    
        Fruit[] fruits  = new Fruit[n]; 
   
 
    
        for(int i=0;i<n;i++) {

            fruits[i] = Fruit.getRandomFruit();
            System.out.printf("%s\n", fruits[i]);
        }

    }
}

class Fruit {
    int weight;
    static Random rnd = new Random(System.currentTimeMillis()); 
   
    Fruit() {
        weight =10;
    }
    
    public String toString() {
        return ("weight = "+ weight);
    }
    
    
    public static Fruit getRandomFruit() {

        int n = rnd.nextInt(1000)%3;
        Fruit fruit; 
        
        switch(n) {
            case 0: 
	            fruit = new Apple();
	      	    break;
        	case 1: 
	            fruit = new Orange();
	        	break;
	        case 2: 
	            fruit = new Pineapple();
	         	break;
        	default: 
	            fruit = new Apple();
	            break;
            }

        return fruit;
    }
   
}

// наследуемся от класса Fruit
class Apple  extends Fruit {

    private   String[] colors  = new String[] {"красное", "зеленое", "желтое"};
    String color;
    
    Apple() {
        color = colors[rnd.nextInt(colors.length)];
    }
    
    public String toString() {
        return ("яблоко");
    }
    
}

// наследуемся от класса Fruit
class Orange   extends Fruit {
    
    private   int maxThickness  = 20;
    int skinThickness;
    
    Orange() {
        skinThickness = rnd.nextInt(maxThickness+1);
    }
    
    public String toString() {
        return ("апельсин");
    }
}

// наследуемся от класса Fruit
class Pineapple    extends Fruit {
    private   int maxHeight  = 20;
    private   int minHeight  = 5;
    int tailHeight;
    
    Pineapple() {
        tailHeight =  minHeight + rnd.nextInt(maxHeight - minHeight + 1);
    }
    
    public String toString() {
        return ("ананас");
    }
}
