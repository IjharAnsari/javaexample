interface Add{
    public int getAddition(int a, int b);
}
class AddInterface1 implements Add{
    public int getAddition(int a, int b){
        return (a+b);
    }
}
public class AddInterface{
    public static void main(String... args){
        Add e=new AddInterface1();
        System.out.println(e.getAddition(20,10));
    }
}
