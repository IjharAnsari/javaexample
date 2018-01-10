import java.awt.*;

class Calculator {
	Frame f;
	TextField tf;
	Button[] b=new Button[28];
	int a=0;
	int x=5;
	int y=5;
	String nm[][]={{"","","",""},{"","","",""},{"MC","MR","MS","M+"},{"<-","CE","C","M-"},{"+/-","RT","%","1/x"},{"7","8","9","/"},{"4","5","6","*"},{"1","2","3","-"},{"0",".","+","="}};
	public Calculator(String s){
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(10,10,280,80);
		f.add(tf);
		//count from 1
		for(int i=0; i<nm.length; i++){
			for(int j=0; j<nm[i].length; j++){
				b[a]=new Button(nm[i][j]);
				b[a].setBounds(x,y,70,50);
				f.add(b[a]);
				x=x+70;
			}
			x=5;
			y=y+50;
		}

		f.setLayout(null);
		f.setSize(300,460);
		f.setVisible(true);
	}//Only in 13 line :)
	public static void main(String... args){
		new Calculator("Calculator");	
	}
}
