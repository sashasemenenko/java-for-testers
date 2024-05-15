public class MyArray {
    public static void main(String[] args) {
        String[] students = {"Oleksandr", "Nadiia", "Dmytrii"};
        int[] numbers = {1, 7, 12};

        System.out.println(students[0]);

        students[0] = "Mykola";
        System.out.println(students[0]);

        System.out.println("There are " + students.length + " students in the class.");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
