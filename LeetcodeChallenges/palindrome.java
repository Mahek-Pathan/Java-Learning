import java.util.*;
class palindrome {
    public static boolean isPalindrome(int x) {
        int og = x;
        int rev = 0;
        if(x<0){
            return false;
        }
        while(x!=0){
            int digit =x%10;
            rev = rev * 10 +digit;
            x=x/10;
        }
        return rev==og;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is palindrome: ");
        int x = sc.nextInt();
        if(isPalindrome(x)){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not a Palindrome");
        }
        sc.close();
    }
}