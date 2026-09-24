
public class FloorOfNo{
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,10,15,16};
        int target = 6;
        System.out.println(Floor(arr,target));
    }
    //floor is greatest no <= target
    static int Floor(int[] arr, int target){
        //if the target is smaller than the smallest no present in array
    if(target<arr[arr.length-1]){
        return -1;
    }
        int start=0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else 
                return mid;
        }
        return end;
    }
}