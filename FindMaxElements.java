import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//find the max element
public class FindMaxElements {

    public static void main(String ars[]){

        List<Integer> list = Arrays.asList(12,13,15,15,15,17,19,78,89,89,78,78,78,9,89);
        int max = list.stream().max(Integer::compare).get();
        System.out.println(max);
        //find the 2nd max element
        int second = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(second);
        //find the 3rd max element
        int third = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(third);

    }
}
