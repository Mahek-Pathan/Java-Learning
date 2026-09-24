//Given an array nums of integers, return how many of them contain an even number of digits.

 
public class EvenNoOfDigits1295{
    public static void main(String[] args) {
        int[] nums = {12,345,22,6,7896};
        System.out.println(findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        //int cnt=0;
        //while(num>0){
        //    cnt++;
        //    num=num/10;
        //}
        //if(cnt%2==0){
        //    return true;
        //}
        //return false;
        int digits=(int)(Math.log10(num))+1;
        return digits%2==0;
    }
    
}
