import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintWord {

    public static void main(String[] args) {

        List <String> names = Arrays.asList("sandeep","amit","kumar","pravin","shekher","gumanm");

        names.stream().filter(a->a.length()<5).forEach(a->System.out.println(a));

        names.stream().filter(a->a.length()>5).collect(Collectors.toList()).forEach(a->System.out.println(a));

        names.stream().filter(a->a.length()>5 && a.startsWith("s")).collect(Collectors.toList()).forEach(a->System.out.println(a));



    }

}
