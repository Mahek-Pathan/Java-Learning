public class SplitArray {
    public static void main(String[] args){
        int[] arr={7,2,5,8,10};
        int m=2;
        System.out.print(splitarray(arr,m));
    }
    public static int splitarray(int[] nums, int m){
        int start = 0;
        int end=0;
        for(int i = 0;i<nums.length;i++){
            start=Math.max(start,nums[i]);//in the end of the loop this will contain the max item of the array
            end+=nums[i];
        }
        while(start<end){
            //try for the middle as potential ans 
            int mid=start+(end-start)/2;
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(num+sum>mid){
                    //you cannot add this in this subarray,make new one
                    //say you add this in new subarray then sum=num
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
}
