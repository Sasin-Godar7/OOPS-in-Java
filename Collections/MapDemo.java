package Collections;
import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String>map = new HashMap<>();

        map.put(101,"Sasin");
        map.put(102,"Ashok");
        map.put(103,"Rajan");

        for(Map.Entry m:map.entrySet()){

            System.out.println(m.getKey() + " " + m.getValue());

        }
    }
}
