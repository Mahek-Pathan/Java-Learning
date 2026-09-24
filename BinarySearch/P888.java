import java.util.*;
class P888{
    public static void main(String[] args){
        int[] A = {1,1};
        int [] B = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(A,B)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA=0;
        for(int num: aliceSizes){
            sumA+=num;
        }
        int sumB=0;
        for(int num: bobSizes){
            sumB+=num;
        }
        Arrays.sort(bobSizes);
        for(int x : aliceSizes){
            int target = x + (sumB-sumA)/2;
            if(inArray(bobSizes,target)){
                return new int[] {x,target};
            }
        }
        return new int[] {};
    }
    private static boolean inArray(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target==arr[mid]){
                return true;
            }else if(target<arr[mid]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
