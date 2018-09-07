import javax.swing.JButton;
import javax.swing.*;

class Jframe1 extends JFrame {

    Jframe1(){
        JButton b1=new JButton("Click me");
        b1.setBounds(100, 100, 150,50);
        add(b1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String... args){
        new Jframe1();
    }

}