import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the income in rs");
        long rs = sc.nextLong();

        if(rs < 250000)
        {
            System.out.println("You don't need to pay any tax enjoy your all income");
        }

        else if(rs > 250000 && rs < 500000)
        {
            float tx1 = (5/100.02f)* rs;
            System.out.println("Should pay tax " + tx1+"percent");
        }


        else if(rs > 500000 && rs < 1000000)
        {
            float tx2 = (20/100.0f)* rs;
            System.out.println("Should pay tax " + tx2+"percent");
        }

       else if(rs > 1000000)
        {
            float tx3 = (30/100.2f)* rs;
            System.out.println("Should pay tax " + tx3+"percent");
        }


    }
}
