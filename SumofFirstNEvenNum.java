
import java.util.Scanner;
public class SumofFirstNEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("enter how many even numbers");
        int num = sc.nextInt();

        while (num !=1)
        {
            if(num % 2 ==0)
            {
               sum  = sum + num;
            }
        }
        System.out.println("sum of first even number is " + sum);

    }
}
