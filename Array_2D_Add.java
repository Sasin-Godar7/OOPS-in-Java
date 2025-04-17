import java.util.Scanner;
public class Array_2D_Add {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int sum[][] = new int[3][3];

        // entering the elements in the first matrix

        System.out.println("enter the element of 1st matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }

        }

        // entering the elements in the  second matrix

        System.out.println("enter the element of 2nd matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // now adding the two dimension matrix with each other

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        // displaying the result

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(sum[i][j]);
            }
            }

    }
}
