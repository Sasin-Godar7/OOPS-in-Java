package filehandeling_CharOriented;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.*;

public class StringPrimeComp {
    public static void main(String[] args) {
        try {
            // FileWriter object for prime and composite files
            FileWriter spr = new FileWriter("sprime.txt");
            FileWriter scm = new FileWriter("scomposite.txt");

            // Input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
            String str = sc.nextLine();

            int len = str.length(); // Get length of the string

            // Prime checking logic
            boolean isPrime = true;
            if (len <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= len / 2; i++) {
                    if (len % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            // Writing to respective files
            if (isPrime) {
                spr.write(str);
                System.out.println(str + " is written successfully in prime file.");
            } else {
                scm.write(str);
                System.out.println(str + " is written successfully in composite file.");
            }

            // Close all resources
            spr.close();
            scm.close();
            sc.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
