import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapTest{

    public static void main(String[] args) {
        List<String> l = Arrays.asList("sandeep","a","b","b","a","w");

       Map<String,Long> occerences= l.stream().collect(Collectors.groupingBy(
              Function.identity(), Collectors.counting()
        ));
        occerences.forEach((names,count)->System.out.println(names+" "+count));
    }
}
