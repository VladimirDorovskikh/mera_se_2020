public class VarArgsExample {

    //public static void main(String[] args)
    public static void main(String ... args) {
        varArgMethod(42L,"two","three");


    }


    public static void varArgMethod(Long welcomeString, String ... args) {
        System.out.println("Всего аргументов " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }

    }


}
