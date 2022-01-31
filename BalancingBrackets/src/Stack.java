import java.util.LinkedList;

public class Stack {
    LinkedList<Character> stack = new LinkedList<Character>();

    public void push(Character value) {
        stack.add(0, value);
    }

    public void pop() {
        stack.removeFirst();
    }

    public void display() {
        for (Character character : stack) {
            System.out.println(character);
        }
    }

    public Character top() {
        return stack.getFirst();
    }

    public int size() {
        return stack.size();
    }
}
