public class JavaMethods {
    public static void main(String[] args) {
        helloWorld();
        helloOleksandr();
        printHello("Oleksandr");
        printHello("Nadiia");
        getSum(5, 7);
        printAge("Dmytrii", 8);
        getSum(5.6, 4.5);
        getSum(4,6, 8);
        int square = square(2);
        System.out.println(square);
        System.out.println(square(2));
    }

    private static void helloWorld () {
        System.out.println("Hello, world!");
    }

    private static void helloOleksandr () {
        System.out.println("Hello, Oleksandr!");
    }

    private static void printHello (String name) {
        System.out.println("Hello, " + name);
    }

    private static void getSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    private static void printAge (String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }

    private static void getSum(double a, double b) {
        double sum = a + b;
        System.out.println(sum);
    }

    private static void getSum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println(sum);
    }

    private static int square(int number) {
        int square = number * number;
        return square;
    }
}
