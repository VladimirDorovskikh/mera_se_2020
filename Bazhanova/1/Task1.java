import java.util.Random;
 
public class Task1{
   

  public static void main(String []args){
    
    Integer a;
    Integer b;
    
    Random rand = new Random();
        
    a=rand.nextInt(100);
    b=rand.nextInt(100);;
   
    if(a>b)
        System.out.println( "Число " + a + " больше " + b);
        
    else
        System.out.println( "Число " + a + " меньше " + b);  
        
        
    System.out.println( "Сумма чисел равна " + (a + b)); 
   
    }
}
 
