import java.util.Random;


public class Task2{
      
    public static void main(String[] args) {
        
        SequentialRandom rand0 = new SequentialRandom();
        System.out.printf("rand0 = %d\n", rand0.getNum());
        
        SequentialRandom rand1 = new SequentialRandom();
        System.out.printf("rand1 = %d\n", rand1.getNum());
        
        SequentialRandom rand2 = new SequentialRandom();
        System.out.printf("rand2 = %d\n", rand2.getNum());
        
        SequentialRandom.resetRandom();
        
        SequentialRandom rand3 = new SequentialRandom();
        System.out.printf("rand3 = %d\n", rand3.getNum());  
        
        SequentialRandom rand4 = new SequentialRandom();
        System.out.printf("rand4 = %d\n", rand4.getNum());  
        
    }
}

class SequentialRandom {

    static Random rnd = new Random(System.currentTimeMillis()); 
    
    static int counter = rnd.nextInt(1000);
    private int num = counter;
    
    SequentialRandom()
    {
     num = counter++;    
    }

    public int getNum() {
    return num;
   }
   
   public static void resetRandom() {
    counter = rnd.nextInt(1000);
   }
   
}
