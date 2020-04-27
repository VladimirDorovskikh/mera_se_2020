import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {

    public static void main(String[] args) {
        /*String переменная1 = new String("text");
        String var2 = new String("Text");
        System.out.println(переменная1.equalsIgnoreCase(var2));*/
/*


        Integer one = 2;
        Integer another = 3;

        one +=  another;
        System.out.println(one);
*/


        Boolean b = true;
        Boolean fa = false;

        b |= fa;
        System.out.println(b);

    }

    public static Boolean returnAndPrintTrue() {
        System.out.println("Возвращаю истину");
        return true;
    }

    public static Boolean returnAndPrintFalse() {
        System.out.println("Возвращаю ложь");
        return false;
    }
}
