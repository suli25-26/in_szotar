import java.util.HashMap;
import java.util.Map;

public class Maping {
    public static void task01() {
        Map<String, String> szotar = new HashMap<>();
        System.out.println(szotar.isEmpty()); // true
        szotar.put("alma", "apple");
        szotar.put("szék", "chair");
        szotar.put("asztal", "table");
        System.out.println(szotar.size());
        System.out.println(szotar.get("szék"));
        // szotar.clear();
        System.out.println(szotar.size());
        System.out.println(szotar.containsKey("asztal"));
        System.out.println(szotar.containsValue("chair"));
        System.out.println(szotar.remove("szék"));

        for (Map.Entry<String, String> entry : szotar.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
