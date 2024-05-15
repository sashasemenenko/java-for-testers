public class JavaLoops {
    public static void main(String[] args) {
        int pages = 12;
        for (int i = 1; i <= pages; i++) {
            // Execute some code on each page
            System.out.println(i);
            if (i == 5) {
                System.out.println("STOP");
                break;
            }
        }

        System.out.println("------------------");
        String[] students = {"Oleksandr", "Nadiia", "Dmytrii"};
        for (String student: students) {
            System.out.println(student);
        }

        System.out.println("-------------");
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        do {
            if (i == 2) {
                System.out.println("Skipping 2");
                i--;
                continue;
            }
            System.out.println(i);
            i--;
        } while (i > 0);
    }
}
