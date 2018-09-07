public class Test{
    public static void main(String... args){
        String s="Ijhar ansari";
        String s1=new String("Ijhar ansari");
        String s2=new String("Ijhar ansari");
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.hashCode());

    }
}
/*class Test{
    int Test(){
        return 10;
    }
    public static void main(String... args){}
}
/*import java.lang.reflect.Constructor;
public class Test{
    private String name;
    public void setName(String name){
        this.name=name;
    }

    //main
    public static void main(String... args){
        try{
            Constructor<Test> con=Test.class.getDeclaredConstructor();
            Test t1=con.newInstance();
            t1.setName("Ijhar ansari guru");
            System.out.println(t1.name);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/*public class Test{
    String a="Ijhar ansari";
    public static void main(String... args){
        try{
            Class cls=Class.forName("ValuesWithoutLoop");
            Test t=(Test)cls.newInstance();
            System.out.println(t.printValues());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/*class Test{
    static{
        System.out.println("Hello Static block");
    }
}
/*class Test{
    String a="Hello";
    public void main(){
        System.out.println("Hello this is main by ij");
    }
    public static void main(String... args){
        Test ab=new Test();
        ab.main();
        System.out.println(ab.a);
    }
}
/**class Test{
    public static void main(String... args){
        StringBuffer s=new StringBuffer();
        s.append("Ijhar");
        s.append("Ansari");
        System.out.println(s);
    }
}
public class Test{
    int roll;
    String name;
    int age;
    Test(int r, String name, int age){
        this.roll=r;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return roll+name+age;
    }
    public static void main(String... args){
        Test a=new Test(10,"Ijhar",22);
        Test a1=new Test(11,"Tabrez", 23);
        System.out.println(a);
        System.out.println(a1);
    }
}*/