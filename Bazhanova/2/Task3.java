import java.util.Random;
 
public class Task3{
   
 
   
  public static void main(String []args){
 
       
    int N = 7;
    int[] array1 = new int[N];  
    int[] array2 = new int[N]; 
    int[] array3 = new int[N];
    
    int number;
    
    
    Random rand = new Random();
    int i=0;
 
   // заполняем 1 массив
    while (i<7) {
        number = rand.nextInt(); 
        if(number > 0) {
        array1[i] = number;
        i+=1;
        }
    }
    
    i=0;
    
   // заполняем 2 массив 
    while (i<7) {
        number = rand.nextInt(); 
        if(number < 0) {
        array2[i] = number;
        i+=1;
        }
    }
    
    
   
   // выводим 1 массив    
    System.out.print("array1= ");
    for (int j = 0; j < array1.length; j++) {
        System.out.print(array1[j]);
        System.out.print(" ");
        
    }
    
    System.out.println("");
        
   
   // выводим 2 массив 
    System.out.print("array2= ");
    for (int j = 0; j < array2.length; j++) {
        System.out.print(array2[j]);
        System.out.print(" ");
       
    }

    System.out.println("");

   // заполняем и выводим 3 массив    
    System.out.print("array3= ");
    for (int j = 0; j < N; j++) {
        array3[j]= array1[j]+ array2[j];
        System.out.print(array3[j]);
        System.out.print(" ");
       
    }
   
    }
}
 
