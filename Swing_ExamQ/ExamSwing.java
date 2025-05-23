package Swing_ExamQ;
import javax.management.modelmbean.ModelMBeanInfo;
import javax.swing.*;

public class ExamSwing {

    public ExamSwing()
    {

        JFrame f = new JFrame("Exam Question");


        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);

        JLabel l1 = new JLabel("Name");
        l1.setBounds(60,60,60,20);

        JTextField t1 = new JTextField();
        t1.setBounds(130,60,80,20);

        JLabel l2 = new JLabel("Mobile");
        l2.setBounds(60,90,60,20);

        JTextField t2 = new JTextField();
        t2.setBounds(130,90,80,20);

        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    public static void main(String[] args) {
        new ExamSwing();
    }
}
