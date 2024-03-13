public class RotatedArray {

    //input array = {1,2,3,4,5,6,7,8}
    //ouput array =8 7 1 2 3 4 5 6
    //position = 2

    public static void main(String[] args) {

        int []  arr= {1,2,3,4,5,6,7,8};
        int position = 2;
        int [] rotatedArr = new int[arr.length];

        for (int i = 0; i < arr.length ;i++){

            int newPos = (i + position) % arr.length;
            rotatedArr[newPos] = arr[i];

        }
        System.out.println("rotated array : ");
        for (int num :rotatedArr){
            System.out.print(num + " ");
        }
    }
}
