import java.util.HashSet;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7,8};
        int[] arr2 = {2,4,5,7};
        HashSet<Integer> set = new HashSet<>();
        for (int num:arr1){

            set.add(num);
        }
        System.out.println("common elements - ");
        for (int num :arr2){

            if (set.contains(num)){

                System.out.println(num+ " ");

            }
        }

    }
}
