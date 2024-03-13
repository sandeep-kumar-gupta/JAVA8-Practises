import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("sandeep","kumar","gupta","kumawat","mujjhaparpur","gumanam");
        List<Integer> inte = Arrays.asList(1,2,3,4,4,5,6,7,8,6,4,3,334,343,43,434,3,434,32,32,32,21);

        inte.stream().map(a->a*a).forEach(System.out::println);

        list.stream().map(a->a.toUpperCase()).sorted().collect(Collectors.toList()).forEach(System.out::println);




    }

}
