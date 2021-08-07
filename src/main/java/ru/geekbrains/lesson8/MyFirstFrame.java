package ru.geekbrains.lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFirstFrame {

    private final JFrame mainFrame;
    private JTextField textField;

    public MyFirstFrame(String title) {
        this.mainFrame = new JFrame(title);
        initMainFrame();

        mainFrame.setLayout(new BorderLayout());

        mainFrame.add(createTop(), BorderLayout.NORTH);
        mainFrame.add(createBottom(), BorderLayout.CENTER);
        mainFrame.add(arithmeticPanel(), BorderLayout.EAST);

        mainFrame.setVisible(true);
    }

    private JPanel createTop() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));

        textField = new JTextField();
        textField.setEditable(false);
        panel.add(textField);

        return panel;
    }

    private JPanel createBottom() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(textField);

        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(digitButtonActionListener);
            panel.add(btn);
        }

        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        panel.add(clearButton);

        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(doMath(textField.getText()));

            }
        });
        panel.add(equalsButton);

        return panel;
    }

    private JPanel arithmeticPanel(){

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        DigitButtonActionListener digitButtonActionListener = new DigitButtonActionListener(textField);

        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(digitButtonActionListener);
        panel.add(multiplyButton);

        JButton sumButton = new JButton("+");
        sumButton.addActionListener(digitButtonActionListener);
        panel.add(sumButton);

        JButton subtractionButton = new JButton("-");
        subtractionButton.addActionListener(digitButtonActionListener);
        panel.add(subtractionButton);

        JButton divisionButton = new JButton("/");
        divisionButton.addActionListener(digitButtonActionListener);
        panel.add(divisionButton);

        JButton sqrButton = new JButton("\u221A");
        sqrButton.addActionListener(digitButtonActionListener);
        panel.add(sqrButton);

        return panel;


    }

    private void initMainFrame() {
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Rectangle rectangle = new Rectangle(300, 500);
        mainFrame.setBounds(rectangle);
    }

    public MyFirstFrame() {
        this("My First Calculator v1.0");
    }

    public static String doMath(String calculation){

        char[] value = calculation.toCharArray();
        String a = "";
        String b = "";
        String action = "";
        double answer;

        for (int i = 0; i < value.length; i++){

            if(value[i] >= '0' && value[i] <= '9'){
                if (action.isEmpty()){
                    a += value[i];
                } else b += value[i];

            }

            if(value[i] == '+' || value[i] == '-' ||
            value[i] == '*' || value[i] == '/' || value[i] == '\u221A'){
                action += value[i];
            }
        }

        if (action.equals("+")){
            answer = Math.addExact(Integer.parseInt(a), Integer.parseInt(b));
        } else if (action.equals("-")) {
            answer = Math.subtractExact(Integer.parseInt(a), Integer.parseInt(b));
        } else if (action.equals("*")) {
            answer = Math.multiplyExact(Integer.parseInt(a), Integer.parseInt(b));
        } else if (action.equals("/")) {
            answer = Math.floorDiv(Integer.parseInt(a), Integer.parseInt(b));
        } else {
            if (a.isEmpty()) {
                answer = Math.sqrt(Double.parseDouble(b));
            } else answer = Math.sqrt(Double.parseDouble(a));
        }

        return Double.toString(answer);

    }

}
