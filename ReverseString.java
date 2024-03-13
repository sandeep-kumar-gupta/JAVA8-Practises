import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {

        String str = "sandeep kumar gupta ";
       // String rev = "";

        //StringBuffer revered = new StringBuffer();

        /*String[] split = str.split(" ");

        for(int i = split.length-1 ; i >= 0; i-- ){

            revered.append(split[i]).append(" ");

        }*/
        //this is only for reverded the order of the sentence
       // System.out.println(revered.toString());
        // this is for string reverded at place without alterring order
       // System.out.println(revered.reverse().toString());

        String strr = Arrays.stream(str.split(" ")).map(a->new StringBuffer(a).reverse()).collect(Collectors.joining(" "));
        String rev = Stream.of(str).map(a->new StringBuffer(a).reverse()).collect(Collectors.joining());
       /* for (int i= str.length()-1;i>=0;i--){
                                                    // this is chatAt() way
            rev=rev+str.charAt(i);

        }*/

        /*StringBuffer sb = new StringBuffer();
        sb.append(str);// string buffer or builder way
        sb.reverse();*/
      //  System.out.println(rev.replaceAll("\\s", ""));// this is for remove white space

        System.out.println(strr);
        System.out.println(rev);



    }
}
