package LinearSearchJAVA;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                {3,4},
                {5,6,7}};
        System.out.println(max(arr));
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] element : arr) {
            for (int element2 : element) {
                if(element2>max){
                    max= element2;
                }
            }
        }
        return max;
    }
}
