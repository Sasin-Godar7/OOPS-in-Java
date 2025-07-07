package filehandeling_CharOriented;
import java.util.Scanner;
import java.io.FileWriter;

public class PrimeCompCheck {
    public static void main(String[] args) {
        try {
            FileWriter prime = new FileWriter("prime.txt");
            FileWriter comp = new FileWriter("composite.txt");

            Scanner sc = new Scanner(System.in);
            int[] a = new int[5];

            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                int num = a[i];
                int count = 0;

                if (num <= 1) {
                    System.out.println(num + " is neither prime nor composite");
                    continue;
                }

                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }

                if (count == 0) {
                    prime.write(num + "\n");
                    System.out.println(num + " => prime file ma saved");
                } else {
                    comp.write(num + "\n");
                    System.out.println(num + " => composite file ma saved");
                }
            }

            prime.close();
            comp.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
