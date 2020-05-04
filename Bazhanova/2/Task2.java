import java.util.Random;
import java.util.ArrayList; // import the ArrayList class


public class Task2{

public static void main(String[] args) {
    
    int num=5;
    // Создаем новый список
    ArrayList<Integer> arrayList = new ArrayList<>(num);
    ArrayList<Integer> Even = new ArrayList<>(); //четные
    ArrayList<Integer> Odd = new ArrayList<>(); //нечетные

    int midEven=0; 
    double midOdd=0;

    Random rand = new Random();
    
    arrayList.add(rand.nextInt(50));


           
    for (int i = 0; i < num; i++) {
        arrayList.add(rand.nextInt(50));

         int element  = arrayList.get(i);
         
         if(element%2 == 0) {
            Even.add(element);
            midEven+=element;
         }
         else {
            Odd.add(element);
            midOdd+=element;
         }
    }


    midEven =midEven/Even.size(); // находим среднее четных
    midOdd =midOdd/Odd.size(); // находим среднее нечетных

    // выводим четные
    System.out.print("Even = ");
    for(int i = 0; i<Even.size(); i++) {
        int value = Even.get(i);
    System.out.print(value+ " ");
    }

    System.out.println();
 
    // выводим нечетные   
    System.out.print("Odd = ");    
    for(int i = 0; i<Odd.size(); i++) {
        int value = Odd.get(i);
        System.out.print(value+ " ");
    }

    System.out.println();
    
    // выводим средние четных и нечетных
    System.out.println("middle Even = " + midEven);
    System.out.println("middle Odd = " + midOdd);
    
    
    }
}

