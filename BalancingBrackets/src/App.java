import java.util.Scanner;

import exceptions.UnBalencedBracketException;

public class App {

    public static void checkBalence(String bracketExpression) throws UnBalencedBracketException {
        try {
            var chars = bracketExpression.toCharArray();
            Stack stack = new Stack();
            if (chars.length == 1) {
                System.out.println("Brackets are unbalenced");
                return;
            }
            for (char character : chars) {
                if (character == '(' || character == '[' || character == '{') {
                    stack.push(character);
                } else if (character == ')') {
                    if (stack.top() == '(') {
                        stack.pop();
                    } else {
                        throw new UnBalencedBracketException();
                    }
                } else if (character == ']') {
                    if (stack.top() == '[') {
                        stack.pop();
                    } else {
                        throw new UnBalencedBracketException();
                    }
                } else if (character == '}') {
                    if (stack.top() == '{') {
                        stack.pop();
                    } else {
                        throw new UnBalencedBracketException();
                    }
                }
            }
            System.out.println("Brackets are balenced");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean isExited = false;
        do {
            System.out.println("Enter valid brackets only!");
            System.out.println("Press Q to quit");
            String inputString = scanner.next();
            if (inputString.toLowerCase().equals("q")) {
                isExited = true;
                break;
            }
            checkBalence(inputString);
        } while (!isExited);
        scanner.close();
    }
}
