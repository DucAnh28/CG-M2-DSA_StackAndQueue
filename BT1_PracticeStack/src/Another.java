import java.util.Stack;

public class Another {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        Stack<String> wWord = new Stack<>();
        wWord.push("DucAnh");
        wWord.push("Hieu");
        wWord.push("Quyet");
        wWord.push("BatRan");

        for (int i = 0; i < wWord.size(); i++) {
            String temp = ww
            wStack.pop();
            wStack.push(temp);
        }
        for (int i = 0; i < wStack.size(); i++) {
            System.out.println(wStack.get(i));
        }
    }
}
