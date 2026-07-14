//dimport java.util.*;
public class practice{
    public static void main(String[] args) {
        //int[][] nums = new int[4][3];
        //Scanner sc = new Scanner(System.in);
        //for(int i=0;i<4;i++){
        //    for(int j=0;j<3;j++){
        //        System.out.println("Enter element["+i+"]["+j+"]: ");
        //        nums[i][j]=sc.nextInt();
        //    }
//
        //}
//
        //for(int i =0;i<4;i++){
        //    for(int j=0;j<3;j++){
        //        System.out.print(nums[i][j]+" ");
        //    }
        //} 
        //    sc.close();
//WA//P-----to add two matrices
    //    int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
    //    int[][] b = {{3,2,1},{3,2,1},{3,2,1}};
    //    int[][] res = new int[3][3]; 
    //    for(int i=0;i<a.length;i++){
    //        for(int j=0;j<a.length;j++){
    //            res[i][j]=a[i][j]+b[i][j];
    //        }
    //    }
    //    for(int i =0;i<3;i++){
    //for(int j=0;j<3;j++){
    //    System.out.print(res[i][j]+" ");
    //}
//WAP====> given a matrix find the row with maximum number of 1s

        int[][] nums={{1,2,2},{3,5,1},{1,1,1},{1,1,2}};
        int max = Integer.MIN_VALUE;
        int index=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==1){
                    count++;
                }
                if(count>max){
                max=count;
                index=i;
                }
            }
        }
        System.out.println("Max count:"+max+"index:"+index);

        }

    }
