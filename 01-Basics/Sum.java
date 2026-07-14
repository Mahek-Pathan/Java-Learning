import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sum {
    /*public static int sumof(int a, int b){
        return a+b;
    }*/
    public static void main(String[] args){
       //int a,b;
       //Scanner sc = new Scanner(System.in);
       //System.out.println("-----------Sum-----------");
       //System.out.println("Enter the num1: ");
       //a= sc.nextInt();
       //System.out.println("Enter the num2:");
       //b=sc.nextInt();
       //System.out.println("The sum of two numbers is: "+sumof(a, b));
       int[] arr={1,2,3,4,5};
       change(arr);
       System.out.println(Arrays.toString(arr));

    }
    static void change(int[] arr){
        arr[0]=99;
    }

    
    
}
