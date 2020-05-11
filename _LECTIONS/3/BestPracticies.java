import java.util.Arrays;

public class BestPracticies {

    public static void main(String[] args) {


        if (args.length==0) {
            System.out.println("Введите два числа");
            return;
        }

        Integer first = Integer.parseInt(args[0]);
        Integer second  = Integer.parseInt(args[1]);


        System.out.println(first);
        System.out.println(second);
    }

}
