package WrapperClassInJava;
import java.util.*;

public class JavaStackExample {
    public static void main(String[] args) {

        Stack<Integer>stk = new Stack<>();     // stack create gareko

        //checking if the stack is empty or not
        boolean result = stk.empty();
        System.out.println("Stack is empty ?? " + result);

        // if not empty now pushing the element in  the stack

        stk.push(101);
        stk.push(69);
        stk.push(102);
        stk.push(7);

        // printing the elements from the stack

        System.out.println("Elements in stack are :" + stk);

      result = stk.empty();

        System.out.println("nothing left in the stack ..stack is empty" + result);


    }
}
