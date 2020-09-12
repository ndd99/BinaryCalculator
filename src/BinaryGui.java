import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class BinaryGui extends JPanel {

    public BinaryGui() {
        //construct components
        JButton binary0 = new JButton("0");
        JButton binary1 = new JButton("1");
        JButton convertD = new JButton("ConvertD");
        JButton convertB = new JButton("ConvertB");
        JLabel title = new JLabel("Binary Calculator");
        JTextField display = new JTextField(10);
        JTextField display2 = new JTextField(10);
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton times = new JButton("X");
        JButton divide = new JButton("÷");
        JButton sqrt = new JButton("√");
        JButton exponent = new JButton("x²");
        JButton equals = new JButton("=");
        JButton backspace = new JButton("<---");
        JButton clear = new JButton("Clear");

        //adjust size and set layout
        setPreferredSize (new Dimension (200, 300));
        setLayout (null);

        //add components
        add (binary0);
        add (binary1);
        add (convertD);
        add (convertB);
        add (title);
        add (display);
        add (display2);
        add (plus);
        add (minus);
        add (times);
        add (divide);
        add (sqrt);
        add (exponent);
        add (equals);
        add (clear);
        add(backspace);

        //set component bounds (only needed by Absolute Positioning)
        binary0.setBounds (25, 120, 50, 25);
        binary1.setBounds (85, 120, 50, 25);
        convertD.setBounds (15, 215, 90, 25);
        convertB.setBounds (105, 215, 90, 25);
        title.setBounds (60, 5, 100, 25);
        display.setBounds (60, 30, 100, 25);
        display2.setBounds (60, 90, 100, 25);
        plus.setBounds (25, 150, 50, 25);
        minus.setBounds (85, 150, 50, 25);
        times.setBounds (25, 180, 50, 25);
        divide.setBounds (85, 180, 50, 25);
        sqrt.setBounds (145, 120, 50, 25);
        exponent.setBounds (145, 150, 50, 25);
        equals.setBounds (145, 180, 50, 25);
        clear.setBounds (15, 250, 90, 25);
        backspace.setBounds (105, 250, 90, 25);

        //Action Listeners
        binary0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText(display.getText()+"0");
            }
        });
        binary1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText(display.getText()+"1");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText(display.getText()+" + ");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText(display.getText()+" - ");
            }
        });
        times.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText(display.getText()+" X ");
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display.setText(display.getText()+" ÷ ");
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String contents = display.getText();
                String[] arrOfConts = contents.split(" ");
                if (Objects.equals(arrOfConts[1], "+")){
                    int Num1=((BinaryCalcLogic.toDecimal(arrOfConts [0])));
                    int Num2=((BinaryCalcLogic.toDecimal(arrOfConts [2])));
                    display2.setText(BinaryCalcLogic.toBinary(BinaryCalcLogic.addition(Num1, Num2)));
                }
                else if (Objects.equals(arrOfConts[1], "-")){
                    int Num1=((BinaryCalcLogic.toDecimal(arrOfConts [0])));
                    int Num2=((BinaryCalcLogic.toDecimal(arrOfConts [2])));
                    display2.setText(Integer.toString(BinaryCalcLogic.subtraction(Num1, Num2)));
                }
                else if (Objects.equals(arrOfConts[1], "X")){
                    int Num1=((BinaryCalcLogic.toDecimal(arrOfConts [0])));
                    int Num2=((BinaryCalcLogic.toDecimal(arrOfConts [2])));
                    display2.setText(Integer.toString(BinaryCalcLogic.multiplication(Num1, Num2)));
                }
                else if (Objects.equals(arrOfConts[1], "÷")){
                    int Num1=((BinaryCalcLogic.toDecimal(arrOfConts [0])));
                    int Num2=((BinaryCalcLogic.toDecimal(arrOfConts [2])));
                    display2.setText(Integer.toString(BinaryCalcLogic.division(Num1, Num2)));
                }

            }
        });
        convertD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String contents = display2.getText();
                display2.setText(Integer.toString(BinaryCalcLogic.toDecimal(contents)));
            }
        });
        convertB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String contents = display2.getText();
                int i=Integer.parseInt(contents);
                display2.setText(BinaryCalcLogic.toBinary(i));
            }
        });
        exponent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String contents = display.getText();
                int i= BinaryCalcLogic.square(BinaryCalcLogic.toDecimal(contents));
                display2.setText(BinaryCalcLogic.toBinary(i));
            }
        });
        sqrt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String contents = display.getText();
                int i= BinaryCalcLogic.squareRoot(BinaryCalcLogic.toDecimal(contents));
                display.setText(BinaryCalcLogic.toBinary(i));
            }
        });
        backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String contents = display.getText();
                display.setText(contents.substring(0,contents.length()-1));
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                display2.setText("");
                display.setText("");
            }
        });

    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Binary Calculator");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new BinaryGui());
        frame.pack();
        frame.setVisible (true);
    }
}