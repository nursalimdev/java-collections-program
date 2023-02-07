package nursalim.dev.collection.program.lambda;

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaCollectionApp {
    public static void main(String[] args) {
        List<String> list = createList();

        // old way
        for(String value: list){
            System.out.println(value);
        }

        // using lambda
        list.forEach(value -> System.out.println(value));
        list.forEach(System.out::println);

        Map<String, String> map = createMap();

        // old way
        for(Map.Entry<String, String> entry  : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // using lambda
        map.forEach((key, value) -> System.out.println(key + " : " + value));

        map.forEach(LambdaCollectionApp::printEntry);

    }

    public static void printEntry(String key, String value){
        System.out.println(key + " : " + value);
    }

    public static List<String> createList(){
        return List.of("Nursalim", "Al", "Farizi");
    }

    public static Map<String, String> createMap(){
        Map<String, String> map = new HashMap<>();
        map.put("1", "Satu");
        map.put("2", "Dua");
        map.put("3", "Tiga");

        return map;
    }
}
