package org.example;

import java.util.Stack;


public class ValidateParanthesis {
    public boolean isValid(String s) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();
        // Loop through the characters in the string
        for (char c : s.toCharArray()) {
            // Push opening brackets onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                // If the stack is empty or doesn't match, return false
                if (stack.isEmpty()
                        ||(c == ')' && stack.pop() != '(')
                        || (c == '}' && stack.pop() != '{')
                        ||(c == ']' && stack.pop() != '[')) {
                    return false;
                }
            }
        }
        // Return true if the stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}])";
        ValidateParanthesis matching =  new ValidateParanthesis();
        boolean isMatch = matching.isValid(s);
        System.out.println(isMatch);
    }
}

//i/p : "([{}])", o/p : true
//i/p : "({)", o/p : false
