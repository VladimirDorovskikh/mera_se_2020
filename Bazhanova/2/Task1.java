import java.util.Random;
 
public class Task1{
   
 
   
  public static void main(String []args){
 
       
    int N = 10;
    int[] array = new int[N];  
 
    Random rand = new Random();
    int min=60;
    int id_min = 0;
    int sum =0;
 
    
   
   //Заполнение массива случайными числами и их вывод 
   System.out.print("mass= ");
           
    for (int i = 0; i < array.length; i++) {
        array[i] = rand.nextInt(50);
        sum = sum + array[i];
        System.out.print(array[i]);
        System.out.print(" ");
       
        if(array[i]<min) {
            min = array[i];
            id_min = i;
        }           
    }
   
    System.out.println("");
    //Вывод  суммы элементов масиива
    System.out.println("sum= "+sum);
    
    //Вывод  минимального элемента масиива и его номер ячейки 
    System.out.println("min= "+min+ ", id= "+id_min);
 
     }
}
 
