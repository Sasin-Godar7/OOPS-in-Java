import java.util.Scanner;
public class StdMrals_ps_cwh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subject 1");
           int s1= sc.nextInt();
        System.out.println("Enter the marks of subject 1");
        int s2= sc.nextInt();
        System.out.println("Enter the marks of subject 1");
        int s3= sc.nextInt();
        System.out.println("Enter the marks of subject 1");
        int s4= sc.nextInt();
        System.out.println("Enter the marks of subject 1");
        int s5= sc.nextInt();



        int sum = s1+s2+s3+s4+s5;
        float totalper = (sum/5.0f);

        System.out.println("Your overall percantage is " + totalper);

        if(totalper>=40 && s1 >=33 && s2>=33 && s3>=33 && s4>=33 && s5>=33)
        {
            System.out.println(" you are pass");

        }
        else
        {
            System.out.println("You are fail");
        }






    }
}
