import java.util.*;

class FrequencyCount{
    public static void frequencyCount(int x[]){
        int count=0;
        int cnt=0;
        Arrays.sort(x);
        for(int i:x){
            System.out.print(i+" ");
        }
        for(int i=0; i<x.length; i++){
            for(int j=i; j<x.length; j++){
                if(x[i]==x[j]){
                    count++;
                    cnt++;
                }
            }
            System.out.println(x[i]+" ="+count+" times");
            i=cnt;
            count=0;
        }
    }
        public static void main(String... args){
            frequencyCount(new int[]{1,1,1,2,3,2,3,1,2,3,4,4,4,5,6,5,6,5,6,10,10,11,11,12,10,10,12,12});
        }
}
