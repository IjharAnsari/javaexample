/**
 * programs for fibonacii series
 */
class Fib{
    int a;
    int b;
    int c;
    Fib(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void fibonacii(){
        c=a+b;
        
        System.out.println(c);
        a=b;
        b=c;
        if(b<150){
            fibonacii();
        }
        //fibonacii();
    }
}
public class Fibonacii{
    public static void main(String... args){
        System.out.println("0");
        new Fib(0,1).fibonacii();
    }
}