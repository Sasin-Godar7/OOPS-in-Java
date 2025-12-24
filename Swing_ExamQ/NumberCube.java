package Swing_ExamQ;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


  public class NumberCube {
     public NumberCube()
     {
         JFrame f = new JFrame("Odd and Even");

         JLabel l1 = new JLabel("Number");
         l1.setBounds(60, 60, 100, 20);

         JTextField f1 = new JTextField();
         f1.setBounds(160, 60, 100, 30);


         JButton jb = new JButton("Check");
         jb.setBounds(160, 100, 80, 30);

         JLabel resultLabel = new JLabel("Result will be shown here");
         resultLabel.setBounds(50, 150, 250, 30);

         f.add(l1);
         f.add(f1);
         f.add(jb);
         f.add(resultLabel);
         f.setSize(400, 300);
         f.setLayout(null);
         f.setVisible(true);
         f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         jb.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                 try {
                     int num = Integer.parseInt(f1.getText());

                     int cube = num * num * num;

                     resultLabel.setText("the cube of the number is " + cube);

                 } catch (Exception e) {
                     resultLabel.setText("Please enter a valid number");
                 }
             }
         });



     }

     public static void main(String[] args) {
           new NumberCube();
     }


}
