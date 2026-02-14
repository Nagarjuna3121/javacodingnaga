package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidateParanthesisArraydeQueue {
    public static void main(String[] args) {
        String s = "{()}";
        ValidateParanthesis matching =  new ValidateParanthesis();
        boolean isMatch = matching.isValid(s);
        System.out.println(isMatch);
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') stack.push(')');
            else if (ch == '{') stack.push('}');
            else if (ch == '[') stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() != ch)
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
