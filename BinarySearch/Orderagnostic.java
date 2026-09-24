

public class Orderagnostic {
    public static void main(String[] args) {
        //int[] arr = { 2,4,6,9,11,12,14,20,36,48};
        int[] arr = {80,75,18,12,6,4,3,1};
        int target = 80;
        int index = Search(arr,target);
        System.out.println("Element found at position: "+index);
    }
    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==target) return mid;
            if(isAsc){
                if(target>arr[mid]){
                     start = mid+1;
                }
                else {
                end = mid -1;
                }
            }else{
                if(target<arr[mid]){
                     start = mid+1;
                }
                else {
                end = mid -1;
                }
            }
            }
        return -1;
    }
}
