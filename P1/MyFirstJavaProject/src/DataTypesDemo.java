public class DataTypesDemo {
    public static void main(String[] args) {
        byte myByte = 50;
        short myShort = 30000;
        int myInt = 2000000000;
        long myLong = 1_000_000_000_000_000_000L;
        float myFloat = 3.14f;
        double myDouble = 3.14;
        boolean myBoolean = true;
        char myChat = 'A';

        int newInt = myByte;
        System.out.println(newInt);

        int newIntFromDouble = (int) myDouble;
        System.out.println(newIntFromDouble);
    }
}
