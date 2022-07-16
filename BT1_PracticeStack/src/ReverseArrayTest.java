import java.util.ArrayList;
import java.util.Stack;
public class ReverseArrayTest {
    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        arr1.add(4);
        arr1.add(5);
        arr1.add(6);
        System.out.println(arr1);

        Stack<Integer> st1 = new Stack<>();

        addElementToStack(arr1, st1);
        System.out.println(st1);

        addElementToArray(st1, arr1);
        System.out.println(arr1);
//        System.out.println(st1.pop());
    }

    public static void addElementToStack(ArrayList arr, Stack stack){
        int i = 0;
        while (!arr.isEmpty()){
            stack.push(arr.get(i));
            arr.remove(i);

        }

    }


    public static void addElementToArray(Stack stack, ArrayList arr){
        while (!stack.isEmpty()){
            arr.add(stack.peek());
            stack.pop();
        }
    }
}