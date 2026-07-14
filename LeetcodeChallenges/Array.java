//create target array in the given order
//given two array of integers nums and index the task is to create a target array under the following rules
//Initially target array is empty
//from left to right read nums[i] and index[i], insert at index index[i] the value



//Input: nums = [0,1,2,3,4],index=[0,1,2,2,1]
//op=[0,4,1,3,2]

import java.util.ArrayList;

class Solution{
    public int[] CreateTargetArray(int[] nums,int[] index){
        int[] target = new int[nums.length];
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i = 0; i<nums.length;i++){
            al.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            target[i]=al.get(i);
        }
        return target;
    }
}
public class Array {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int [] index={0,1,2,2,1};
        Solution s = new Solution();
        int [] res= s.CreateTargetArray(nums, index);
        for(int i: res){
            System.out.print(i+" ");
        }
        


    }
    
}
