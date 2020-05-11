package ru.mera;

public class MagicOfNumbers {
    public static void main(String[] args) {

        long l = 42;
        double d  = l;
        //float f = d;// - так делать нельзя

        float f = (float) d;
        float f1 = l;



     /*   System.out.println("Провеяем переполненеи");

        int bigNumber  = Integer.MAX_VALUE;
        int sum = bigNumber + 42;
        System.out.println(bigNumber);
        System.out.println(sum);
*/

        System.out.println("Провеяем инкремент");
        int i = 1, j = 1;

        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("i++=" + (i++));
        System.out.println("++j=" + (++j));
        System.out.println("i=" + i);
        System.out.println("j=" + j);

    }
}
