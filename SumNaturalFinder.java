import java.util.Scanner;
public class SumNaturalFinder {

    public static void findSum(int num) {
        int sum = 0;

        for ( int i = 0;i < num;i++)
        {
             sum = sum + i;
        }
        System.out.println("the sum of n natural number is "+ sum);
    }
    public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        findSum(num);
    }
}
