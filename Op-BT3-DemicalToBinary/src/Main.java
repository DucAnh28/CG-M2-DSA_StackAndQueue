import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            int num = number % 2;
            stack.push(num);
            number = number / 2;
        }
        System.out.println("He Nhi Phan la");
        while (!stack.isEmpty()) System.out.print(stack.pop());
    }
}
