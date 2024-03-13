public class Test {



        public static void main(String[] args) {

            // string value
            String strSentence = "Bench Resources";

            // reversed content stored in SB
            StringBuffer sbReversed = new StringBuffer();

            // print original string content to console
            System.out.println("The original string content is : "
                    + strSentence);

            // split sentence by setting space as delimiter
            String[] splittedString = strSentence.split(" ");

            // iterating String array
            for(int i = splittedString.length - 1; i >= 0; i--) {

                // append to SB + an extra space
                sbReversed.append(splittedString[i]).append(" ");
            }

            // print reversed content to console
            System.out.println("The reverse content is : "
                    + sbReversed.reverse().toString());
        }
    }

