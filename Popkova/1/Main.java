public class Main {

  public static void main(String[] args) {
    try {
      Integer firstValue = Integer.parseInt(args[0]);
      Integer secondValue = Integer.parseInt(args[1]);
      System.out.println(compareValues(firstValue, secondValue));
      System.out.println("Sum = ".concat(getSum(firstValue, secondValue).toString()));
    }
    catch(RuntimeException ex) {
      System.out.println("Some values have been missed!");
    }
  }
  
  public static String compareValues(Integer firstValue, Integer secondValue) {
    if(firstValue > secondValue)
      return "The first value is higher than second value";
    if(firstValue < secondValue)
      return "The first value is lower than second value";
    return null;
  }
  
  public static Integer getSum(Integer firstValue, Integer secondValue) {
    return firstValue + secondValue;
  }
  

}
