package week4_LLStacknQueue.Day2;

import java.util.*;

public class EvaluatePostfix {

    public static int evaluatePostfix(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") ||
                token.equals("-") ||
                token.equals("*") ||
                token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;

                    case "-":
                        result = a - b;
                        break;

                    case "*":
                        result = a * b;
                        break;

                    case "/":
                        result = a / b;
                        break;
                }

                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {

        String[] tokens = {"2", "3", "4", "*", "+"};

        int result = evaluatePostfix(tokens);

        System.out.println("Result: " + result);
    }
}
