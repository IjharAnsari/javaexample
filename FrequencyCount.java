/**This program counts frequency
 * without sorting array
 * 
 */
class FrequencyCount{
    public static void getFrequencyCount(int []a){
        int count=1;
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                for(int j=i+1; j<a.length; j++){
                    if(a[i]==a[j]){
                        count++;
                        a[j]=0;
                    }
                }
                System.out.println(a[i]+" "+count+" times");
                a[i]=0;
                count=1;
            }
        }
    }
    public static void main(String... args){
        getFrequencyCount(new int[]{1,2,5,1,1,4,5,4,7,4,5,6,6,6,6});
    }
}