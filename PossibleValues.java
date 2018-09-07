public class PossibleValues{
    public static void main(String... args){
        String alp[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int a=123;
        int eql=0;
        int eql1=0;
        String s=""+a;
        char ab[]=s.toCharArray();
        for(int i=0; i<ab.length; i++){
            Integer i2=Integer.valueOf(ab[i]);
            int i12=Character.getNumericValue(i2);
            if(i12!=eql1){
                System.out.print(alp[i12-1]+ " ");
                eql1=i12;
            }      
        }
        for(int i=0; i<ab.length; i++){
            for(int j=0; j<ab.length; j++){
                if(i!=j){
                    String s1=ab[i]+""+ab[j];
                    Integer i1=Integer.valueOf(s1);
                    if(i1<27 && i1!=eql){
                        System.out.print(alp[i1-1]);
                        System.out.print(" ");
                        eql=i1;
                    }
                    
                }
            }
        }
    }
}