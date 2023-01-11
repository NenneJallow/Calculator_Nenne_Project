import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    // Declare text field and buttons
    private JTextField display = new JTextField();
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");
    private JButton btn0 = new JButton("0");
    private JButton btnPlus = new JButton("+");
    private JButton btnMinus = new JButton("-");
    private JButton btnMultiply = new JButton("*");
    private JButton btnDivide = new JButton("/");
    private JButton btnEquals = new JButton("=");
    private JButton btnClear = new JButton("C");

    // Declare variables to store operands and the operator
    private double operand1 = 0;
    private double operand2 = 0;
    private String operator = "";

    public Calculator() {
        // Set up the display
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setPreferredSize(new Dimension(225, 40));
        add(display, BorderLayout.NORTH);

        // Create a panel to hold the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Add the buttons to the panel
        buttonPanel.add(btn7);
        buttonPanel.add(btn8);
        buttonPanel.add(btn9);
        buttonPanel.add(btnPlus);
        buttonPanel.add(btn4);
        buttonPanel.add(btn5);
        buttonPanel.add(btn6);
        buttonPanel.add(btnMinus);
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        buttonPanel.add(btn3);
        buttonPanel.add(btnMultiply);
        buttonPanel.add(btnClear);
        buttonPanel.add(btn0);
        buttonPanel.add(btnEquals);
        buttonPanel.add(btnDivide);

        // Add the button panel to the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Register the action listener for the buttons
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btn0.addActionListener(this);
        btnPlus.addActionListener(this);
        btnMinus.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnEquals.addActionListener(this);
        btnClear.addActionListener(this);

        // Set the default close operation and pack the frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        // Handle button clicks for digits
        if (source == btn1) {
            display.setText(display.getText() + "1");
        } else if (source == btn2) {
            display.setText(display.getText() + "2");
        } else if (source == btn3) {
            display.setText(display.getText() + "3");
        } else if (source == btn4) {
            display.setText(display.getText() + "4");
        } else if (source == btn5) {
            display.setText(display.getText() + "5");
        } else if (source == btn6) {
            display.setText(display.getText() + "6");
        } else if (source == btn7) {
            display.setText(display.getText() + "7");
        } else if (source == btn8) {
            display.setText(display.getText() + "8");
        } else if (source == btn9) {
            display.setText(display.getText() + "9");
        } else if (source == btn0) {
            display.setText(display.getText() + "0");
        }

        // Handle button clicks for operators
        else if (source == btnPlus) {
            operand1 = Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        } else if (source == btnMinus) {
            operand1 = Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        } else if (source == btnMultiply) {
            operand1 = Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        } else if (source == btnDivide) {
            operand1 = Double.parseDouble(display.getText());
            operator = "/";
            display.setText("");
        }

        // Handle the equals button
        else if (source == btnEquals) {
            operand2 = Double.parseDouble(display.getText());

            if (operator.equals("+")) {
                double result = operand1 + operand2;
                display.setText(String.valueOf(result));
            } else if (operator.equals("-")) {
                double result = operand1 - operand2;
                display.setText(String.valueOf(result));
            } else if (operator.equals("*")) {
                double result = operand1 * operand2;
                display.setText(String.valueOf(result));
            } else if (operator.equals("/")) {
                double result = operand1 / operand2;
                display.setText(String.valueOf(result));
            }
        }

        // Handle the clear button
        else if (source == btnClear) {
            operand1 = 0;
            operand2 = 0;
            operator = "";
            display.setText("");
        }
    }

    public static void main(String[] args) {
        // Run the calculator
        Calculator calculator = new Calculator();
        calculator.setVisible(true);
    }
}


