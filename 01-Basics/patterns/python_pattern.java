
package patterns;
public class python_pattern{
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j);
            }
            System.out.println();        
        }
    }
    public static void main(String args[]){
        pattern(4);
    }
}