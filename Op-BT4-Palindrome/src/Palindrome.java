import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String string = scanner.nextLine();
        Queue<Character> test = new LinkedList<>();
        for (int i = string.length()-1; i >= 0; i--) {
            test.add(string.charAt(i));
        }
        String reverse = "";
        while (!test.isEmpty()) {
            reverse += test.remove();
        }
        if (string.equals(reverse)) {
            System.out.println("This is palindrome ");
        } else {
            System.out.println("This is not palindrome ");
        }
    }
}
