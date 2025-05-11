package Collections;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String>set = new HashSet<>();

        set.add("daya");
        set.add("Abhijit");
        set.add("Purvi");

        Iterator itr = set.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
