import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        Map< String,Integer> hashmap = new HashMap<>();

        hashmap.put("Hai",24);
        hashmap.put("thang",14);
        hashmap.put("nhung",23);
        System.out.println("Display entries in HashMap ");
        System.out.println( hashmap + "\n");

        Map<String,Integer> treemap = new TreeMap<>(hashmap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treemap);


        Map<String,Integer> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Hai",24);
        linkedHashMap.put("thang",14);
        linkedHashMap.put("nhung",23);


        System.out.println("\nTuổi của hải là: " + linkedHashMap.get("Hai"));
//        System.out.println("\n Tuổi của hải là: " + linkedHashMap.);

    }
}
