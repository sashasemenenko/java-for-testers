import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String, Integer > age = new HashMap<>();
        age.put("Oleksandr", 36);
        age.put("Nadiia", 33);
        age.put("Dmytrii", 8);
        System.out.println(age);

        System.out.println("Age of Oleksandr is " + age.get("Oleksandr"));

        System.out.println("All keys: " + age.keySet());
        System.out.println("All values: " + age.values());
        System.out.println("All pairs: " + age.entrySet());

        age.replace("Oleksandr", 37);
        System.out.println(age);

        age.remove("Nadiia");
        System.out.println(age);

        Iterator iterator = age.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println("Entry set: " + iterator.next());
        }
        System.out.println("--------------");

        Iterator<Map.Entry<String, Integer>> iterator2 = age.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<String, Integer> entry = iterator2.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

        System.out.println("--------------");

        for (Map.Entry<String, Integer> entry : age.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }
}
