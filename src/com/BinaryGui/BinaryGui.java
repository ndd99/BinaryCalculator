package com.BinaryGui;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class BinaryGui extends JPanel {

    public BinaryGui() {
        //construct components
        JButton binary0 = new JButton("0");
        JButton binary1 = new JButton("1");
        JButton convert = new JButton("Convert");
        JLabel jcomp4 = new JLabel("Binary Calculator");
        JTextField jcomp5 = new JTextField(10);
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton times = new JButton("X");
        JButton divide = new JButton("÷");
        JButton sqrt = new JButton("√");
        JButton exponent = new JButton("x²");
        JButton equals = new JButton("=");

        //adjust size and set layout
        setPreferredSize (new Dimension (200, 200));
        setLayout (null);

        //add components
        add (binary0);
        add (binary1);
        add (convert);
        add (jcomp4);
        add (jcomp5);
        add (plus);
        add (minus);
        add (times);
        add (divide);
        add (sqrt);
        add (exponent);
        add (equals);

        //set component bounds (only needed by Absolute Positioning)
        binary0.setBounds (25, 60, 50, 25);
        binary1.setBounds (85, 60, 50, 25);
        convert.setBounds (60, 155, 95, 25);
        jcomp4.setBounds (60, 5, 100, 25);
        jcomp5.setBounds (60, 30, 100, 25);
        plus.setBounds (25, 90, 50, 25);
        minus.setBounds (85, 90, 50, 25);
        times.setBounds (25, 120, 50, 25);
        divide.setBounds (85, 120, 50, 25);
        sqrt.setBounds (145, 60, 50, 25);
        exponent.setBounds (145, 90, 50, 25);
        equals.setBounds (145, 120, 50, 25);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Binary Calculator");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new BinaryGui());
        frame.pack();
        frame.setVisible (true);
    }
}