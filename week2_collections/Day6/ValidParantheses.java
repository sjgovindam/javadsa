package week2_collections.Day6;


import java.util.Stack;

public class ValidParantheses {

    boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');

            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        ValidParantheses obj = new ValidParantheses();

        System.out.println(obj.isValid("()"));     // true
        System.out.println(obj.isValid("()[]{}")); // true
        System.out.println(obj.isValid("(]"));     // false
        System.out.println(obj.isValid("([)]"));   // false
        System.out.println(obj.isValid("{[]}"));   // true
    }
}
