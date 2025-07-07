package filehandeling_CharOriented;
import java.util.Scanner;
import java.io.FileWriter;
import java. io. IOException;
import java.io.*;

public class PrimeCompCheck {
    public static void main(String[] args) {
        try {
            FileWriter prime = new FileWriter("prime.txt");         // Prime number ko file banaune
            FileWriter comp = new FileWriter("composite.txt");      // Composite number ko file banaune

            Scanner sc = new Scanner(System.in);
            int[] a = new int[5];
            int num=0;


            System.out.println("enter the numbers to check :");
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                num = a[i];

                if (num <= 1) {
                    System.out.println(num + "" + " is neither prime nor composite");
                }
            }

            int count = 0;

            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                prime.write(num);
                System.out.println(num +"" + "=> prime file ma saved");
            }
            else
            {
                comp.write(num);
                System.out.println(num +"" + "=> composite file ma saved");
            }
            prime.close();
            comp.close();


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
