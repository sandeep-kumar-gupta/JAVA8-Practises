public class MissingNumber {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,7,8,9};
        int n = arr.length+1;
        int expectedSum = (n*(n+1)/2);
        int actualSum = 0;

        for(int num :arr){
            actualSum += num;

        }
        System.out.println("missing number :" +(expectedSum-actualSum));
    }
}
