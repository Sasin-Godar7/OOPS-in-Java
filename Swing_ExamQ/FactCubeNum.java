package Swing_ExamQ;

import javax.swing.*;
import java.awt.event.*;

public class FactCubeNum {
    public FactCubeNum() {
        JFrame f = new JFrame("Cube & Factorial");

        JLabel l1 = new JLabel("Enter Number:");
        l1.setBounds(60, 50, 100, 30);

        JTextField f1 = new JTextField();
        f1.setBounds(160, 50, 100, 30);

        JButton cubeBtn = new JButton("Cube");
        cubeBtn.setBounds(60, 100, 80, 30);

        JButton factBtn = new JButton("Factorial");
        factBtn.setBounds(160, 100, 100, 30);

        JLabel resultLabel = new JLabel("Result will be shown here");
        resultLabel.setBounds(60, 150, 250, 30);

        f.add(l1);
        f.add(f1);
        f.add(cubeBtn);
        f.add(factBtn);
        f.add(resultLabel);

        f.setSize(350, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cube Button Action
        cubeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int num = Integer.parseInt(f1.getText());
                    int cube = num * num * num;
                    resultLabel.setText("Cube: " + cube);
                } catch (Exception e) {
                    resultLabel.setText("Please enter a valid number");
                }
            }
        });

        // Factorial Button Action
        factBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               try {
                   int num = Integer.parseInt(f1.getText());

                   if(num<=0)
                   {
                       resultLabel.setText("factorial is not set for the number less rgan zero");
                   }
                   int fact =1;
                   for(int i=1;i<=num ; i++)
                   {
                       fact = fact * i;
                   }

                   resultLabel.setText("the factorial of " + num + " " + "is" + " " + fact );

               }catch (Exception ex)
               {
                   resultLabel.setText("erroor occur !!!!!");
               }
            }
        });
    }

    public static void main(String[] args) {
        new FactCubeNum();
    }
}
