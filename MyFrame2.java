import java.awt.*;

public class MyFrame{
	Frame f;
	TextField tf;
	Button b1;
	MyFrame(String s){
		f=new Frame(s);
		tf=new TextField("0");
		tf.setBounds(5,5,390, 100);
		f.add(tf);

		b1=new Button("Click me");
		b1.setBounds(175, 175, 100,50);
		f.add(b1);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String... args){
		new MyFrame("Ijhar ansari");	
	}
}
