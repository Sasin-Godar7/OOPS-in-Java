import java.util.Scanner;
public class Factorial {

    public static void factorialCheck(int num)
    {
        int fact=1;
        for(int i =1;i<=num;i++)
        {
            fact = fact * i;
        }
        System.out.println("the factorail is "+fact);

    }


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("enter num upto which fact is perform ");
        int num = sc.nextInt();

        factorialCheck(num);
    }
}
