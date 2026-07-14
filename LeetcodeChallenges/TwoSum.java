//import java.util.*;
class TwoSum{
    /**
     * Finds two indices such that nums[i] + nums[j] == target.
     *
     * @param nums the input array
     * @param target the sum target
     * @return an array of two indices, or null if no pair exists
     */
    //public static int[] twoSum(int[] nums, int target) {
    //    Map<Integer,Integer> m = new HashMap<>();
    //    for (int i = 0; i < nums.length; i++) {
    //        int cur = nums[i];
    //        int complement = target - cur;
    //        if (m.containsKey(complement)) {
    //            return new int[]{m.get(complement), i};
    //        }
    //        m.put(cur, i);
    //    }
    //    return null; // no solution
    //}
//
    //public static void main(String[] args){
    //    int nums[] = {2, 3, 4, 1, 8};
    //    int target = 7;
    //    int[] res = twoSum(nums, target);
//
    //    if (res != null) {
    //        // print or otherwise use the returned array
    //        for (int i = 0; i < res.length; i++) {
    //            System.out.print(res[i]+" ");
    //        }
    //    } else {
    //        System.out.println("No solution found");
    //    }
    //}
    public static int[] PairSum(int[] nums,int target){
        int[] xy=new int[2];
        int i=0;
        int j=nums.length-1;
        int sum=0;

        while(i<j){
            sum = nums[i]+nums[j];
            if(sum==target){
                xy[0]=nums[i];
                xy[1]=nums[j];
                return xy;
            }
            else if(sum>target){
                    j--;
                }
            else{
                    i++;
                }
            }
            return xy;
        }
    public static void main(String[] args) {
        int [] nums = {1,2,3,5};
        int target = 4;
        int []m=PairSum(nums, target);
        for(int i: m){
            System.out.println(i);
        }
    }
}