public class InfiniteArray{
    public static void main(String[] args){
        //imagine you have an infinite array,which dont have a size so cant you use length function
        int[] nums = {1,1,2,3,4,5,6,7,7,8,9,10,11,22,33,44,55,66,77};
        int target=10;
        System.out.println(ans(nums,target));
    }
    public static int ans(int[]nums,int target){
        int start = 0;
        int end = 1; 
        //chunk size 2,only two numbers
        while(target>nums[end]){
            //here we are dividing the array in chunks and next chunck would be the double the size of its last chunk
            int temp = end+1;
            end = end + (end - start+1)*2;
            start=temp;
        }
        return binarysearch(nums,target,start,end);
    }
    public static int binarysearch(int[]nums, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target > nums[mid]){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}