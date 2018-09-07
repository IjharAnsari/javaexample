class Parent{
    Parent(){
        System.out.println("This is parent");
    }
}
public class Bizzare1{
    Bizzare1(){
        System.out.println("Hello Child");
    }
    public static void main(String... args){
        new Child();
    }
}