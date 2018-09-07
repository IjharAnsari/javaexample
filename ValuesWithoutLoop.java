public class ValuesWithoutLoop{
    int a=0;
    public void printValues(){
        a++;
        
        if(a<101){
            System.out.print(" "+a);
            printValues();
        }
    }
    public static void main(String... args){
        ValuesWithoutLoop a1=new ValuesWithoutLoop();
        a1.printValues();
    }
}