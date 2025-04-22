public class MultiplicationOfTenReverse {
    public static void main(String[] args) {

      multiplication();

    }

    public static void multiplication(){
        int n = 10;
        int i=0;
        for(i=10;i>0;i--)
        {
            System.out.printf("%d X %d = %d\n",n ,i,n*i);
        }
    }
}
