package Collections;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String>ll = new LinkedList<>();     // linked list ko obje
        // ct create gareko

        ll.add("Sasin");
        ll.add("Prabin");
        ll.add("Anuzz");

        Iterator itr = ll.iterator();

        // now traversing the elements

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
