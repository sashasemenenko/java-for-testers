import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> ourList = new ArrayList<>();

        ourList.add("Oleksandr");
        System.out.println(ourList);

        ourList.add("Nadiia");
        System.out.println(ourList);

        ourList.add("Dmytrii");
        System.out.println(ourList);

        System.out.println(ourList.get(0));

        ourList.set(0, "Oleksa");
        System.out.println(ourList);

        String removed = ourList.remove(0);
        System.out.println(ourList);
        System.out.println(removed);

        ourList.add("John");
        ourList.add("Bill");
        ourList.add("Arthur");
        ourList.add("Sofia");

        System.out.println("There are " + ourList.size() + " items in the list");

        System.out.println(ourList + " contains Oleksandr: " + ourList.contains("Oleksandr"));
        System.out.println(ourList + " contains Nadiia: " + ourList.contains("Nadiia"));

        System.out.println("Index of Nadiia is: " + ourList.indexOf("Nadiia"));
        System.out.println("Is empty: " + ourList.isEmpty());

        for (String value : ourList) {
            System.out.println(value);
        }

        Iterator<String> iterator = ourList.iterator();
        String name = iterator.next();
        System.out.println("Name is: " + name);
        name = iterator.next();
        System.out.println("Second name is: " + name);
    }
}
