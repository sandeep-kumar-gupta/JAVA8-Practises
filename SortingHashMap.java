import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingHashMap {

    public static void main(String[] args) {

        Map<String,Integer> hm = new HashMap<>();
        hm.put("alice", 25);
        hm.put("booby", 33);
        hm.put("zara", 22);
        hm.put("mike", 30);

        Map<String,Integer> sortedHashMap=hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1 ,
                        LinkedHashMap::new));
        sortedHashMap.forEach((key,value)->System.out.println(key+"  "+value));
System.out.println("-------------------------------------------------------------------");
        Map<String,Integer> sortedHashMapByKey=hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1 ,
                        LinkedHashMap::new));
        sortedHashMapByKey.forEach((key,value)->System.out.println(key+"  "+value));


    }
}
