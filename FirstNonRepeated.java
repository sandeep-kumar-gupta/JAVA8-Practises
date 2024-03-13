import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeated {

    public static void main(String args[]){

        String input = "Java Is Awesome langauage";

        Character result = input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
                        //first convert to Charcter object then convert to lower case
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                //store the chars in map with count
                .entrySet().stream().filter(entry -> entry.getValue() == 1L).map(entry->entry.getKey()).
                findFirst().get();
        System.out.println(result);
    }
}
