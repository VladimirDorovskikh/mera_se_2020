//задача из презентации на вывод аргументов

public class AnotherMain {

  public static void main(String[] args) {
     Integer[] values = new Integer[3];
     
     try {
       for(int i = 0; i < values.length; i++) 
         values[i] = Integer.parseInt(args[i]);
         
       for(int i = values.length - 1; i >= 0; i--)
         System.out.print(values[i].toString().concat(" "));
     }
     catch(RuntimeException ex) {
       System.out.println("Some values have been missed!");
     }
  }
}
