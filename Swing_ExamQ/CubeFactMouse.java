package Swing_ExamQ;

import javax.swing.*;
import java.awt.event.*;

public class CubeFactMouse {
    public CubeFactMouse() {
        JFrame f = new JFrame("Cube on Press & Factorial on Release");

        JLabel l1 = new JLabel("Enter Number:");
        l1.setBounds(60, 50, 100, 30);

        JTextField f1 = new JTextField();
        f1.setBounds(160, 50, 100, 30);

        JButton btn = new JButton("Press & Release");
        btn.setBounds(100, 100, 150, 30);

        JLabel resultLabel = new JLabel("Result will be shown here");
        resultLabel.setBounds(60, 150, 300, 30);

        f.add(l1);
        f.add(f1);
        f.add(btn);
        f.add(resultLabel);

        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                try {
                    int num = Integer.parseInt(f1.getText());
                    int cube = num * num * num;
                    resultLabel.setText("Cube: " + cube);
                } catch (Exception ex) {
                    resultLabel.setText("Please enter a valid number");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                try {
                    int num = Integer.parseInt(f1.getText());
                    if (num < 0) {
                        resultLabel.setText("Factorial not defined for negative numbers");
                        return;
                    }
                    long fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    resultLabel.setText("Factorial: " + fact);
                } catch (Exception ex) {
                    resultLabel.setText("Please enter a valid number");
                }
            }
        });
    }
    // the name is chingam and chingam k changul se bachna yam possible boleto yam possible

    public static void main(String[] args) {
        new CubeFactMouse();
    }
}
