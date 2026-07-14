import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number to check if it is Armstrong number: ");
        //int n=sc.nextInt();
        //System.out.println(isArmstrong(n));
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        System.out.println("Armstrong numbers are: ");
        ArmstrongList(n);
    }
    static boolean isArmstrong(int n){
        int num = n;
        int res = 0;
        while (n>0){
            int rem = n%10;
            res = res + rem*rem*rem;
            n = n/10;
        }
        return num==res;
    }
    static void ArmstrongList(int n){
        for(int i = 100;i<n;i++){
            if(isArmstrong(i)) System.out.print(i+ " ");
        }
    } 
}

