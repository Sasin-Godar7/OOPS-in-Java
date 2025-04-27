import java.util.Scanner;
public class SeasonsMonth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the month in number");
        int mon = sc.nextInt();
        if(mon >1 && mon <=3)
        {
            System.out.println("summer");
        }
        else if(mon > 3 && mon<=6)
        {
            System.out.println("autumn");

        } else if (mon>6 && mon <=9) {
            System.out.println("spring");

        } else if (mon> 9 && mon <=12) {
            System.out.println("winter ");

        }
        else
        {
            System.out.println("please choose the month upto 12 month");
        }


    }
}
