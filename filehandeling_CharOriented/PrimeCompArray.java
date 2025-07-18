package filehandeling_CharOriented;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PrimeCompArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        try {
            FileWriter fwp = new FileWriter("primearray.txt", true);  // append mode
            FileWriter fwc = new FileWriter("composite.txt", true);   // append mode

            for (int i = 0; i < 5; i++) {
                if (isPrime(arr[i])) {
                    fwp.write(arr[i] + "\n");
                } else {
                    fwc.write(arr[i] + "\n");
                }
            }

            fwp.close();
            fwc.close();

            System.out.println("Numbers written to files successfully.");

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }

    // ✅ Add this missing isPrime() method
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
