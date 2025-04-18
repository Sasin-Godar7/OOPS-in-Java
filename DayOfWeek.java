import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner sc   = new Scanner(System.in);

        System.out.println("The days are of total 7 ");
        System.out.println("You should choose between 1 to 7");
        System.out.println();

        System.out.println("Now enter your choice");
        int dy= sc.nextInt();

        switch (dy)
        {
            case 1:
                System.out.println("Today is sunday");
                break;

            case 2:
                System.out.println("Today is monday");
                break;
            case 3:
                System.out.println("Today is tuesday");
                break;

            case 4:
                System.out.println("Today is wednesday");
                break;
            case 5:
                System.out.println("Today is thursday");
                break;

            case 6:
                System.out.println("Today is friday");
                break;

            case 7:
                System.out.println("Today is saturday");
                break;


            default:
                System.out.println("Invalid choice");
                System.out.println("Enter wisely");





        }


    }
}
