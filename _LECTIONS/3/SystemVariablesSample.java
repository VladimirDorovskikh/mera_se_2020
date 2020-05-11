public class SystemVariablesSample {

    public static void main(String[] args) {
        Integer intValue = someMethod();
        System.out.println(intValue);
    }

    private static Integer someMethod() {
        return Integer.parseInt("",15);
    }
}
