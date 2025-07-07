package Swing_ExamQ;

import javax.swing.*;

public class ExamSwing {

    public ExamSwing() {

        JFrame f = new JFrame("Exam Question");

        // Name
        JLabel l1 = new JLabel("Name");
        l1.setBounds(60, 30, 60, 20);
        JTextField t1 = new JTextField();
        t1.setBounds(130, 30, 120, 20);

        // Mobile
        JLabel l2 = new JLabel("Mobile");
        l2.setBounds(60, 60, 60, 20);
        JTextField t2 = new JTextField();
        t2.setBounds(130, 60, 120, 20);

        // Gender
        JLabel l3 = new JLabel("Gender");
        l3.setBounds(60, 90, 60, 20);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(130, 90, 70, 20);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(200, 90, 80, 20);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        // Date of Birth
        JLabel l4 = new JLabel("DOB");
        l4.setBounds(60, 120, 60, 20);

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        JComboBox<String> dayBox = new JComboBox<>(days);
        dayBox.setBounds(130, 120, 50, 20);

        String[] months = {
                "Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };
        JComboBox<String> monthBox = new JComboBox<>(months);
        monthBox.setBounds(185, 120, 60, 20);

        String[] years = new String[50];
        for (int i = 0; i < 50; i++) {
            years[i] = String.valueOf(1980 + i);
        }
        JComboBox<String> yearBox = new JComboBox<>(years);
        yearBox.setBounds(250, 120, 70, 20);

        // Submit Button
        JButton submit = new JButton("Submit");
        submit.setBounds(130, 160, 100, 30);

        // Add components to frame
        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(r1); f.add(r2);
        f.add(l4); f.add(dayBox); f.add(monthBox); f.add(yearBox);

        f.add(submit);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ExamSwing();
    }
}
