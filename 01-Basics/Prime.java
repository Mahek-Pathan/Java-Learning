import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its prime: ");
        int num = sc.nextInt();
        boolean ans = isPrime(num);
        if(ans==true) 
            System.out.println(num+" is a Prime.");
        else 
            System.out.println(num+" is not Prime.");
        sc.close();
    }
    static boolean isPrime(int n){
        if(n==1) return false;
        int c = 2;
        while(c*c<=n){
           {
            if(n%c==0) return false;
           }
           c++;
        }
     return c*c>n;   
    }
    
}
