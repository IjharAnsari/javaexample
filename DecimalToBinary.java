import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**@author Ijhar ansari
 * @since 2018
 * this program convert decimal to binary
 */
public class DecimalToBinary{
    static int a;
    public static void getDecimalToBinary(int dec){
        ArrayList<Integer> arrList=new ArrayList<>();
        while(dec!=0){
            a=dec% 2;
            dec=dec/2;
            arrList.add(a); 
        }
        Collections.reverse(arrList);
        for(Integer s:arrList){
            System.out.print(s);
        }
        System.out.print("\n");
    }
    public static void main(String... args){
        getDecimalToBinary(500);
    }
}