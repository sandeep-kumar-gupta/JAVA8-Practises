//given a list of integers , find out all the even numbers that exist in the list using stream funtions?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String args[]){

        List<Integer> list = Arrays.asList(10,25,35,40,505,60,70,80);

        list.stream().filter( n->n%2 == 0).forEach(System.out::println);
 //given a list of integers , find out all the odd numbers that exist in the list using stream funtions?

        list.stream().filter(n -> n%2 !=0 ).forEach(System.out::println);
System.out.println("--------------------------------------------------------------------");
        list.stream().filter(n->n%2 == 0).map(n->n*n*n).collect(Collectors.toList()).forEach(System.out::println);
    }

}
