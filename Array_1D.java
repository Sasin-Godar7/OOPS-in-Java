import java.util.Scanner;

public class Array_1D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("enter the element of 1st matrix");
       for(int i =0;i<5;i++)
       {
           a[i] = sc.nextInt();
       }

        System.out.println("Now Displaying the entered elements");
       for(int i=0;i<5;i++)
       {
           System.out.println(a[i]);
       }



    }
}