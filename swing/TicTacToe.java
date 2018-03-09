import java.util.Random;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;


class JFrame1 implements ActionListener{
    JFrame f;
    JLabel jl;
    Color acolor=new Color(0x008080);
    Color bcolor=new Color(0xdddddd);
    JButton[] b=new JButton[9];
    int toggled=1;
    boolean gameWon=false;
    String strFlag[]=new String[9];
    int count=0;
    int x=5;
    int y=5;
    int flag1=0;
    int flag2=0;
    int flag3=0;
    int flag4=0;
    int flag5=0;
    int flag6=0;
    int flag7=0;
    int flag8=0;
    int flag9=0;
    JFrame1(String s){
        f=new JFrame(s);
        for(int i=0; i<b.length; i++){
            b[i]=new JButton();
            b[i].setBounds(x,y,70,50);
            x+=75;
            if(i==2 || i==5){
                System.out.println();
                y+=55;
                x=5;
            }
            b[i].setBackground(bcolor);
            b[i].setBorderPainted(false);
            b[i].addActionListener(this);
            f.add(b[i]);

            
        }
        jl=new JLabel();
        jl.setBounds(10,300, 400, 50);
        f.add(jl);
        f.setLayout(null);
        f.setSize(500,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b[0]){
           // b[0].setBackground(acolor);
            if(flag1==0){
                if(count==0){
                    b[0].setText("X");
                    strFlag[0]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[0].setText("O");
                    strFlag[0]="o";
                    toggled=-toggled;
                }else{
                    b[0].setText("X");
                    strFlag[0]="x";
                    toggled=-toggled; 
                }
            }
            flag1=1;
        }
        if(e.getSource()==b[1]){
            //b[1].setBackground(acolor);
            if(flag2==0){
                if(count==0){
                    b[1].setText("X");
                    strFlag[1]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[1].setText("O");
                    strFlag[1]="o";
                    toggled=-toggled;
                }else{
                    b[1].setText("X");
                    strFlag[1]="x";
                    toggled=-toggled; 
                }
            }
            flag2=1;
        }
        if(e.getSource()==b[2]){
            //b[2].setBackground(acolor);
            if(flag3==0){
                if(count==0){
                    b[2].setText("X");
                    strFlag[2]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[2].setText("O");
                    strFlag[2]="o";
                    toggled=-toggled;
                }else{
                    b[2].setText("X");
                    strFlag[2]="x";
                    toggled=-toggled; 
                }
            }
            flag3=1;
        }
        if(e.getSource()==b[3]){
            //b[1].setBackground(acolor);
            if(flag4==0){
                if(count==0){
                    b[3].setText("X");
                    strFlag[3]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[3].setText("O");
                    strFlag[3]="o";
                    toggled=-toggled;
                }else{
                    b[3].setText("X");
                    strFlag[3]="x";
                    toggled=-toggled; 
                }
            }
            flag4=1;
        }
        if(e.getSource()==b[4]){
            //b[1].setBackground(acolor);
            if(flag5==0){
                if(count==0){
                    b[4].setText("X");
                    strFlag[4]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[4].setText("O");
                    strFlag[4]="o";
                    toggled=-toggled;
                }else{
                    b[4].setText("X");
                    strFlag[4]="x";
                    toggled=-toggled; 
                }
            }
            flag5=1;
        }
        if(e.getSource()==b[5]){
            //b[1].setBackground(acolor);
            if(flag6==0){
                if(count==0){
                    b[5].setText("X");
                    strFlag[5]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[5].setText("O");
                    strFlag[5]="o";
                    toggled=-toggled;
                }else{
                    b[5].setText("X");
                    strFlag[5]="x";
                    toggled=-toggled; 
                }
            }
            flag6=1;
        }
        if(e.getSource()==b[6]){
            //b[1].setBackground(acolor);
            if(flag7==0){
                if(count==0){
                    b[6].setText("X");
                    strFlag[6]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[6].setText("O");
                    strFlag[6]="o";
                    toggled=-toggled;
                }else{
                    b[6].setText("X");
                    strFlag[6]="x";
                    toggled=-toggled; 
                }
            }
            flag7=1;
        }
        if(e.getSource()==b[7]){
            //b[1].setBackground(acolor);
            if(flag8==0){
                if(count==0){
                    b[7].setText("X");
                    strFlag[7]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[7].setText("O");
                    strFlag[7]="o";
                    toggled=-toggled;
                }else{
                    b[7].setText("X");
                    strFlag[7]="x";
                    toggled=-toggled; 
                }
            }
            flag8=1;
        }
        if(e.getSource()==b[8]){
            //b[8].setBackground(acolor);
            if(flag9==0){
                if(count==0){
                    b[8].setText("X");
                    strFlag[8]="x";
                    toggled=-toggled;
                    count+=1;
                }else if(count!=0 && toggled==-1){
                    b[8].setText("O");
                    strFlag[8]="o";
                    toggled=-toggled;
                }else{
                    b[8].setText("X");
                    strFlag[8]="x";
                    toggled=-toggled; 
                }
            }
            flag9=1;
        }

        //logic for winning
        //first row
        if(flag1==1 && flag2==1 && flag3==1){
            if((strFlag[0]=="x" && strFlag[1]=="x" && strFlag[2]=="x") || (strFlag[0]=="o" && strFlag[1]=="o" && strFlag[2]=="o")){
                jl.setText("You won");
                b[0].setBackground(acolor);
                b[1].setBackground(acolor);
                b[2].setBackground(acolor);
                gameWon=true;
            }
        }
        //third row
        if(flag7==1 && flag8==1 && flag9==1){
            if((strFlag[6]=="x" && strFlag[7]=="x" && strFlag[8]=="x")|| (strFlag[6]=="o" && strFlag[7]=="o" && strFlag[8]=="o")){
                jl.setText("You won");
                b[6].setBackground(acolor);
                b[7].setBackground(acolor);
                b[8].setBackground(acolor);
                gameWon=true;
            }
        }
        //second row
        if(flag4==1 && flag5==1 && flag5==1){
            if((strFlag[3]=="x" && strFlag[4]=="x" && strFlag[5]=="x")|| (strFlag[3]=="o" && strFlag[4]=="o" && strFlag[5]=="o")){
                jl.setText("You won");
                b[3].setBackground(acolor);
                b[4].setBackground(acolor);
                b[5].setBackground(acolor);
                gameWon=true;
            }
        }

        //first column
        if(flag1==1 && flag4==1 && flag7==1){
            if((strFlag[0]=="x" && strFlag[3]=="x" && strFlag[6]=="x")|| (strFlag[0]=="o" && strFlag[3]=="o" && strFlag[6]=="o")){
                jl.setText("You won");
                b[0].setBackground(acolor);
                b[3].setBackground(acolor);
                b[6].setBackground(acolor);
                gameWon=true;
            }
        }
        //second column
        if(flag2==1 && flag5==1 && flag8==1){
            if((strFlag[1]=="x" && strFlag[4]=="x" && strFlag[7]=="x")|| (strFlag[1]=="o" && strFlag[4]=="o" && strFlag[7]=="o")){
                jl.setText("You won");
                b[1].setBackground(acolor);
                b[4].setBackground(acolor);
                b[7].setBackground(acolor);
                gameWon=true;
            }
        }
        //third column
        if(flag3==1 && flag6==1 && flag9==1){
            if((strFlag[2]=="x" && strFlag[5]=="x" && strFlag[8]=="x")|| (strFlag[2]=="o" && strFlag[5]=="o" && strFlag[8]=="o")){
                jl.setText("You won");
                b[2].setBackground(acolor);
                b[5].setBackground(acolor);
                b[8].setBackground(acolor);
                gameWon=true;
            }
        }

        //diagonal 1
        if(flag1==1 && flag5==1 && flag9==1){
            if((strFlag[0]=="x" && strFlag[4]=="x" && strFlag[8]=="x")|| (strFlag[0]=="o" && strFlag[4]=="o" && strFlag[8]=="o")){
                jl.setText("You won");
                b[0].setBackground(acolor);
                b[4].setBackground(acolor);
                b[8].setBackground(acolor);
                gameWon=true;
            }
        }
        //diagonal 2
        if(flag3==1 && flag5==1 && flag7==1){
            if((strFlag[2]=="x" && strFlag[4]=="x" && strFlag[6]=="x")|| (strFlag[2]=="o" && strFlag[4]=="o" && strFlag[6]=="o")){
                jl.setText("You won");
                b[2].setBackground(acolor);
                b[4].setBackground(acolor);
                b[6].setBackground(acolor);
                gameWon=true;
            }
        }
        
        
    }
    public static void main(String... args){
        new JFrame1("Ijhar ansari");
    }
}
