import java.awt.*;

public class MyFrame{
	Frame f;
	MyFrame(String s){
		f=new Frame(s);
		f.setSize(800,200);
		f.setVisible(true);
	}
	public static void main(String... args){
	new MyFrame("Ijhar ansari");
	new MyFrame("iJ");
}
}
