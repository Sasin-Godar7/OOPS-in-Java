package Collections;
import com.sun.source.tree.Tree;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String>set = new TreeSet<>();

        set.add("Sasin");
        set.add("Anuzz");
        set.add("Prabin");

        Iterator itr = set.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
