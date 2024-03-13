import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//find the first element of the list?
public class FirstElement {
    public static void main (String sst[]){
        List<Integer> list = Arrays.asList(10,20,30,5,7,97,34,24);
        list.stream().findFirst().ifPresent(System.out::println);
        System.out.println("--------------------------------------------------------");
        //find the 2nd element
        list.stream().skip(1).findFirst().ifPresent(System.out::println);
        System.out.println("--------------------------------------------------------");
        //count the number of elements
        int count = (int) list.stream().count();
        System.out.println(count );
        System.out.println("--------------------------------------------------------");
        //ascending order printing
        list.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------------------------------------------");
        //descending order printing
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
