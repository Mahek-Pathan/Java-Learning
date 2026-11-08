/*Given an array arr of integers, check if there exist two indices i and j such that :

i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
Example 1:

Input: arr = [10,2,5,3]
Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]*/
class P1436{
    public static void main(String[] args) {
        int[] arr= {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    public static boolean checkIfExist(int[] arr) {
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length;j++){
                if(arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}