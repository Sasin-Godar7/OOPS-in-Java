public class SumofProductof8 {
    public static void main(String[] args) {

        int num =8;
        int i,sum=0;

        for(i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d", num , i,num*i);
            System.out.print("\n");
            sum = sum + (num*i);

        }

//               sum = sum + (num*i);

        System.out.println("the sum of mul of 8 is " + sum);







    }
}
