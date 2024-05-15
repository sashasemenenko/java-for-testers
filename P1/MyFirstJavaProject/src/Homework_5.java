public class Homework_5 {
    public static void main(String[] args) {
        System.out.println(getAvg(3,5,7));
    }

    private static int getAvg(int a, int b, int c) {
        int avg = (a + b + c)/3;
        return avg;
    }
}
