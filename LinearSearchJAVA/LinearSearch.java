package LinearSearchJAVA;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //int[] arr = {22,33,44,55};
        //int target = 44;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the array of elements[5]: ");
        for(int i = 0 ;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();

        System.out.println(linearSearch(arr,target));
        sc.close();

    }
    public static int linearSearch(int[] arr, int target){
        if(arr.length==0)
        {
            return -1;

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
                return i;

        }
        return -1;
    }
    
}
