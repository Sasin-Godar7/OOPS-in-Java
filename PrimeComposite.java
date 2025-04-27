import javax.swing.plaf.IconUIResource;
import java.util.Scanner;
public class PrimeComposite {

    public static void primeCompositeChecker(int num)
    {
        int  count =0;
        for(int i = 1;i<=num;i++)
        {
            if(num % i == 0)
            {
                count ++;
            }
        }
        if(count == 2)
        {
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is composite");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to check");
        int num = sc.nextInt();

        primeCompositeChecker(num);
    }
}
