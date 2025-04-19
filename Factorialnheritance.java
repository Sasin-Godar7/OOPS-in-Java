
class  factorial
{
    int num;
    public void fact()
    {
        System.out.println("enter the number of which factorial is to be find");
        int num = 5;

    }

}

public class Factorialnheritance extends factorial{

    public static void main(String[] args) {
        Factorialnheritance fi = new Factorialnheritance();
        fi.fact();

        System.out.println(fi.num);
    }
}
