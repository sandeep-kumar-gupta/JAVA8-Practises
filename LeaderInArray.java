public class LeaderInArray {

    public static void main(String[] args) {
        int[] arr = {16,19,5,4,7,3,2};

        for(int i = 0; i < arr.length;i++){
            int j;
            for( j = i+1; j< arr.length;j++){
                if (arr[i]<arr[j])break;
            }
            if(j == arr.length){
                System.out.println(arr[i]);
            }
        }
        System.out.println("=============================================");
        System.out.println(arr[arr.length-1]);
        int maxFromRight = arr[arr.length-1];
        for (int i = arr.length-1;i>0;i--){
            if(arr[i-1]>maxFromRight) {
                maxFromRight = arr[i - 1];

                System.out.println(maxFromRight);
            }
        }

    }
}
