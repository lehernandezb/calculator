package ca.ucalagry.luis.hernandez1.calc.objects;

import java.util.*;

public class Calculator {

    // Define operator precedence
    private static final Map<String, Integer> precedence = Map.of(
            "+", 1,
            "-", 1,
            "x", 2,
            "÷", 2
    );

    public static double calculate(List<Character> input) {
        // 1. Tokenize input into numbers (including decimals) and operators
        List<String> tokens = tokenize(input);

        // 2. Convert infix tokens to postfix (RPN) using Shunting Yard
        List<String> postfix = infixToPostfix(tokens);

        // 3. Evaluate the postfix expression
        return evaluatePostfix(postfix);
    }

    private static List<String> tokenize(List<Character> input) {
        List<String> tokens = new ArrayList<>();
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < input.size(); i++) {
            char c = input.get(i);

            if (Character.isDigit(c) || c == '.') {
                // Build number string (handle decimals)
                number.append(c);
            } else if (c == '-' && (i == 0 || input.get(i - 1) == '(' || isOperator(input.get(i - 1)))) {
                // Handle negative numbers (unary minus)
                number.append(c);
            } else {
                // Flush any built number
                if (number.length() > 0) {
                    tokens.add(number.toString());
                    number.setLength(0);
                }
                if (c != ' ') {
                    tokens.add(String.valueOf(c));
                }
            }
        }
        // Flush last number
        if (number.length() > 0) {
            tokens.add(number.toString());
        }
        return tokens;
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == 'x' || c == '÷';
    }

    private static boolean isOperator(String token) {
        return precedence.containsKey(token);
    }

    private static List<String> infixToPostfix(List<String> tokens) {
        List<String> output = new ArrayList<>();
        Deque<String> stack = new ArrayDeque<>();

        for (String token : tokens) {
            if (isNumber(token)) {
                output.add(token);
            } else if (token.equals("(")) {
                stack.push(token);
            } else if (token.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    output.add(stack.pop());
                }
                stack.pop(); // Remove '('
            } else if (isOperator(token)) {
                while (!stack.isEmpty() && isOperator(stack.peek())
                        && precedence.get(token) <= precedence.get(stack.peek())) {
                    output.add(stack.pop());
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) {
            output.add(stack.pop());
        }

        return output;
    }

    private static boolean isNumber(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static double evaluatePostfix(List<String> postfix) {
        Deque<Double> stack = new ArrayDeque<>();

        for (String token : postfix) {
            if (isNumber(token)) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();

                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "x" -> stack.push(a * b);
                    case "÷" -> stack.push(a / b);
                    default -> throw new IllegalArgumentException("Unknown operator: " + token);
                }
            }
        }

        return stack.pop();
    }
}
