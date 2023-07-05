package Ezen_code.Cal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends JFrame {
    private JTextField textField;
    private JButton buttonAdd;
    private JButton buttonSubtract;
    private JButton buttonMultiply;
    private JButton buttonDivide;
    private JButton buttonEquals;
    private JLabel labelResult;

    Test() {
        setSize(400, 700);
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textField = new JTextField(10);
        textField.setFont(new Font("Arial", Font.PLAIN, 30)); // 글꼴 크기 수정
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(textField);
        add(topPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 10, 10));
        addButtonToPanel(buttonPanel, "7");
        addButtonToPanel(buttonPanel, "8");
        addButtonToPanel(buttonPanel, "9");
        addButtonToPanel(buttonPanel, "/");
        addButtonToPanel(buttonPanel, "4");
        addButtonToPanel(buttonPanel, "5");
        addButtonToPanel(buttonPanel, "6");
        addButtonToPanel(buttonPanel, "*");
        addButtonToPanel(buttonPanel, "1");
        addButtonToPanel(buttonPanel, "2");
        addButtonToPanel(buttonPanel, "3");
        addButtonToPanel(buttonPanel, "-");
        addButtonToPanel(buttonPanel, "0");
        addButtonToPanel(buttonPanel, ".");
        addButtonToPanel(buttonPanel, "+");
        buttonEquals = addButtonToPanel(buttonPanel, "=");
        add(buttonPanel, BorderLayout.CENTER);

        labelResult = new JLabel("Result:");
        labelResult.setFont(new Font("Arial", Font.PLAIN, 30)); // 글꼴 크기 수정
        add(labelResult, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JButton addButtonToPanel(JPanel panel, String text) {
        JButton button = new JButton(text);
        panel.add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String buttonText = button.getText();
                if (buttonText.equals("=")) {
                    calculate();
                } else {
                    textField.setText(textField.getText() + buttonText);
                }
            }
        });
        return button;
    }

    private void calculate() {
        try {
            String expression = textField.getText();
            double result = evaluateExpression(expression);
            labelResult.setText("Result: " + result);
        } catch (IllegalArgumentException ex) {
            labelResult.setText("Invalid expression");
        }
    }

    private double evaluateExpression(String expression) {
        // Remove whitespace
        expression = expression.replaceAll("\\s+", "");

        // Check for division by zero
        if (expression.contains("/0")) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }

        // Evaluate the expression using Java code
        try {
            return eval(expression);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid expression");
        }
    }

    private double eval(String expression) {
        // Split the expression into numbers and operators
        String[] tokens = expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
        double result = Double.parseDouble(tokens[0]);

        // Process the tokens
        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];
            double number = Double.parseDouble(tokens[i + 1]);

            // Perform the operation
            switch (operator) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    result /= number;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator: " + operator);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        new Test();
    }
}
