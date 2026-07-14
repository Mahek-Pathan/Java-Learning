public class MaxSum{
    public static void main(String[] args) {
       int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
       int max=0;
       int idx=-1;
       for(int i=0;i<nums.length;i++){

        int sum=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[i][j];
            if(sum>max){
                max=sum;
                idx=i;
            }
        }
       } 
       System.out.println("max Row sum: "+max+"at index: "+idx);
       int cmax=0;
       int ixx=-1;
       for(int i=0;i<nums[0].length;i++)
       {
        int sm=0;
        for(int j=0;j<nums.length;j++){
            sm+=nums[j][i];
            if(cmax<sm){
                cmax=sm;
                ixx=i;
            }
        }
       }
       System.out.println("max column sum: "+cmax+"at index: "+ixx);
    }
}