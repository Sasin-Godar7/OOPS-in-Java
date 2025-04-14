import java.util.Scanner;
public class AddTwo_2x3Matrix {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a[][] = new int[2][3];
        int b[][] = new int[2][3];
        int i,j;
        int sum[][] = new int[2][3];


        System.out.println("Enter the elements in 1st matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements in 2nd matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        // adding two matrix
        for(i=0;i<2;i++) {
            for (j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Displaying the addition of two matrix ");
        for(i=0;i<2;i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(sum[i][j] + "\t");
            }
            System.out.print("\n");
        }


    }
}
