package Swing_ExamQ;

import javax.swing.*;

public class ExamSwing {

    public ExamSwing() {

        JFrame f = new JFrame("Exam Question");

        JLabel l1 = new JLabel("Name");
        l1.setBounds(60, 60, 60, 20);

        JTextField t1 = new JTextField();
        t1.setBounds(130, 60, 80, 20);

        JLabel l2 = new JLabel("Mobile");
        l2.setBounds(60, 90, 60, 20);

        JTextField t2 = new JTextField();
        t2.setBounds(130, 90, 80, 20);

        JLabel l3 = new JLabel("Gender");
        l3.setBounds(60, 120, 60, 20);

        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(130, 120, 70, 20);

        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(200, 120, 80, 20);

        // Group radio buttons (so only one can be selected at a time)
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(r1);
        f.add(r2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ExamSwing();
    }
}
