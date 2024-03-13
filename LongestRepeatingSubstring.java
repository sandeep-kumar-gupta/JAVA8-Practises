public class LongestRepeatingSubstring {

    public static String findLongestRepeatingsubString(String str){
        int n = str.length();
        String longestSubString = "";

        for(int i = 0;i<n;i++){
            for (int j= i+1;j<n;j++){
                int k = 0;

                while (j+k<n && str.charAt(i+k)==str.charAt(j+k)){
                    k++;
                }
                if(k>0 && k> longestSubString.length()){
                    longestSubString = str.substring(i,i+k);

                }
            }
        }
        return longestSubString;
    }

    public static void main(String[] args) {
        String input = "banana";
        String longestRepeatingSubString = findLongestRepeatingsubString(input);
        System.out.println("longest repeating substring in "+input +" is = "+longestRepeatingSubString);
    }
}
