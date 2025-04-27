
import java.util.Scanner;
public class SimpleFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number upto where find the factorial");
        int num = sc.nextInt();

        factorial(num);

    }

    public static void factorial(int num) {

        int fact = 1;


        while (num >1) {

            fact *= num;

            num--;
            
        }
        System.out.println("the factoraial of the given number is " + fact);
    }

}
