public class AnotherMain {

    static Integer sum(Integer one, Integer another) {
        System.out.println("Складываю " +  one + " и " + another);
        return one + another;
    }

    public static void main(String[] args) {
       /* Integer[] numbers = new Integer[]{1, 2, 3};
        System.out.println(numbers.length);
        */

        Integer[] numbers = new Integer[3];
        numbers[0] = 42;
        numbers[1] = 11;


        for (int i = 0, j = 5;
             i < numbers.length;
             i++,j=j*j) {

            System.out.println(i + j);

        }
    }
}
