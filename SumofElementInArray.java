import java.util.Scanner;
public class SumofElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum1 = 0;
        int sum2=0;
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];

        // taking input in 1st matrix
        System.out.println("Enter the element in 1st matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // adding the element of 1st matrix

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                sum1= sum1 + a[i][j];
            }
        }

        // displaying the sum of element of 1st matrix
        System.out.println(sum1);


        System.out.println("Enter the element in 2nd matrix");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // adding the element of 1st matrix

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                sum2= sum2 + b[i][j];
            }
        }

        // displaying the sum of element of 1st matrix
        System.out.println(sum2);


if(sum1 == sum2)
{
    System.out.println("the sum of two matrix is equal");
}
else{
    System.out.println("both sum are not Equal");
}

sc.close();


    }
}









