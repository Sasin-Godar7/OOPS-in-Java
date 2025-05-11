package Collections;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        // List banauxa
        ArrayList<String> fruits = new ArrayList<>();

        // Add gareko
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        //traversing
        Iterator itr = fruits.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());

        }
    }
}
