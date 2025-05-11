package WrapperClassInJava;

public class WrapperToPrimitive {
    public static void main(String[] args) {

        //unboxing == it is the reverse process of the autoboxing ..automaticaly conerting the object of the
        //wrapper class into its corresponding primitive value.

        Integer a = new Integer(3);

        int i = a.intValue();   // converting the integer value i to int

        int j = a;

        System.out.println(a + " " + i + " " + j);



    }
}
