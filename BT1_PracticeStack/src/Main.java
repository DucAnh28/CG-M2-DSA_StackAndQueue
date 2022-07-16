import java.sql.Array;
import java.util.Stack;

public class Main {
    static Stack<Integer> yolo = new Stack<Integer>();
    public static void main(String[] args) {
        int[] array = {12, 124, 6, 2, 15, 69, 1, 2, 8};
        for (int i = 0; i < array.length; i++) {
            yolo.push(array[array.length-1-i]);
        }
        for (int i = 0; i < yolo.size(); i++) {
            System.out.println(yolo.get(i));
        }

    }
}
