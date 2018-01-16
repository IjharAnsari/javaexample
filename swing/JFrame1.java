import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrame1 implements ActionListener{
    JFrame f;
    JButton b;
    JTextField tf;

    JFrame1(String s){
        f=new JFrame(s);
        tf=new JTextField();
        tf.setBounds(10,20,380,100);
        tf.setEditable(false);
        f.add(tf);
        b=new JButton("Click Ok");
        b.setBounds(150,150,100,50);
        
        b.setBackground(Color.red);
        b.setBorder(null);
        f.add(b);
        b.addActionListener(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        tf.setText("You clicked the button");
    }
    public static void main(String... args){
        new JFrame1("Hello Ij");
    }
}
