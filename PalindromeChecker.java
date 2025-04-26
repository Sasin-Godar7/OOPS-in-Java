import java.util.Scanner;

public class PalindromeChecker {

    public static void checkPalindrome(int num)
    {
        int rem,rev=0,temp;
        temp = num;
         while (num!=0)
         {
              rem = num % 10 ;
              rev = rem + (rev * 10);
              num=num/10;
         }
         if(rev == temp)
         {
             System.out.println("the number is palindrome");
         }
         else{
             System.out.println("not palindrome");
         }

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        checkPalindrome(num);


    }

}
