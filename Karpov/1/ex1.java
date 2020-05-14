import java.util.Random;

import static java.lang.System.out;

public class Ex1 {

    public static void main(String[] args) {
        int number[] = new int[2];
        Random filler = new Random();
        for (int i =0; i<2; i++) {
            if ( i<args.length && args[i]!=null ) {
                try {
                    number[i] = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    number[i] = filler.nextInt(10)+1;
                }
            }
            else{

                number[i] = filler.nextInt(10)+1;
            }
        }
        System.out.println("Numbers are: "+number[0]+" "+number[1]);
        if(number[0]<number[1]) {
            System.out.println(number[0]+" less than "+number[1]);
        }
        else if(number[0]>number[1]) {
            System.out.println(number[0]+" more than "+number[1]);
        }
        else {
            System.out.println("Numbers are equal");
        }
    }
}
