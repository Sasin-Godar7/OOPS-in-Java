package WrapperClassInJava;

public class PrimitiveToWrapper {
    public static void main(String[] args) {

        //converting int to Integer

        int a = 20;

        Integer i = Integer.valueOf(a);   // int to Integer

        Integer j = a;   //autoboxing compiler will automatically write valueof() ;

        System.out.println(a +" " + i + " " +j);






    }
}
