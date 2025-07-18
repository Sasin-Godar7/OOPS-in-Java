package filehandeling_CharOriented;
import java.util.Scanner;
import java.io.*;

public class PrimeCompArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int count = 0;

        System.out.println("enter the numbers in An array ..");
        for(int i =0 ;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i = 2; i<= 5;i++)
        {
            if(arr[i] % i ==0)
            {
                count ++;
            }
        }

        try{
            FileWriter fwp = new FileWriter("primearray.txt");
            FileWriter fwc = new FileWriter("composite.txt");
            for(int i = 2; i<= args.length;i++) {
                if (count == 2) {
                    fwp.write("prime numbers are \n" + arr[i]);
                    fwp.flush();
                    fwp.close();
                } else {
                    fwc.write("composite numbers are \n" + arr[i]);
                    fwc.flush();
                    fwc.close();
                }
            }


        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
}
