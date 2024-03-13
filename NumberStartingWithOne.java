import java.util.Arrays;
import java.util.List;

//given a list of Integers, find out all the number which starts from 1?
public class NumberStartingWithOne {

    public static void main(String args[]){

        List<Integer> list = Arrays.asList(12,22,13,24,15,56,23,33);

        list.stream().map(s -> s + " ").filter(s -> s.startsWith("1")).forEach(System.out::println);
 // given a list of Strings, find out all the word  which starts from a?
         List<String> lst = Arrays.asList("sandep","ajit","ashol","vikas","ghus");

         lst.stream().filter(s -> s.startsWith("a")).forEach(System.out::println);
    }


}
