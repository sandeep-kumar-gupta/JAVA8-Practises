import java.util.ArrayList;
import java.util.List;

public class Remove_Duplicate_Elements_Array {
    public static void main (String args[]) {
        List<String> lst = new ArrayList<String>();
        List<String> ul = new ArrayList<String>();
        lst.add("a");
        lst.add("b");
        lst.add("c");
        lst.add("a");
        lst.add("b");

        for (String sin : lst) {
            if (!ul.contains(sin)) {
                ul.add(sin);
            }

        }
        System.out.println(ul);
    }
}