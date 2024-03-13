import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//How to find duplicate elements from list of integers?
public class DuplicateElements {
    public static void main(String ars[]){

        List <Integer> list = Arrays.asList(30,40,50,56,56,34,78,67,34);
        Set <Integer> set = new HashSet<>();
        list.stream().filter(n->!set.add(n)).forEach(System.out::println);
        System.out.println("------------------------------------------------");

        //How to remove duplicate elements from list of integers ?
        list.stream().distinct().forEach(System.out::println);
    }
}
