class FactInitialization{
    int a;
    int b;
    FactInitialization(int a, int b){
        this.a=a;
        this.b=b;
    }
    void factor(){
        a=a*b;
        b++;
        if(b<=10){
            factor();
        }
    }
    void showFactor(){
        System.out.println(a);
    }
}
public class Factorial{
    public static void main(String... args){
       
        FactInitialization aa=new FactInitialization(1, 2);
        aa.factor();
        aa.showFactor();
    }
}