import java.util.Scanner ;

public class Marksperc {

    public static void main ( String[] args){

        Scanner sc = new Scanner(System.in) ;

        System.out.println("enter the mrk 1");
        int a = sc.nextInt();

        System.out.println("enter the mrk 2 ");
        int b = sc.nextInt();

        System.out.println("enter the mrk 3 ");
        int c = sc.nextInt();

        System.out.println("enter the mrk 4 ");
        int d = sc.nextInt();
        System.out.println("enter the mrk 5 ");
        int e = sc.nextInt();

        int sum = a + b + c + d+ e ;

        System.out.println( "you obtained total " + sum);

        float per = (float) (sum /5.0);
        System.out.println("you got total of "+per+"percentage");


    }
}