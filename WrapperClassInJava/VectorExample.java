package WrapperClassInJava;
import java.util.*;

public class VectorExample {
    public static void main(String[] args) {

        Vector<String>vec = new Vector<String >();     // creating the vector

        //adding element using add() method of list

        vec.add("tiger");
        vec.add("lion");
        vec.add("snake");

        //adding elements using the addELement() method of vector

        vec.addElement("rat");
        vec.addElement("mouse");
        vec.addElement("mice");

        // printing the outputs

        System.out.println("elements are :" + vec);

    }
}
