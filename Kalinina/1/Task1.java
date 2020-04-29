import java.util.Scanner;

public class Task1 {

    static void compare(Integer one, Integer two) {
        if(one > two) {
            System.out.println("Число " + one + " больше числа " + two);
        }
        else if(one < two) {
            System.out.println("Число " + one + " меньше числа " + two);
        }
        else {
            System.out.println("Число " + one + " равно числу " + two);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Integer num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        Integer num2 = scanner.nextInt();

        compare(num1, num2);
        System.out.println("Сумма чисел " + num1 + " и " + num2 + " равна " + (num1 + num2));

    }
}

