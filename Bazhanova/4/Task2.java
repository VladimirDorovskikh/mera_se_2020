import java.util.Random;


public class Task2{
      
    public static void main(String[] args) {
    

        
        
        int num=10; 
        int nn;
      
        AbstractFabric[] fabrics = new AbstractFabric[num];
      
        Random rnd1 = new Random(System.currentTimeMillis());
        
        for(int i=0;i<num;i++) {
            nn = rnd1.nextInt(1000)%4;   
        
            switch(nn) {
                case 0: 
	                fabrics[i] = new ThinOrangeFactory();
	      	        break;
              	case 1: 
	                fabrics[i] = new RedApplesFactory();
	            	break;
	            case 2: 
	                fabrics[i] = new GreenApplesFactory();
	             	break;
            	default: 
	                fabrics[i] = new LongPinepplesFactory();
	                break;
            }
        }
        
        
        
        int n=20;    
    
        Fruit[] fruits  = new Fruit[n]; 
   
 
    
        for(int i=0;i<num;i++) {

            fruits[i*2] = fabrics[i].makeFruit();
            fruits[i*2+1] = fabrics[i].makeFruit();
            System.out.printf("fruits[%d] = %s\n", i*2, fruits[i*2]);
            System.out.printf("fruits[%d] = %s\n", i*2+1, fruits[i*2+1]);
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
    
    
    Apple(String col) {
        color = col;
    }
    
    public String toString() {
        return ("яблоко"+ " " +color);
    }
    
}

// наследуемся от класса Fruit
class Orange   extends Fruit {
    
    private   int maxThickness  = 20;
    
    int skinThickness;
    
    Orange() {
        skinThickness = rnd.nextInt(maxThickness+1);
    }
    
    Orange(int min, int max) {
        skinThickness =  min + rnd.nextInt(max - min + 1);
    }
    
    public String toString() {
        return ("апельсин"+ " " + skinThickness);
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
    
    
    Pineapple(int min) {
        tailHeight =  min + rnd.nextInt(maxHeight - min + 1);
    }
    
    
    public String toString() {
        return ("ананас"+ " " + tailHeight);
    }
}
///////////////////////////////////////
abstract class AbstractFabric  {
     
    
    public abstract Fruit makeFruit(); 
}


class ThinOrangeFactory  extends AbstractFabric {
    
    private   int maxThickness  = 5;
    private   int minThickness  = 1;


    
    public Fruit makeFruit() {
        return  new Orange(minThickness, maxThickness);
    }
} 


class RedApplesFactory   extends AbstractFabric {
    
    private  String color = "красное";

    public Fruit makeFruit() {
        return  new Apple(color);
    }
} 

class GreenApplesFactory    extends AbstractFabric {
    
    private  String color = "зеленое";

    public Fruit makeFruit() {
        return  new Apple(color);
    }
} 

class LongPinepplesFactory   extends AbstractFabric {
    
    private   int minThickness  = 10;

    public Fruit makeFruit() {
        return  new Pineapple(minThickness);
    }
}  

