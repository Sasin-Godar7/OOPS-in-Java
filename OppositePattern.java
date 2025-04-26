public class OppositePattern {
    public static void main(String[] args) {

        int i ,j,n=4;

        for(i=n;i>0;i--)
        {
            for(j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
